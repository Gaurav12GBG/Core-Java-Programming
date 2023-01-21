import java.util.ArrayList;
import java.util.Iterator;

public class tut_79_ArrayList {
    public static void main(String[] args) {
           /* 
        ARRAYLIST IN JAVA :-
                           - Methods : add() -> Insert the specified element at the specified position in the list.
                                      size() -> Returns the number of element in the list.
                                    addAll() -> 
                                    remove() -> Remove the element at the specified position in the list
                                   isEmpty() -> Returns true if the list contains no elements.
                                       get() -> Return the element at the specified position in the list
                                     clear() -> Remove all the element in the list
                                  contains() -> Return true if list contains a specified elememt.
                                   indexOf() -> Returns the index position 
                                    remove() -> Remove the element at the specified position in the list
                                       set() -> update the element at the specified index position
                                  Iterator() -> used to get an iterator over the elements in the list in proper
                                                sequence

                                   hasNext() -> It is a scanner class method which returns true if this scanner has
                                                another token in its input.
                                      next() -> Its a scanner class method it get the next completion token.
        
        */

        
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(65);
        l1.add(89);
        l1.add(15);
        l1.add(74);
        l1.add(0, 4444); // store at specified position

        l2.add(777);
        l2.add(771);
        l2.add(772);
        l2.add(0, 555);

        l1.addAll(l2); // joining of two arrayList

        l1.remove(0); // remove element at the specified index position
        System.out.println(l1.isEmpty()); // ArrayList is empty or not it return true OR false
        // l1.clear(); // clear the all elements in the arrayList
        System.out.println(l1.contains(74)); // return true if specified element contains by arrayList
        System.out.println(l1.indexOf(74)); // return the index position of specified element
        l1.set(5, 1000); // Update the element at specified index position

        Iterator<Integer> iter = l1.iterator(); // it iterates all the elements present into the arrayList
        while (iter.hasNext()){
            System.out.println(iter.next());
           
        } 

        // System.out.println(l1);
        for(int i = 0; i<l1.size(); i++){  //for the arraylist size is required
           
            System.out.print(l1.get(i));
            System.out.print(" ");
        }


    }
}

