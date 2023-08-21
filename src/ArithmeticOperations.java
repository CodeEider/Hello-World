import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String args[])
    {
        int num1,num2,sum,sub,mul,div,mod;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = num1+num2;
        System.out.println("Summation = " + sum);
        sub = num1-num2;
        System.out.println("Substraction = " + sub);
        mul = num1*num2;
        System.out.println("Multiplication = " + mul);
        div = num1/num2;
        System.out.println("Division = " + div);
        mod = num1%num2;
        System.out.println("Modulo = " + mod);



    }
}
