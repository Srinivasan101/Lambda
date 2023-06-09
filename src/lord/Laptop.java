package lord;
import java.util.*;

 class Laptops {
	String brand;
	String model;
	String processor;
	int year;
	int price;
	
	
 public Laptops(String brand,String model,String processor,int year,int price) {
	 this.brand=brand;
	 this.model=model;
	 this.processor=processor;
	 this.year=year;
	 this.price=price;
	 
 }
 	public String getBrand() {
 		return brand;
}
 	public String getModel() {
 		return model;
}
 	public String getProcessor() {
 		return processor;
}
 	public int getYear() {
 		return year;
}
 	public int getPrice() {
 		return price;
}
 	@Override
 	public String toString() {
 		return "BRAND : "+brand+" MODEL : "+model+" PROCESSOR : "+processor+" YEAR : "+year+" PRICE ; "+price;
 	}
}
 
 
	public class Laptop {
		public static void main(String[] args) {
			List<Laptops>grade = new ArrayList<Laptops>();
			grade.add(new Laptops("LENOVA","IDEAPAD 8 ","AMD R4",2022,25000));
			grade.add(new Laptops("HP","NOTEBOOK 7","INTEL i9",2021,45000));
			grade.add(new Laptops("Apple","MACK AIR 7","SILICON 6",2023,95000));
			grade.add(new Laptops("HP","PAVILION 7","INTEL i7",2021,48000));
			grade.add(new Laptops("HP","ULTRA 7","INTEL i9",2021,85000));
			
			for(Laptops pro : grade) {
				if(pro.getYear() ==2021 ) {
				System.out.println(pro.toString());
				
			}//GIVE ANYTHING YOU WANT, IF IT IS BRAND ,MODEL,YEAR,PROCESSOR,PRICE.
			
			
		}
			
			
		}
	}
		
	

