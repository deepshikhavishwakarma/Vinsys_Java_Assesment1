import java.util.Scanner;

public class PilotRegistration{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println( "----//Welcome to Pilot Validation System//----" );

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your father's name: ");
        String fathername = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter your contact number: ");
        long contact = sc.nextLong();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.print("Enter your qualification: ");
        String qualification = sc.nextLine();

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter your 10th percentage: ");
        float tenth = sc.nextFloat();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter your 12th percentage: ");
        float twelfth = sc.nextFloat();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter your graduation percentage: ");
        float graduation = sc.nextFloat();
        sc.nextLine(); // Consume the newline character

        System.out.println( "Name :                  " +  name );
        System.out.println( "Father name :            " +  fathername );
        System.out.println( "Age :                    " +  age );
        System.out.println( "Contact :                " +  contact );
        System.out.println( "Email :                  " +  email );
        System.out.println( "Qualification :          " +  qualification );
        System.out.println( "Address :                " +  address );
        System.out.println( "Tenth Percentage :       " +  tenth );
        System.out.println( "Twelth Percentage :      " +  twelfth );
        System.out.println( "Graduation Percentage :  " +  graduation );
        isValid(age, tenth, twelfth, graduation);
        sc.close();
    }

    public static void isValid(int age, float tenth, float twelve, float grad) {
        if (age < 18 || age > 25) {
            if (age < 18) {
                System.out.println("you are underaged");
            } else if (age > 25) {

                System.out.println("you are overaged.");
            }
        } else if (tenth < 75) {
            System.out.println("your 10th percentage does not meet our criteria.");
        } else if (twelve < 75) {
            System.out.println("your 12th percentage does not meet our criteria..");
        } else if (grad < 75) {
            System.out.println("your Graduation percentage does not meet our criteria..");
        } else {
            System.out.println( "congrats you are eligible");
        }
    }


}