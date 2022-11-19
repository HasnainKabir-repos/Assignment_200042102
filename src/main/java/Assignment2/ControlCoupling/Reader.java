package Assignment2.ControlCoupling;

public class Reader {

    void read(Inputs inputs){
        if(inputs instanceof Keyboard){
            System.out.println("Reading from keyboard");
        }else if(inputs instanceof TouchPad){
            System.out.println("Reading from TouchPad");
        }
    }
}
