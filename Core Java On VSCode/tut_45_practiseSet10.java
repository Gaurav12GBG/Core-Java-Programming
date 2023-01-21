class Circle{
    public int radius;

    Circle(int r){
        System.out.println("I am a Circle parameterized constructor");
        this.radius = r;
    }

    public double areaOfCircle(){
        return Math.PI*this.radius*this.radius;
    }
}

class Clinder extends Circle{

    public int height;

    Clinder(int r, int h){
        super(r);
        System.out.println("I am a Clinder parameterized constructor");
        this.height = h;
    }

    public double volumeOfCylinder(){
        return Math.PI*this.radius*this.radius*this.height; 
    }
}

public class tut_45_practiseSet10 {
    public static void main(String[] args) {
        
        /* 
        Problem 1 : Create a class circle and use inheritance to create another
                    class cylinder from it.  

        pblm1, pblm2 and pblm3 soln
        */

        Clinder obj = new Clinder(125, 100); // Sub class

        double k = obj.areaOfCircle();
        double k1 = obj.volumeOfCylinder();

        System.out.println("Area of Circle = " + k + " Sq.unit");
        System.out.println("Volume of Cylinder = " + k1 + " Cu.unit");  

    }
}
