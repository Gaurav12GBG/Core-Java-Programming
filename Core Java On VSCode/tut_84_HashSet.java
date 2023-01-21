import java.util.HashSet;
import java.util.Iterator;

public class tut_84_HashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> myHashSet1 = new HashSet<>(6, 0.5f); //loadFactor
        HashSet<Integer> myHashSet2 = new HashSet<>(6, 0.5f);
        myHashSet1.add(78);
        myHashSet1.add(77);
        myHashSet1.add(76);
        myHashSet1.add(75);

        myHashSet2.add(98);
        myHashSet2.add(55);
        myHashSet2.add(80);

        // myHashSet.clear();
        System.out.println(myHashSet1.contains(76));
        System.out.println(myHashSet1.isEmpty());
        System.out.println(myHashSet1.getClass()); // get the class comes from
        myHashSet1.addAll(myHashSet2);
        myHashSet1.remove(80);
        System.out.println(myHashSet1.equals(myHashSet2));

        Iterator<Integer> iter = myHashSet1.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println(myHashSet1);
    }
}
