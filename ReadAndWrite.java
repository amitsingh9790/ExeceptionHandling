package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//Throws: It's indication the caller object that their might be an exception So its better
//to use the try-catch/throws to handle that Exception.

public class ReadAndWrite {
    void ReadFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
    }
    int Divide(int a,int b) throws ArithmeticException {
        return a/b;
    }
}

class Main2{
    public static void main(String[] args) {
        ReadAndWrite raw = new ReadAndWrite();

        try {
            //Method call to Read file
            raw.ReadFile("Anuraj.txt");
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }

        try{
            //Method call to divide two number
            raw.Divide(10,0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}