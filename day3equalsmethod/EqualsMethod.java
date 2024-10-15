package Com.Day3;

public class Equalsmethod {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Hello";
        String s3 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
