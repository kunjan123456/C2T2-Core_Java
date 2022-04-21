package Inheritance;

class Withdraw {
    int  amt_withdraw=2000;
}
public class Atm extends Withdraw
{
	int amt_left=5000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm  ob1=new Atm();
System.out.println("amt_withdraw" +ob1.amt_withdraw);
System.out.println("amt_withdraw"+ ob1.amt_left);
	}
}
//inheritance