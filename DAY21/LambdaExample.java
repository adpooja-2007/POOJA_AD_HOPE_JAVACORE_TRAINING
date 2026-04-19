interface Math1{
    int add(int a , int b);
}
public class LambdaExample{
    public static int add(int a , int b){
        return a+b;
    }
    public static void main(String[] args){
        Math1 obj = new Math1(){
            @Override
            public int add(int a, int b){
                return a+b;
            }
        };
        System.out.println(obj.add(11,22));
    }
}