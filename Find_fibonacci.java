package Fibonacci;
import java.util.Scanner;
public class Find_fibonacci
{
    static int factorial(int n){
        if (n==1){
            return n;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner A = new Scanner (System.in);
		int a = A.nextInt();
		System.out.println(factorial(a));
	}
}