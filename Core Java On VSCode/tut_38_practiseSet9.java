import java.util.Scanner;

class Cylinder{
    public int radius;
    public int height;

    Cylinder(){
        radius = 18;
        height = 15;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getHeight(){
        return height;
    }

    public void setHieght(int height){
        this.height = height;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }


}

class Rectangle{
    private int length;
    private int breadth;

    Rectangle(){  // Default constructor
        length = 55;
        breadth = 56;
    }

    Rectangle(int length, int breadth){ // Paramerized Constructor
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

}

public class tut_38_practiseSet9 {
    public static void main(String[] args) {
        /* 
        Problem 1 : Create a class cylinder and use getters and setters to set its
                    radius and height. 
        */

        Scanner sc = new Scanner(System.in);

        Cylinder clnder = new Cylinder();

        clnder.setRadius(12);
        clnder.setHieght(15);
        System.out.println("Radius of cylinder is : "+ clnder.getRadius());
        System.out.println("Height of cylinder is : "+ clnder.getHeight());
      

        /* 
        Problem 2 : Use pblm1 to calculate surface area and volume of the cylinder.
        */

        Cylinder clnder1 = new Cylinder();
        System.out.println("\nEnter the radius of cylinder in meter : ");
        int radius1 = sc.nextInt();
        System.out.println("Enter the height of cylinder in meter : ");
        int height1 = sc.nextInt();
        clnder1.setRadius(radius1);
        clnder1.setHieght(height1);

        System.out.println("\nVolume of cylinder is : "+ clnder1.volume() + " Cu.m");
        System.out.println("Surface Area of cylinder is : "+ clnder1.surfaceArea()+ " sq.m");


        /* 
        Problem 3 : Use a constructor and repeat pblm1. 
        */

        Cylinder clnder2 = new Cylinder();
        System.out.println("Radius of cylinder is : "+ clnder2.getRadius());
        System.out.println("Height of cylinder is : "+ clnder2.getHeight());

        /* 
        Problem 4 : Overload a constructor used to initialize a rectangle of length 4
                    and breadth 5 for using custom parameters.
        */

        // Rectangle rect = new Rectangle();
        Rectangle rect = new Rectangle(100, 200);
        System.out.println("\nLength of rectangle is : "+ rect.getLength());
        System.out.println("Breadth of rectangle is : "+ rect.getBreadth());


        /* 
        Problem 5 : Repeat pblm1 for sphere  (HW)
        */

        sc.close();

    }
}