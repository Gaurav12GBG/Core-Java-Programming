import java.util.Scanner;

class Person {
    String name;
    int age;
    char gender;

    public Person() {

    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

public class CheckTwoPersonSame {

    static boolean equals(Person personA, Person personB) {
        if (personA.name.equals(personB.name) && personA.age == personB.age && personA.gender == (personB.gender))
            return true;
        else
            return false;
    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        String str[] = new String[6];

        for (int i = 0; i < 6; i++) {
            str[i] = sc.nextLine();
        }

        String name1 = str[0];
        int age1 = Integer.parseInt(str[1]);
        char gender1 = str[2].charAt(0);
        String name2 = str[3];
        int age2 = Integer.parseInt(str[4]);
        char gender2 = str[5].charAt(0);

        Person p1 = new Person(name1, age1, gender1);
        Person p2 = new Person(name2, age2, gender2);

        if (equals(p1, p2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        sc.close();
    }
}