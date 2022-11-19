package Assignment2.ContentCoupling;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FileManager {

    List<File> files = Arrays.asList(
            new File("notes"),
            new File("CSE Book")
    );

    public void convertBookTOPdf(){
        for(File file : files){
            if(Objects.equals(file.name, "CSE Book")){
                PdfConverter.convertToPdf(file);
            }
        }
    }
}
