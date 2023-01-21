public class tut_12_strMethods {
    public static void main(String[] args) {
        String name1 = "GaURaV";
        System.out.println("This is a name1: "+name1);

    // String methods :
        // 1.length(): Returns a length of string
        int value1 = name1.length();
        System.out.println("The length of name1 is : "+value1);


        /* 2.toLowerCase(): Returns a new string which has all the lowercase character
                            from the string name.
        */
        String value2 = name1.toLowerCase();
        System.out.println("Convert into the lowercase character : "+value2);


        /* 3.toUpperCase(): Returns a new string which has all the Uppercase character
                            from the string name.
        */
        String value3 = name1.toUpperCase();
        System.out.println("Convert into the uppercase character : "+value3);


        /* 4.trim(): Returns a new string after removing all the leading and 
                     traling spaces from the orignal string.
        */
        String name2 = "   Gaurav    ";
        String value4 = name2.trim();
        System.out.println("e.g. "+name2);
        System.out.println("After removing all the spaces : "+value4);


        /* 5.substring(int start): Returns substring from start to end.
        */
        String value5 = name1.substring(3);
        System.out.println("substring from the third character is : "+value5);


        /* 6.substring(int start, int end): Returns substring from start index
                                             to the end index. Start index is included
                                             and end index is excluded.
        */
        String value6 = name1.substring(1, 4);
        System.out.println("substring from the one to third character is : "+value6);



        /* 7.replace('av', 'i'): Returns a new string after replacing 'av with 
                                 'i'. Gauri is returned in this case
        */
        String value7 = name1.replace("aV", "i");
        System.out.println("After replacing aV to i : "+value7);


        /* 8.startsWith("Ga"): Returns true if name1 starts with "Ga". true in this
                               case.
        */
        boolean value8 = name1.startsWith("Ga");
        System.out.println("Is start with Ga or not : "+value8);
        boolean value81 = name1.startsWith("GaR");
        System.out.println("Is start with GaR or not : "+value81);


        /* 9.endsWith("aV"): Returns true if name1 ends with "aV". true in this
                               case.
        */
        boolean value9 = name1.endsWith("aV");
        System.out.println("Is ends with i or not : "+value9);
        boolean value91 = name1.endsWith("GaR");
        System.out.println("Is ends with GaR or not : "+value91);


        /* 10.charAt(2): Returns a character at a given index position. In this
                         case it returns U.
        */
        char value10 = name1.charAt(2);
        System.out.println("check the character at the index pos 2 : "+value10); 


        /* 11.indexOf('U'): Returns a index position of the given character. In this
                            case it returns 2. 
                            // If duplicate character or string is there then it returns -1.
        */
        int value11 = name1.indexOf('U');
        System.out.println("check the index pos of the character U : "+value11);
        int value1111 = name1.indexOf("Usbksjb"); 
        System.out.println("check the index pos of the character Usbksjb : "+value1111);
        

        /* 12.lastIndexOf("RaV"): Returns the last index of given string.
                                  // If duplicate character or string is there then it returns -1.
        */
        int value12 = name1.lastIndexOf("RaV");
        System.out.println("It returns the last index of RaV : "+value12); 


        /* 13.lastIndexOf("GaU", 4): Returns the last index of given string before
                                     index 4.
                                     // If duplicate character or string is there then it returns -1.
        */
        int value13 = name1.lastIndexOf("GaU", 4);
        System.out.println("It returns the last index of GaU before index 4 : "+value13);
        int value113 = name1.lastIndexOf("GaUabc", 4);
        System.out.println("It returns the last index of GaUabc before index 4 : "+value113);
        
        
        /* 14.equals("GaURaV"): Returns true if the given string returns the
                                GaURaV  otherwise it returns false.
        */
        boolean value14 = name1.equals("GaURaV");
        System.out.println("Is GaURaV is equal to name1 or not : "+value14); 
        boolean value114 = name1.equals("Gaurav");
        System.out.println("Is Gaurav is equal to name1 or not : "+value114);


        /* 15.equalsIgnoreCase("Gaurav"): If two strings are equal it ignores the case
                                          case of character .
        */
        boolean value15 = name1.equalsIgnoreCase("Gaurav");
        System.out.println("Is Gaurav is equal to name1 or not if it ignore the cases of character : "+value15);

    }
}