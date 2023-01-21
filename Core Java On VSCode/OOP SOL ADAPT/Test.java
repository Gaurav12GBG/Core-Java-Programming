class A{
    int i ;
    public A(){
        System.out.println("A:"+i);
    }


}
public class Test{
    public static void main(String[] args) {
        new A();
    }
}