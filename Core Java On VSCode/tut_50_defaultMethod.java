interface MyCamera{
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

interface MyWifi{
    String[] getNetworks();
    void connectNetwork(String network);
}

class MyCellPhone{
    public void callNumber(int phoneNo){
        System.out.println("Calling To.. "+ phoneNo);
    }

    public void pickCall(){
        System.out.println("Connecting...");
    }
};

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi{
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
}
public class tut_50_defaultMethod {
    public static void main(String[] args) {
        
        /* 
        DEFAULT METHOD :
        => Important points :
                            - An interface can have static and default methods.
                            - Default method enable us to add new functionality to exiting interfaces.
                            - this feature was introduced in java 8 to ensure backward compatibity while updating an
                              interface
                            - Classes implementing the interfaces need not implementing the default method.
                            - Interfaces can also include private method for default methods to use.
        
        */

        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }

        ms.connectNetwork("Gaurav@12");
        ms.recordVideo();
        ms.record4KVideo();
        // ms.editVideos(); ---> Throws an error because it is private we cannot use directly
    }


}
