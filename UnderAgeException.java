package ExceptionHandling;

public class UnderAgeException extends RuntimeException{
    UnderAgeException(){
        super("Yor are under age");
    }
}
