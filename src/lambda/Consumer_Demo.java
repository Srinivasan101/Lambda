package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	String name;
	int salary;
	String gender;
	
	Employee (String name, int salary,String gender ){
		this.name = name;
		this.salary=salary;
		this.gender=gender;
	}
	
}

public class Consumer_Demo {

	public static void main(String[] args) {
	
	ArrayList <Employee> emp = new ArrayList<Employee>();
	emp.add(new Employee("Srini",50000,"Male"));
	emp.add(new Employee("Mani",40000,"Male"));
	emp.add(new Employee("Rajesh",30000,"Male"));
	
	Function <Employee,Integer> e = f -> (f.salary*10)/100;
	
	Predicate <Integer>p = b -> b >= 5000;
	
	Consumer <Employee> c = f -> {
		System.out.println(f.name + " " +f.salary + " " + f.gender);
	};
	for(Employee x : emp) {
		int bonus = e.apply(x);
		if(p.test(bonus)) {
			c.accept(x);
			System.out.println("Employee Bonus : " + bonus);
		}
		
	}
	
	}

}
