package Polymorphism;

public class Poly {

	void add(int x, int y) {
		System.out.println("add 2 nos" +(x+y));
	}
	void add(int x,int y,int z) {
		System.out.println("add 2 nos" +(x+y+z));
	}
	public static void main(String[] args) {
		Poly ob1= new Poly();
		ob1.add(3,4);
		ob1.add(6,2,3);
	}
}