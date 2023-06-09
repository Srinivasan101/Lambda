package lord;
import java.util.*;
import java.util.Collections;

class Shirt1{
String brand;
char size;
int price;
float offer;

Shirt1(String brand,char size,int price,float offer){
	this.brand=brand;
	this.size=size;
	this.price=price;
	this.offer=offer;
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

public float getOffer() {
	return offer;

}
@Override
public String toString() {
	return "BRAND : "+brand+", SIZE : "+size+", PRICE : "+price+", OFFER : "+offer+"%";
}
}

   public class Shirts2 {
	   public static void main(String [] args) {
		   List<Shirt1>collection = new ArrayList<Shirt1>();
		   collection.add(new Shirt1("R20",'S',450,15f));
		   collection.add(new Shirt1("E Joker",'M',600,10f));
		   collection.add(new Shirt1("F20",'L',800,20f));
		   collection.add(new Shirt1("RAMRAJ",'M',1000,30f));
		   collection.add(new Shirt1("PETER ENGLAND",'L',1500,40f));
		   collection.add(new Shirt1("JUNGLE JEANS",'S',550,18f));
		   collection.add(new Shirt1("ALLEN SOLLY",'M',680,10f));
		   collection.add(new Shirt1("VOLUME ZERO",'L',1500,20f));
		   collection.add(new Shirt1("JOHNSON",'M',1000,33f));
		   collection.add(new Shirt1("NEXT GENDRATION",'L',1500,40f));
		   
		 
		   Scanner List = new Scanner(System.in);
		   System.out.println("Which brand do you want"); 
		   float Cool = List.nextFloat();
		   for(Shirt1 pro : collection) {
			   if(pro.getOffer()<=Cool) {
			   System.out.println(pro.toString());
			   
			   
		   }	  
			   
	   }   
		   }
   }//if you want price use int and list.nextInt(); and change if condition, (if want String use .equals()method else use == method)
		   
		   
		   
		   
	   
	

	
		
	
	

