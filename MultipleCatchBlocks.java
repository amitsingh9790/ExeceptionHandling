package ExceptionHandling;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            arr[5]=74;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
