

public class tut_47_IntroToInterfaces {
    public static void main(String[] args) {

        /* 
        INTERFACES IN JAVA :

        WHAT IS INTERFACES IN ENGLISH ?
        ==> Interface in english is a point where two systems meet and
            interact.

                [TV]  <------------->  [HUMAN]
                         Buttons

        => In java interface is a group of related methods with empty
           bodies.

        => Example :
                    interface Bicycle{
                        void applyBrake(int decrement);
                        void speedUp(int increment);
                    }

                    class AvonCycle implements Bicycle{
                        int speed = 7;

                        void applyBrake(int decrement){
                            speed = speed - decrement;
                        }

                        void speedUp(int increment){
                            speed = speed + increment;
                        }
                    };

        => Abstract Class VS Interfaces :
                                        We cant extend multiple abstract classes but we can implements multiple interfaces at a time. 
                     
        */  

    
    }
}
