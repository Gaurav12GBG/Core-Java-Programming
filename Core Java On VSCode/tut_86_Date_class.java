import java.util.Date;

public class tut_86_Date_class {
    public static void main(String[] args) {
        
        /* 
        DATE CLASS :
                        Date d = new Date();
                        System.out.println(d);

                        - We can also use the constructor provided by the date class,.
                        - Java Date class has few methods which can be used for ex:- getDate(), getday() etc.
                        - All these methods are deprecated.
        
        */

        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        // depricated :
        // System.out.println(d.getDate());
        // System.out.println(d.getSeconds());
        // System.out.println(d.getYear());
        // System.out.println(d.getMinutes());
      
    }
}
