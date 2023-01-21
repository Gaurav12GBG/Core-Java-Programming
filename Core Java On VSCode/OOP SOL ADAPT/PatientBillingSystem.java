import java.util.*;

class Person {

}

class Patient extends Person {
    private String patientName;
    private Doctor d1;// Aggregation members

    public Patient() {
    }

    public Patient(String patientName, Doctor d1) {
        this.patientName = patientName;
        this.d1 = d1;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Doctor getD1() {
        return d1;
    }

    public void setD1(Doctor d1) {
        this.d1 = d1;
    }

    @Override
    public String toString() {
        return "Patient [patientName=" + patientName + ", d1=" + d1 + "]";
    }

}

class Doctor {
    private String name;
    private String date;
    private double salary;
    private String specialist;
    private double fees;

    public Doctor() {
    }

    public Doctor(String name, String date, double salary, String specialist, double fees) {
        this.name = name;
        this.date = date;
        this.salary = salary;
        this.specialist = specialist;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Doctor [name=" + name + ", date=" + date + ", salary=" + salary +", specialist="
                + specialist +", fees="+ fees +"]";
    }

}

class DoctorsInformation extends Doctor {

}

class Billing {
    private Patient p1;// Aggregation members
    private Doctor d1;// Aggregation members
    private double fees;
    private double amount;

    public Billing() {
    }

    public Billing(Patient p1, Doctor d1, double fees) {
        this.p1 = p1;
        this.d1 = d1;
        this.fees = fees;
        this.amount = d1.getFees();
    }

    public Patient getP1() {
        return p1;
    }

    public void setP1(Patient p1) {
        this.p1 = p1;
    }

    public Doctor getD1() {
        return d1;
    }

    public void setD1(Doctor d1) {
        this.d1 = d1;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Patient: Patient [physician=" + d1 +"], Doctor:"+ d1.getSpecialist() +", Fee:Rs"+ d1.getFees() +"";
    }

}

public class PatientBillingSystem {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Peter Mark", "Sat Dec 16 00:00:00 IST 1911", 75000, "General Physician", 85);
        Doctor doctor2 = new Doctor("Josh Samuel", "Fri Jun 12 00:00:00 IST 1908", 88000, "Orthopedic Doctor", 190);
        Patient patient1 = new Patient("Sam Peter", doctor1);
        Patient patient2 = new Patient("Rob Mehar", doctor2);
        Billing billing1 = new Billing(patient1, doctor1, doctor1.getFees());
        Billing billing2 = new Billing(patient2, doctor2, doctor2.getFees());

        System.out.println("Record 1 : ");
        System.out.println(billing1);
        System.out.println("Record 2 : ");
        System.out.println(billing2);
        System.out.println("Total due amount: Rs" + (billing1.getAmount() + billing2.getAmount()));
    }
}
