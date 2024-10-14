class Stpauls{
    public int add(int i,int j){
        return i+j;
    }
}
class Tkr extends Stpauls{
    public int sub(int i,int j){
        return i-j;
    }
}
class snist extends Tkr{
    public int mul(int i,int j){
        return i*j;
    }
}
public class Multilevelinher {
    public static void main(String[] args) {
        snist obj = new snist();
        int result1= obj.add(5,5);
        int result2= obj.sub(5,5);
        int result3= obj.mul(5,5);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
}
