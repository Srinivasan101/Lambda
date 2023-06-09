package lord;
import java.util.*;

class Car{
String name;
String model;
int year;
int speed;


Car(String name,String model, int year, int speed){
	  this.name=name;
	  this.model=model;
	  this.year=year;
	  this.speed=speed;
	}

public String getName() {
	return name;
}
public String getModel() {
	return model;
}
public int getYear() {
	return year;
}
public int getSpeed() {
	return speed;
}
}



public class Cars1 {
	 public static void main(String[] args) {
		 ArrayList<Car>Cars = new ArrayList<Car>();
		 
		 
		 
		 Cars.add(new Car("TATA","NEXON",2020,250));
		 Cars.add(new Car("TATA","TIAGO",2021,350));
		 Cars.add(new Car("RR","ULTRA",2023,2500));
		 
		 
		 for(Car c : Cars ) {
			if( c.getName()=="TATA") {
				System.out.println(c.getName());
				System.out.println(c.getModel());
				System.out.println(c.getYear());
				System.out.println(c.getSpeed());
				 
	
}
			 
		 }
	  }
		 
}
	
	