// class Emp{
//     int id;
//     String name;
//     Address ad; //entity reference
// }

// public class tut_39_1_Aggregations {
//     public static void main(String[] args) {
//         /* 
//         Aggreagation In Java :-
//         -> If a class have an entity reference, it is known as aggregation.
//         -> Aggregation represents HAS-A relationship.

//         -> Why Use Aggregation?
//             -> For Code Reusability.
//             -> When there is no IS-A relationship (Inheritance). Inheritance should be used only if the relation IS-A is
//                maintained throught the lifetime of the objects involved; Otherwise aggregation is the best choice.

//         */

//         Address ad = new Address(423104, "India", "Maharashtra");
//         Employee e1 = new Employee(12, "Gaurav", ad);
//         e1.display();
//     }
// }

class A {
    int a1;
    B b;

    A(int a1, B b) {
        this.a1 = a1;
        this.b = b;
    }

    public void aa() {
        System.out.println("I am in aa");
    }

}

class B {
    int b1;

    B(int b1) {
        this.b1 = b1;

    }

    public void bb() {
        System.out.println("I am in bb");
    }
}

public class tut_39_1_Aggregations {
    public static void main(String[] args) {
        B b = new B(12);
        A a = new A(45, b);
    }
}