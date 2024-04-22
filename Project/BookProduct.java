
public class BookProduct extends Product {
	
	private String author;
	private String publisher;
	
	public BookProduct() {
		
	}
	
public BookProduct(int productID, String name, float price,String author, String publisher ) {
	super(productID,name,price);
	this.author= author;
	this.publisher = publisher;
		
	}
	
	public void setauthor(String author) {
		this.author= author;
	}
	
	public void setpublisher(String publisher) {
		this.publisher= publisher;
	}
	
	public String getauthor() {
		return author;
	}
	
	public String getpublisher() {
		return publisher;
	}

}
