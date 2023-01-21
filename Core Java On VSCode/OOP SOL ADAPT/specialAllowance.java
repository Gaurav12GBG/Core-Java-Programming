class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    public Employee() {
    }

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }

    double salary;

    public double calculateSalary() {
        salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        return salary;
    }

    public double calculateTransportAllowance(Employee x, int t) {
        double transportAllowance = 10/ 100 * basicSalary;
        return transportAllowance;
    }

}

class Manager extends Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;

    public Manager() {
    }

    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

    public double calculateTransportAllowance(Manager x, int t) {
        double transportAllowance = 15 * super.basicSalary / 100;
        return transportAllowance;
    }
}

class Trainee extends Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;

    public Trainee() {
    }

    public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

    public double calculateTransportAllowance(Trainee x, int t) {
        return 4500.0;
    }

}

public class specialAllowance {
    public static void main(String[] args) {
        Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000.0);

        double salary = m.calculateSalary();

        System.out.println("Manager's Salary : " + salary);

        double transportAllowance = m.calculateTransportAllowance(m, 10);

        System.out.println("Manager's Transport Allowance (15%) : " + transportAllowance);
    }
}
