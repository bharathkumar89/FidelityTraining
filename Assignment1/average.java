package Assignment1;

import java.util.Scanner;

public class Average {
    static void average(int[] a){
        int sum = 0;
        for(int i : a)
            sum += i;
        float avg = (float) sum /a.length;

        System.out.print("The average of the given numbers is : "+avg);
    }

    static void sumE(int[] a){
        int sum =0;
        for(int n: a){
            if(n%2==0)
                sum += n;
        }
        System.out.println("The Sum of the even numbers in the given array is : "+ sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        average(arr);
        System.out.println();
        sumE(arr);
    }
}