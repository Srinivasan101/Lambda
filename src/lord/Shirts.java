package lord;
import java.util.*;

class Shirt{
String brand;
char size;
int price;

Shirt(String brand,char size,int price){
	this.brand=brand;
	this.size=size;
	this.price=price;
}

public String getBrand() {
	return brand;
}

public char getSize() {
	return size;
}

public int getPrice() {
	return price;
}

@Override
public String toString() {
	return "BRAND : "+brand+" SIZE : "+size+" PRICE : "+price;
}
}

   public class Shirts {
	   public static void main(String [] args) {
		   List<Shirt>collection = new ArrayList<Shirt>();
		   collection.add(new Shirt("R20",'S',450));
		   collection.add(new Shirt("E Joker",'M',600));
		   collection.add(new Shirt("F20",'L',800));
		   collection.add(new Shirt("RAMRAJ",'M',1000));
		   collection.add(new Shirt("PETER ENGLAND",'L',1500));

		   Scanner List = new Scanner(System.in);
		   System.out.println("Which brand do you want"); 
		   String Cool = List.nextLine();
		   for(Shirt pro : collection) {
			   if(pro.getBrand().equals(Cool)) {
			   System.out.println(pro.toString());
			   
			   
		   }	  
			   
	   }   
		   }
   }//if you want price use int and list.nextInt(); and change if condition, (if want String use .equals()method else use == method)
		   
		   
		   
		   
	   
	

	
		
	
	

