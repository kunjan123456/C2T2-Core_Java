package DataAbstraction;

abstract class Atm
{
	abstract void withdraw();
}

public class DataAbstraction extends Atm {
	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw successful");
	}

	public static void main(String[] args) {
		DataAbstraction ob1 = new DataAbstraction();
		ob1.withdraw();

	}

}