import java.util.Scanner;

public class Welcome {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your First name:  ");
        String firstName=in.next();
        in.nextLine();
        System.out.print("Enter your last name:  ");
        String lastName=in.next();

        System.out.println("Thank you very much  , "+"Mr. "+firstName+" "+lastName);

    }
}
