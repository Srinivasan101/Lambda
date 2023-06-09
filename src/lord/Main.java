package lord;

import java.util.ArrayList;

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 30));
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 40));
        
        
        for (Person person : persons) {
            if (person.getName()=="Alice") {
            	if(person.getAge()== 25) {
                System.out.println("Name: " + person.getName());
                System.out.println("Age : " + person.getAge());
               
                break;
            }
        }
    }
}
}
