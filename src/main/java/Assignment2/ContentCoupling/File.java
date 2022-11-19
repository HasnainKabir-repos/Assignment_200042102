package Assignment2.ContentCoupling;

public class File {
    String name;
    String extension;

    public void setExtension(String extension){
        this.extension = extension;
    }

    File(String name){
        this.name = name;
        extension = "txt";
    }
}
