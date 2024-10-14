package Assignment1;

import java.util.Scanner;

public class Cases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int x = sc.nextInt();
        if(x<18)
            System.out.println("Not eligible for voting.");
        else
            System.out.println("Eligible for voting.");
    }
}