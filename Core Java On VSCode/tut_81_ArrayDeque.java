import java.util.ArrayDeque;
import java.util.Iterator;

public class tut_81_ArrayDeque {
    public static void main(String[] args) {
        
             /* 
        ARRAYDEQUE IN JAVA :-
                           - Methods : add() -> Insert the specified element at the specified position in
                                                the list.
                                      size() -> Returns the number of element in the list.
                                    addAll() -> 
                                    remove() -> Remove the element at the specified position in the list
                                   isEmpty() -> Returns true if the list contains no elements.
                                     clear() -> Remove all the element in the list
                                  contains() -> Return true if list contains a specified elememt.
                                    remove() -> Remove the element at the specified position in the list
                                       set() -> update the element at the specified index position
                                  Iterator() -> used to get an iterator over the elements in the list in proper
                                                sequence

                                   hasNext() -> It is a scanner class method which returns true if this scanner has
                                                another token in its input.
                                      next() -> Its a scanner class method it get the next completion token.
                                  addFirst() -> Inserts the specified element at the beginning of this list.
                                   addLast() -> Appends the specified element to the end of this list.
                                  getFirst() -> Returns the first element in this list.
                                   getLast() -> Retuens the last element in the list.

        
        */

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();

        ad1.add(1000);
        ad1.add(2000);
        ad1.add(3000);

        ad2.add(11000);
        ad2.add(12000);
        ad2.add(13000);

        ad1.addAll(ad2);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        ad1.remove(12000);
        // ad1.clear();
        System.out.println(ad1.contains(11000));
        System.out.println(ad1.isEmpty());
        ad1.removeFirst();
        ad1.removeLast();

        Iterator<Integer> iter = ad1.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
       
        System.out.println(ad1);  
  }
}
