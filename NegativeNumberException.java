package ExceptionHandling;
//Custom Exception: Creating our own is known as Custom Exception
public class NegativeNumberException extends Exception{
    NegativeNumberException(String message){
        super(message);
    }
}


class Main3{
    public static void main(String[] args) {
        try {
            checkNumber(-4);
        }catch (NegativeNumberException e){
            System.out.println(e);
        }
    }
    public static void checkNumber(int number) throws NegativeNumberException{
        if(number<0){
            throw new NegativeNumberException("Number must be Positive");
        }
        System.out.println(STR."The number is \{number}");
    }
}
