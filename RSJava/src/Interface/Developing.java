package Interface;

public class Developing implements BankingClient,DomainClient {
//now this class is responsible to implement ALL methods of BankingClient
//interface will have methods without body
// interface methods are public only
	public static void main(String[] args) {
		Developing d = new Developing();
		d.paycreditcard();
		d.checkingbalance();
		d.transferbalance();
		d.login();
		//BankingClient b = new Developing();// run time polymorphism
//b.login();-throws an error as it is applicable only for bankingclient
DomainClient c=new Developing();
c.investment();
	}

	@Override
	public void paycreditcard() {
		System.out.println("pay credit card");

	}

	@Override
	public void transferbalance() {
		System.out.println("transfer balance ");

	}

	@Override
	public void checkingbalance() {
		System.out.println("check my balance");

	}

	public void login() {
		System.out.println("login");
	}

	@Override
	public void investment() {
		System.out.println("investing");
		
	}

}
