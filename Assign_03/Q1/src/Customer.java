import java.util.Scanner;

public class Customer 
{
 int accNo;
 int beginBalance;
 int charges;
 int credits;
 int creditLimit;
 int newbalance;
 
 public Customer() {}
 public void acceptData()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter Accno=");
	 accNo=sc.nextInt();
	 System.out.println("enter begining balance on month=");
	 beginBalance=sc.nextInt();
	 System.out.println("enter expendture=");
	 charges=sc.nextInt();
	 System.out.println("enter total credit appiled=");
	 credits=sc.nextInt();
	 System.out.println("enter credit limit=");
	 creditLimit=sc.nextInt(); 
 }
 public void displayData()
 {
	 System.out.println("Accno="+this.accNo);
	 System.out.println("begining balance at month="+this.beginBalance);
	 System.out.println("expenditure="+this.charges);
	 System.out.println("total credits applied="+this.credits);
	 System.out.println("credit limit="+this.creditLimit);
	 this.newbalance=this.beginBalance+this.charges-this.credits;
	 if(this.creditLimit<this.newbalance)
	 {
		 System.out.println("cedit limit exceeds");
	 }
	 
 }
 public static void main(String[] args) 
 {
	Customer c=new Customer();
	c.acceptData();
	c.displayData();
 }
}
