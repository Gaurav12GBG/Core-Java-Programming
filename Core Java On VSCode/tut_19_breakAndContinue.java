public class tut_19_breakAndContinue {
    public static void main(String[] args) {

        int i = 0;
        // while (i < 5) {
        //     System.out.println(i);
        //     i++;
        //     break;  // We are using the break and continue in loop or a switch.
            
        //     }

        while(i < 1){
            System.out.println(i);
            i++;
            continue;
        }
        if(i == 1)
        System.out.println("Not continued");
        
    }
}
