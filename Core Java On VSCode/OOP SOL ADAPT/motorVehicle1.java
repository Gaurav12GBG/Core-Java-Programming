abstract class MotorVehicle {
    public String driveStatus = "Preparing for drive";

    public abstract String driveVehicle();

    // Getters and Setters
    public String getDriveStatus() {
        return driveStatus;
    }

    public void setDriveStatus(String driveStatus) {
        this.driveStatus = driveStatus;
    }

}

class TwoWheeler extends MotorVehicle {
   
    @Override
    public String driveVehicle() {
        return "You are driving two wheeler";
    };
}

class FourWheeler extends MotorVehicle {
    @Override
    public String driveVehicle() {
        return "You are driving four wheeler";
    };
}

public class motorVehicle1 {
    public static void main(String[] args) {
        var twoWheeler = new TwoWheeler();
        System.out.println(twoWheeler.driveStatus);
        var twoWheelerDrive = twoWheeler.driveVehicle();
        System.out.println(twoWheelerDrive);
        var fourWheeler = new FourWheeler();
        System.out.println(fourWheeler.driveStatus);
        var fourWheelerDrive = fourWheeler.driveVehicle();
        System.out.println(fourWheelerDrive);
    }
}
