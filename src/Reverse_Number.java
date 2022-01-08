import java.util.Scanner;

public class Reverse_Number {

    static int reverse(int number){

        int rev = 0; // reversed number
        int rem;   // remainder

        while(number>0){

            rem = number%10;
            rev = (rev*10) + rem;
            number = number/10;
        }

        return rev;
    }

    // Driver Function
    public static void main (String[] args) {
        Scanner User_Input = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int number = User_Input.nextInt();



        System.out.print("Reversed Number is "+ reverse(number));
    }
}
