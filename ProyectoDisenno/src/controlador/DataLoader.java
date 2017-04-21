package controlador;

import controlador.dto.DTOofertaAcademica;
import datos.CreditosEnum;
import datos.Curso;
import datos.Docente;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jxl.Cell;
import com.my.GoogleForms;
import controlador.dao.DAOsolicitudes;
import datos.EstadoEnum;
import datos.Estudiante;
import datos.FechaHora;
import datos.Grupo;
import datos.Periodo;
import datos.DTOSolicitud;
import datos.InconsistenciaEnum;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class DataLoader {

    public ArrayList<DTOSolicitud> cargaInicialSolicitudes() {
        try {
            FileInputStream fileInputStream = new FileInputStream(ConfigurationPaths.getInstance().getPathSolicitudesLocal());
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<DTOSolicitud> solicitudesLocales = new ArrayList<>();            
            boolean cont = true;
            while (cont) {
                try{
                DTOSolicitud solicitud = (DTOSolicitud) objectInputStream.readObject();
                
                if (solicitud != null) {
                    solicitudesLocales.add(solicitud);
                } else {
                    cont = false;
                }
                }catch(Exception ex)
                {
                    break;
                }                
            }
                                    
            fileInputStream.close();
            objectInputStream.close();
            
            ArrayList<DTOSolicitud> solicitudesNuevas = cargarSolicitudesGoogle();            
            for (DTOSolicitud solicitudGoogle : solicitudesNuevas) {                
                boolean existe = false;
                for (DTOSolicitud solicitudLocal : solicitudesLocales) {
                    if (solicitudLocal.getCodigo().equals(solicitudGoogle.getCodigo())) {
                        existe = true;
                    }
                }
                if (!existe) {
                    solicitudesLocales.add(solicitudGoogle);
                } 
            } 
            
            
            
            DAOsolicitudes dao = new DAOsolicitudes();
            dao.salvarSolicitudesLocal(solicitudesLocales);
            return solicitudesLocales;

        } catch (Exception ex) {
            System.out.println("Data Loader " + ex.getMessage());
            return null;
        }
    }

    public ArrayList<DTOSolicitud> cargarSolicitudesGoogle() {
                
        String hojaID = ConfigurationPaths.getInstance().getPathGoogleDriveExcel();
        String hojaFormato = ConfigurationPaths.getInstance().getFormatoGoogleDriveExcel();
         GoogleForms forms = new GoogleForms(hojaID, hojaFormato, "APP");         
        List<List<Object>> values = forms.getResponse().getValues();
        ArrayList<DTOSolicitud> solicitudes = new ArrayList<>();
        
        if (values == null || values.size() == 0) {
            System.out.println("No data found.");
        } else {
            values.forEach((row) -> {
                try {
                    String fechaExcel = String.valueOf(row.get(0));//.replace("/", "-");   
                    String fecha = fechaExcel.split("\\s+")[0];
                    String tiempo = fechaExcel.split("\\s+")[1];                    
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Date fechaDate = (Date) df.parse(fecha);
                    FechaHora fechaHora = new FechaHora(fechaDate, tiempo);
                    String idSolicitante = String.valueOf(row.get(1));
                    String nombreSolicitante = String.valueOf(row.get(2));
                    String carnetEstudiante = String.valueOf(row.get(3));
                    String nombreEstudiante = String.valueOf(row.get(2));
                    String correoEstudiante = String.valueOf(row.get(4));
                    String numeroEstudiante = String.valueOf(row.get(5));
                    
                    Estudiante estudiante = new Estudiante(" ", nombreEstudiante, " ", correoEstudiante, numeroEstudiante, Integer.parseInt(carnetEstudiante));
                    String periodoNombre = String.valueOf(row.get(6));
                    Periodo periodo = new Periodo(periodoNombre);
                    String cursoNombre = String.valueOf(row.get(7));
                    Curso curso = new Curso(cursoNombre);
                    int numeroGrupo = Integer.parseInt(String.valueOf(row.get(8)));
                    Grupo grupo = new Grupo(numeroGrupo);
                    
                    InconsistenciaEnum inconsistencia = InconsistenciaEnum.valueOf(String.valueOf(row.get(9)));
                    String detallesInconsistencia = String.valueOf(row.get(10));
                    DTOSolicitud solicitud = new DTOSolicitud(fechaHora, idSolicitante, nombreSolicitante, periodo, grupo, curso, estudiante, inconsistencia,
                            detallesInconsistencia, EstadoEnum.PENDIENTE
                    );
                    solicitud.setCodigo(solicitud.generarCodigo());
                    solicitudes.add(solicitud);

                } catch (Exception ex) {
                   System.out.println("Google " + ex.getMessage());
                }
            });
        }
        return solicitudes;
    }

    public void cargarPrimerosDatos() {
        try {
            Properties parametros = new Properties();
            parametros.load(new FileInputStream("src\\archivos\\parametros.properties"));                        
            ConfigurationPaths.getInstance().setPathGoogleDriveExcel(parametros.getProperty("sheetid"));
            ConfigurationPaths.getInstance().setFormatoGoogleDriveExcel(parametros.getProperty("range"));            
            ConfigurationPaths.getInstance().setPathSolicitudesLocal(parametros.getProperty("pathSolicitudesLocal"));           
            ConfigurationPaths.getInstance().setPathCarteraDocentes(parametros.getProperty("pathCarteraDocentes"));                        
            ConfigurationPaths.getInstance().setPathCursos(parametros.getProperty("pathCursos"));
            ConfigurationPaths.getInstance().setPathOfertaAcademica(parametros.getProperty("pathOfertaAcademica"));                       
            ConfigurationPaths.getInstance().setDirectorEscuelaComputacion(parametros.getProperty("directorEscuelaComputacion"));
            ConfigurationPaths.getInstance().setDirectorAdminisionRegistro(parametros.getProperty("directorAdminisionRegistro"));
                                    
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Curso> cargarCursos() {
        try {
            String path = ConfigurationPaths.getInstance().getPathCursos();
            Excel excel = new Excel(path);
            ArrayList<Curso> listaCursos = new ArrayList<>();
            int rowCount = excel.getSheet().getRows();
            int columnCount = excel.getSheet().getColumns();
            for (int row = 1; row < rowCount; row++) {
                ArrayList<Cell> sheetCells = new ArrayList<>();
                for (int column = 0; column < columnCount; column++) {
                    sheetCells.add(excel.getSheet().getCell(column, row));
                }
                String codigoCurso = sheetCells.get(0).getContents();
                String nombreCurso = sheetCells.get(1).getContents();
                CreditosEnum creditos = CreditosEnum.valueOf(sheetCells.get(2).getContents());
                Curso curso = new Curso(codigoCurso, nombreCurso, creditos);
                listaCursos.add(curso);
            }
            return listaCursos;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public ArrayList<DTOofertaAcademica> cargarOfertaAcademica() {
        try {
            String path = ConfigurationPaths.getInstance().getPathOfertaAcademica();
            Excel excel = new Excel(path);
            ArrayList<DTOofertaAcademica> listaOferta = new ArrayList<>();
            int rowCount = excel.getSheet().getRows();
            int columnCount = excel.getSheet().getColumns();
            for (int row = 1; row < rowCount; row++) {
                ArrayList<Cell> sheetCells = new ArrayList<>();
                for (int column = 0; column < columnCount; column++) {
                    sheetCells.add(excel.getSheet().getCell(column, row));
                }
                String codigoCurso = sheetCells.get(0).getContents();
                String nombreCurso = sheetCells.get(1).getContents();
                String grupo = sheetCells.get(2).getContents();
                String idProfesor = sheetCells.get(3).getContents();
                String nombreProfesor = sheetCells.get(4).getContents();
                String primeraFechaHora = sheetCells.get(5).getContents();
                String segundaFechaHora = sheetCells.get(6).getContents();
                String aula = sheetCells.get(7).getContents();
                DTOofertaAcademica dto = new DTOofertaAcademica(codigoCurso, nombreCurso, grupo, idProfesor,
                        nombreProfesor, primeraFechaHora, segundaFechaHora, aula);
                listaOferta.add(dto);
            }

            return listaOferta;
        } catch (Exception ex) {
            return null;
        }
    }

    public ArrayList<Docente> cargarCarteraDocente() {
        try {
            String path = ConfigurationPaths.getInstance().getPathCarteraDocentes();
            Excel excel = new Excel(path);
            ArrayList<Docente> listaDocentes = new ArrayList<>();
            int rowCount = excel.getSheet().getRows();
            int columnCount = excel.getSheet().getColumns();
            for (int row = 1; row < rowCount; row++) {
                ArrayList<Cell> sheetCells = new ArrayList<>();
                for (int column = 0; column < columnCount; column++) {
                    sheetCells.add(excel.getSheet().getCell(column, row));
                }
                String identificacion = sheetCells.get(0).getContents();
                String nombre = sheetCells.get(1).getContents();
                String correo = sheetCells.get(2).getContents();
                String telefono = sheetCells.get(3).getContents();
                Docente docente = new Docente(identificacion, nombre, " ", correo, telefono);
                listaDocentes.add(docente);
            }
            return listaDocentes;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }   
}
