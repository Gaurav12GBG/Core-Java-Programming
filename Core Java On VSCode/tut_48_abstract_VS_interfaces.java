interface Bicycle{
    int a = 5555; // Allowed to declaring the variable by default it is final
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface BlowHorn{
    void blowHornK3G();
    void blowHornMNH();
}

class AvonCycle implements Bicycle, BlowHorn{
    int speed = 7;
    public void applyBrake(int decrement){
        speed = speed - decrement;
        System.out.println("Speed when apply brake : " + speed);
    }

    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println("Speed when speed up : " + speed);
    }

    public void blowHornK3G(){
        System.out.println("I am in blowHornK3G..");
    }

    public void blowHornMNH(){
        System.out.println("I am in blowHornMNH..");
    }
};

public class tut_48_abstract_VS_interfaces {
    public static void main(String[] args) {
        
        AvonCycle av = new AvonCycle();
        av.applyBrake(75);
        av.speedUp(75);

        // You can create the properties in interfaces..
        // System.out.println(av.a);

        // You cannot modify the properties in interfaces as they are final...
        // av.a = 100; --- throw error
        // System.out.println(av.a);

        av.blowHornK3G();
        av.blowHornMNH();


    }
}
