package Assignment1;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("PATTERN 1: \n");
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println();
        System.out.println("PATTERN 2: \n");
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}