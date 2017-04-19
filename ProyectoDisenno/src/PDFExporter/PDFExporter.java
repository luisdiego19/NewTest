/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testpdf.PDFExporter;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import testpdf.GUI;

/**
 *
 * @author Giova
 */
public class PDFExporter {
    public PDFExporter()
    {
    }
    
    public void crearPDFResolucion(DTOPDFExporter resolucion)
    {
        try {
            Document doc = new Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream("Report.pdf"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            doc.open();
            Paragraph tittle = new Paragraph();
            Paragraph intro = new Paragraph();
            Paragraph atencion = new Paragraph();
            Paragraph atencionP = new Paragraph();
            Paragraph resultadoU = new Paragraph();
            Paragraph resultado = new Paragraph();
            Paragraph consideradoS = new Paragraph();
            Paragraph considerado = new Paragraph();
            Paragraph resuelvo = new Paragraph();
            Paragraph resuelvoP = new Paragraph();
            Paragraph notifiquese = new Paragraph();
            Paragraph notificados = new Paragraph();
            
            Font boldFont = new Font(Font.getFamily("Arial"),12, Font.BOLD);
            Font normalFont = new Font(Font.getFamily("Arial"), 12);
            Font tittleFont = new Font(Font.getFamily("Arial Black"), 13, Font.BOLD);
            
            tittle.setFont(tittleFont);
            tittle.setAlignment(Element.ALIGN_CENTER);
            
            intro.setFont(normalFont);
            intro.setAlignment(Element.ALIGN_JUSTIFIED);
            
            atencion.setFont(boldFont);
            atencion.setAlignment(Element.ALIGN_JUSTIFIED);
            
            resultadoU.setFont(boldFont);
            resultadoU.setAlignment(Element.ALIGN_JUSTIFIED);           
            resultado.setFont(normalFont);
            resultado.setAlignment(Element.ALIGN_JUSTIFIED);
            
            consideradoS.setFont(boldFont);
            considerado.setFont(normalFont);
            considerado.setAlignment(Element.ALIGN_JUSTIFIED);
            
            resuelvo.setFont(boldFont);
            resuelvoP.setFont(normalFont);
            resuelvoP.setAlignment(Element.ALIGN_JUSTIFIED);
            
            notifiquese.setFont(boldFont);
            notificados.setFont(normalFont);
            notificados.setAlignment(Element.ALIGN_RIGHT);
            
            tittle.add("Resolución de la Dirección de la Escuela de Ingeniería en Computación\n" +
            "Instituto Tecnológico de Costa Rica\n\n" +
            "RES-IC-" + resolucion.getNumeroResolucion() + " " +resolucion.getAnno()+"\n\n");
                       
            intro.add("A las " + resolucion.getFecha() + ", el suscritor "+resolucion.getDirectorCarrera()+", en atención al caso de "+resolucion.getTipoCaso()
            +" del estudiante " + resolucion.getNombreEstudiante() +" carne " + resolucion.getCarneEstudiante() + ", sobre el curso " +resolucion.getiDcurso() + " " + resolucion.getNombreCurso() + " asignado al profesor "
            + resolucion.getProfesor() + ", ofertado en el período de " +resolucion.getPeriodo() +" del año " + resolucion.getAnno()+".\n\n" );
            
            atencion.add("\nAtención: ");            
            atencionP.add(resolucion.getDirectorAdmision() + ", Director Departamento de Admisión y Registro");           
            
            resultadoU.add("\nRESULTADO ÚNICO");
            resultado.add(resolucion.getResultado());
            
            consideradoS.add("\nCONSIDERADOS: \n");
            int cantConsiderados = resolucion.getConsiderados().size();
            int consideradoActual = 0;
            String temp;
            while (consideradoActual < cantConsiderados)
            {
                considerado.add("Considerado "+String.valueOf(consideradoActual+1)+"\n");
                considerado.add(resolucion.getConsiderados().get(consideradoActual)+"\n");
                consideradoActual = consideradoActual + 1;
            }
            
            resuelvo.add("\nRESUELVO: \n");
            resuelvoP.add(resolucion.getResolucion());
            
            notifiquese.add("\nNOTIFÍQUESE \n\n");
            notificados.add(resolucion.getDirectorCarrera() + "\nDirector Escuela Ingeniería en Computación\n Instituto Tecnológico de Costa Rica\n");
            
            doc.add(tittle);
            doc.add(intro);
            doc.add(atencion);
            doc.add(atencionP);
            doc.add(resuelvo);
            doc.add(resuelvoP);
            doc.add(resultadoU);
            doc.add(resultado);
            doc.add(consideradoS);
            doc.add(considerado);
            doc.add(notifiquese);
            doc.add(notificados);
                    
            doc.close();
        } catch (DocumentException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
