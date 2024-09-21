package javafolder;

public class Bankingsystem {

Long accountnumber=12345678L;
String accountholdername="Mohamed adil";
Integer accountpassword=12;
	
	
	
	public static void main(String[] args) {
//classname objname=new classname();
		Bankingsystem Hdfcaccount=new Bankingsystem();
		Hdfcaccount.accountpassword();
		Hdfcaccount.accountholdername();
		Hdfcaccount.accountnumber();
	

}

	public void accountnumber() {
		// TODO Auto-generated method stub
		System.out.println("As account name is"+accountnumber);	
	}

	public void accountholdername() {
		// TODO Auto-generated method stub
		System.out.println("accountholdername is "+accountholdername);
	}
	public void accountpassword() {
		// TODO Auto-generated method stub
		System.out.println("accountpassword is "+accountpassword);
	}
}