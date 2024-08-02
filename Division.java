package ExceptionHandling;

public class Division{
    public static void main(String[] args) {
        int a=5,b=0,c;
        try{
            c=a/b;
            throw new ArithmeticException();  //Creating an exception object manually using new keyword and Send to JVM
        } catch (ArithmeticException e){
            System.out.println(e);
        } finally {
            System.out.println("Successfully Compiled");
        }
    }
}
