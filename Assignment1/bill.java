package Assignment1;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pizzas: ");
        x = sc.nextInt();
        System.out.print("Enter the number of puffs: ");
        y = sc.nextInt();
        System.out.print("Enter the number of pepsi: ");
        z = sc.nextInt();
        System.out.println();
        x *= 200;
        y *= 40;
        z *= 120;
        System.out.println("The Total bill is: "+(x+y+z));
    }
}