package lambda.Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	String name;
	int salary;
	int bonus;

 Employee(String name, int salary, int bonus){
	 this.name=name;
	 this.salary=salary;
	 this.bonus=bonus;
	 
 }
}
public class Apply_Test {

	public static void main(String[] args) {
		
		ArrayList <Employee> list = new ArrayList <Employee> ();
		
		list.add(new Employee("srini",50000,3));
		list.add(new Employee("Hari",60000,3));
		list.add(new Employee("Mani",40000,2));
		list.add(new Employee("Rajesh",30000,1));
		list.add(new Employee("Raj",80000,6));
		
		Function <Employee,Integer> emp = s -> {
			int sal = s.salary;
			if (sal >= 10000 && sal <= 20000) 
				return sal * 10/100;
				else if (sal > 20000 && sal <= 30000)
					return sal * 20/100;
				else if (sal > 30000 && sal <= 40000)
					return sal * 30/100;
				else if ( sal > 40000 && sal <= 50000)
					return sal * 40/100;
				else if ( sal > 50000 && sal <= 60000)
					return sal *50/100;
				else
					return sal*60/100;
			};
			
			Predicate <Integer> p = b -> b > 10000;
			
			for (Employee e :list) {
				int bonus = emp.apply(e);
				if (p.test(bonus)) {
					System.out.println(e.name+ " " + e.salary);
					System.out.println("Bonus is : " + bonus);
				}
		}
		
		
	}

}
