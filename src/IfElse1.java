import java.util.Scanner;

public class IfElse1 {
            /*Program to check if you are eligible to Vote or not*/
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible to Vote!");
        }
        else
        {
            System.out.println("You are not eligible to Vote!");
        }


    }
}
