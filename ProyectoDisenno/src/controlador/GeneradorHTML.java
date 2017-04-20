/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import controlador.dto.DTOResolucion;
/**
 *
 * @author Giova
 */
public class GeneradorHTML implements GeneradorStrategy{
    public GeneradorHTML()
    {
        
    }
    
    /**
     *
     * @param resolucion
     * @throws IOException
     */
    @Override
    public void generarDocumento(DTOResolucion resolucion)
    {
        String html = "<html> <meta charset=\"utf-8\"><div><h1>";
        String title = "Resolución de la Dirección de la Escuela de Ingeniería en Computación\n" +
            "Instituto Tecnológico de Costa Rica\n\n<h1>" +
            "RES-IC-" + resolucion.getNumeroResolucion() + " " +resolucion.getAnno()+"\n</div>";
        String intro = "<h3>A las " + resolucion.getFecha() + ", el suscritor "+resolucion.getDirectorCarrera()+", en atención al caso de "+resolucion.getTipoCaso()
            +" del estudiante " + resolucion.getNombreEstudiante() +" carne " + resolucion.getCarneEstudiante() + ", sobre el curso " +resolucion.getiDcurso() + " " + resolucion.getNombreCurso() + " asignado al profesor "
            + resolucion.getProfesor() + ", ofertado en el período de " +resolucion.getPeriodo() +" del año " + resolucion.getAnno()+".\n\n</h3>";
        String atencion = "<h2>Atencion:</h2>" + "<h3>" + resolucion.getDirectorAdmision() + ", Director Departamento de Admisión y Registro</h3>";
        String resultado ="<h2>RESULTADO ÚNICO</h2><h3>" + resolucion.getResultado() + "</h3>";
        String considerados = "<h2>CONSIDERADOS:</h2>";
        int cantConsiderados = resolucion.getConsiderados().size();
        int consideradoActual = 0;
        String temp;
        while (consideradoActual < cantConsiderados)
        {
            considerados = considerados.concat("<h2>Considerado" + String.valueOf(consideradoActual+1) + "</h2>");
            considerados = considerados.concat("<h3>" + resolucion.getConsiderados().get(consideradoActual) + "</h3>");
            consideradoActual = consideradoActual + 1;
        }
        String resuelvo = "<h2>RESUELVO:</h2><h3>" + resolucion.getResolucion() + "</h3>";
        String notifique = "<h2>NOTIFIQUESE</h2><h3>" + resolucion.getDirectorCarrera() + "<p>Director Escuela Ingeniería en Computación<p> Instituto Tecnológico de Costa Rica" + "</h3>";
        File f = new File("report.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(html);
            bw.write(title);
            bw.write(intro);
            bw.write(atencion);
            bw.write(resultado);
            bw.write(considerados);
            bw.write(resuelvo);
            bw.write(notifique);
            bw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
}
