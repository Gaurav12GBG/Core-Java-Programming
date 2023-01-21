public class tut_85_Date_and_Time {
    public static void main(String[] args) {
        
        /* 
        DATE AND TIME :
        =>- java.time ---> Package for date and time(java and onwards) in java
          - Before java8 java.util package used to hold the date and time classes now this classes are
            depricated.

        => How java stores a date ?
          - Date in java is stored in the form of long numbers. This long number holds the number of 
            multiSeconds passed since 1 JAN 1970.

          - Java assumes that 1900 is the start year which means it calculates the year passed since 1900 
            whenever if ask for year passed.

          - System.currentTimeMillis() returns number of seconds passed.

          - Once number of ms are calculated, We can calculate the seconds, minutes and years passed.

        => Quick Quiz : Is it save to store the number of ms in a variable of type long?
        
        */
    }
    
}
