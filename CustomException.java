package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}

class Main4{
    public static void readFile(String fileName) throws CustomException {
        try {
            FileInputStream fis = new FileInputStream(fileName);
        }catch (IOException e){
            throw new CustomException("Failed to read file");
        }
    }
    public static void main(String[] args) {
        try {
            readFile("nonexist.txt");
        } catch (CustomException e){
            System.out.println("Custom Exception caught: "+e.getMessage());
            System.out.println("Original cause: "+e.getMessage());
        }
    }
}
