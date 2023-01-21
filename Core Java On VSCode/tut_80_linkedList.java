import java.util.Iterator;
import java.util.LinkedList;

public class tut_80_linkedList {
    public static void main(String[] args) {

           /* 
        LINKEDLIST IN JAVA :-
                           - Methods : add() -> Insert the specified element at the specified position in
                                                the list.
                                      size() -> Returns the number of element in the list.
                                    addAll() -> 
                                    remove() -> Remove the element at the specified position in the list
                                   isEmpty() -> Returns true if the list contains no elements.
                                       get() -> Return the element at the specified position in the list
                                     clear() -> Remove all the element in the list
                                  contains() -> Return true if list contains a specified elememt.
                                   indexOf() -> Returns the index position if not return -1
                               lastIndexOf() -> Returns the last index posititon if not return -1
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
        
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(855);
        l1.add(955);
        l1.add(755);

        l2.add(155);
        l2.add(255);

        l1.addFirst(8555); // add element at the first index or position in the list
        l1.addLast(4555); // add element in the last index or position in the list

        l1.addAll(l2); // joining the two list together
        l1.remove(2); // remove element at specified index position
        System.out.println(l1.contains(855)); // It returns true if contains the specified element in the list
        System.out.println(l1.isEmpty()); //  it returns true if list is not empty otherwise opposite
        System.out.println(l1.indexOf(955)); // it returns the the index position of specified element 
        System.out.println(l1.lastIndexOf(855)); //it returns the index position 
        l1.set(1, 855525); // set the element at the specified index position in the list
        System.out.println(l1.getFirst()); //it returns the element present at the first position
        System.out.println(l1.getLast()); //it returns the element present at the Last position

        Iterator<Integer> iter = l1.iterator(); // it iterates all the element in the list
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(" ");

        }

        // System.out.println(l1);

    }
}
