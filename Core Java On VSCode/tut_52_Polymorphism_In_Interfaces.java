
interface MyCamera2{
    void takeSnap();
    void recordVideo(); // by default public

    private void editVideos(){ // only default methods use it
        System.out.println("Edit the filter only...");
    }

    default void record4KVideo(){
        editVideos(); // i can use here, not outside this or directly...
        System.out.println("Record the 4K videos...");
    }

}

interface MyWifi2{
    String[] getNetworks();
    void connectNetwork(String network);
}

class MyCellPhone2{
    public void callNumber(String phoneNo){
        System.out.println("Calling To.. "+ phoneNo);
    }

    public void pickCall(){
        System.out.println("Connecting...");
    }
};

class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWifi2{
    public void takeSnap(){
        System.out.println("Taking Snap..");
    }

    public void recordVideo(){
        System.out.println("Record the video..");
    }

    public String[] getNetworks(){
        System.out.println("Getting the list of networks..");
        String[] networkList = {"Gaurav", "Harish", "Akshay", "Abhishek", "kiran"};
        return networkList;
    }

    public void connectNetwork(String network){
        System.out.println("Connected successfully..To "+ network);
    }

    public void sampleMethod(){
        System.out.println("This is a sample method of MySmartPhone");
    }
}
public class tut_52_Polymorphism_In_Interfaces {
    public static void main(String[] args) {
        
        /* 
        POLYMORPHISM USING JAVA :
        => One Entity Many Forms

        => CellPhone (C) --------------------> SmartPhone (C)
                               inherites
            
           SmartPhone (C) <------------------- GPS (I) + CAMERA (I) + MEDIA PLAYER (I)
                               implements

                                                          (I) = Interfaces
                                                          (C) = Classes

        ....Following GPS is similar to dynamic method dispatch in inheritance......
        => GPS g = new SmartPhone();        // Can only use GPS methods 
           SmartPhone s = new SmartPhone(); // Can use all SmartPhone Methods

        => Implementing an interfaces forces methods implementation.
        */

        MyCamera2 cam = new MySmartPhone2(); // Can only use MyCamera2(I) methods

        // cam.getNetworks(); ---> Not Allowed for Good
        // cam.sampleMethod(); ---> Not Allowed 

        cam.record4KVideo(); // Allowed

        MyWifi2 mwf = new MySmartPhone2(); // Can only use MyWifi2(I) methods
        String[] ar = mwf.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }

        MySmartPhone2 msp = new MySmartPhone2(); // can use all methods in MySmartPhone2
        msp.callNumber("7030384746");
        msp.takeSnap();
        msp.sampleMethod();
        msp.pickCall();

        MyCellPhone2 mc = new MySmartPhone2();
        mc.pickCall();
        // mc.sampleMethod(); Not Allowed
        // mc.getNetworks(); Not Allowed
        // mc.record4KVideo(); Not Allowed

    }
}
