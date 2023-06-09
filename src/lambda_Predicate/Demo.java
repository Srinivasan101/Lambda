package lambda_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	
	String name;
	int salary;
	int experience;
	
	
	Employee(String name, int salary, int experience){
		this.name = name;
		this.salary= salary;
		this.experience= experience;
	}

}

public class Demo {
	
	public static void main(String[] args) {
		
		ArrayList <Employee> list = new ArrayList <Employee> ();
		list.add(new Employee ("Srini",30000,3));
		list.add(new Employee ("Mani",20000,2));
		list.add(new Employee ("Hari",50000,3));
		list.add(new Employee ("Raj",60000,4));
		list.add(new Employee ("Rajesh",25000,1));
		
		Predicate <Employee> pro = i -> (i.salary > 30000 && i.experience > 3);
		
		for(Employee e :list) {
			if(pro.test(e)) {
				System.out.println(e.name+ " " + e.salary+" "+e.experience);
			}
		}
		

	}
}

