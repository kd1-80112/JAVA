
public class InvoiceTest {

	public static void main(String[] args) {
		Invoice I1 = new Invoice();
		I1.acceptInvoice();
		I1.displayInvoice();
		System.out.print("TotalBIll=");
		System.out.println(I1.invoiceAmount());

	}

}
