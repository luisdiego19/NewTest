package test;

import com.my.GoogleForms;
import java.util.List;

public class FormsTest {
            
    public static void main(String args[])
    {        
        //Hagarra los datos de cualquier hoja de google drive que sea PUBLICA como esta que esta abajo 
        //https://docs.google.com/spreadsheets/d/1RzUz1HdYW8780KtrfGBGoGrd1YadqHl4q4oBBsrEACg/edit
                                                   // ID de la hoja, formato, nombre del proyecto 
        GoogleForms forms = new GoogleForms("1NBedtfm3PPSdAyXaZ2Krd7v7o9MX-3wGbAZ80UKYMZw", "Sheet1!A2:D", "Proyecto" );
        List<List<Object>> values = forms.getResponse().getValues();
        
        if (values == null || values.size() == 0) {
            System.out.println("No data found.");
        } else {
          values.forEach((row) -> {
              // Print columns A and E, which correspond to indices 0 and 4.
              System.out.printf("%s, %s, %s, %s\n", row.get(0), row.get(1), row.get(2), row.get(3));
            });
        }
    }           
}
