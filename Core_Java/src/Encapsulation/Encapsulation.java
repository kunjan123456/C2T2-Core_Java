package Encapsulation;

public class Encapsulation {
		 
	int year_of_purchase;
    String make;
    int model;
    double cost;
	public void display1() {
		System.out.println("Year of purchase:-" +2001);
		System.out.println("Make:- " +"Suzuki");
    }
    public void display2() {
		System.out.println("Model:- " +1999);
		System.out.println("Cost:- " +20000);
	}
    public static void main(String[] args) {
		Encapsulation ob1 = new Encapsulation();
		ob1.display1();
		ob1.display2();
		 	
	}
}


