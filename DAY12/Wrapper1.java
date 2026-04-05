package DAY12;
public class Wrapper1{
    public static Integer test1(String s ){
        return Integer.valueOf(s);
    }
    public static void main(String[] args){
        Integer b = Integer.valueOf("0123456");
        Integer c = Integer.parseInt("0987");
        int a = b.intValue();
        System.out.println(b);
        System.out.println(test1("123"));
    }
}