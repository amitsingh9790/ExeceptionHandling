package ExceptionHandling;

public class NesedTryCatchBlocks {
    public static void main(String[] args) {
        try {
            try {
                String str = "abc";
                int num = Integer.parseInt(str);
                int result = 10/num;
            }catch (NumberFormatException e){
                System.out.println(e);
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
