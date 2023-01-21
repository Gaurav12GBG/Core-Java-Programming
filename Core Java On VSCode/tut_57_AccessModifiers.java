class AccessModifier{
    public int x = 5;
    protected int y = 45;
    int z = 85;
    private int a = 99;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
};

public class tut_57_AccessModifiers {
    public static void main(String[] args) {
        
        /* 
        ACCESS MODIFIERS IN JAVA :
        => Access modifiers determine whether other classes can use a particular field or invoke a particular method
           can be public, private, protected OR default(not modifier).

        => Check which modifiers within class , within package, within subclass OR within World.
           Modifier         class        package        subclass         world

           public             Y             Y              Y               Y
           protected          Y             Y              Y               N
           default(no)        Y             Y              N               N
           private            Y             N              N               N
        */

        AccessModifier am = new AccessModifier();
        
        // Within a class
        am.meth1();

        //Within a package
        System.out.println(am.x);
        System.out.println(am.y);
        System.out.println(am.z);
        // System.out.println(am.a); ---> Not Allowed
    }
}
