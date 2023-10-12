import java.util.Scanner;

public class Invoice {
	String partNumber;
	String PartDescription;
	int quantity;
	double price;

	public Invoice() {
		this.partNumber = "";
		this.PartDescription = "";
		this.quantity = 0;
		this.price = 0;

	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return PartDescription;
	}

	public void setPartDescription(String partDescription) {
		PartDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double invoiceAmount() {
		return this.quantity * this.price;
	}

	public void acceptInvoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter partnumber=");
		this.partNumber = sc.next();
		System.out.println("enter partdescription=");
		this.PartDescription = sc.next();
		System.out.println("enter quntity=");
		this.quantity = sc.nextInt();
		System.out.println("item price=");
		this.price = sc.nextDouble();

	}

	public void displayInvoice() {
		System.out.println("partNUmber=" + this.partNumber);
		System.out.println("partDescription=" + this.PartDescription);
		System.out.println("quntity=" + this.quantity);
		System.out.println("price=" + this.price);

	}
}
