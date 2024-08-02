package ExceptionHandling;

public class Voting {
    public static void main(String[] args) {
        int age = 16;
        try{
            if(age<18){
                throw new UnderAgeException();
            }
            else{
                System.out.println("You can Vote");
            }
        }catch(UnderAgeException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
