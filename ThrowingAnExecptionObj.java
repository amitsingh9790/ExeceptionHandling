package ExceptionHandling;

public class ThrowingAnExecptionObj {
    static void CheckNumber(int num){
        try {
            if(num<0)   throw new IllegalAccessException("Number must be non-negative");  //Creating an exception object manually using new keyword and Send to JVM
            else System.out.println("Permission Granted...");
        }catch (IllegalAccessException e){
            System.out.println(e);
        }

    }
}

class Main{
    public static void main(String[] args) {
        ThrowingAnExecptionObj TAEO = new ThrowingAnExecptionObj();
        TAEO.CheckNumber(-5);
    }
}
