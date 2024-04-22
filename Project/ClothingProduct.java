
public class ClothingProduct extends Product {
	
	private String size;
	private String fabric;
	
	public ClothingProduct() {
		
	}
	
public ClothingProduct(int productID, String name, float price,String size, String fabric ) {
	super(productID,name,price);
	this.size= size;
	this.fabric=fabric;
		
	}
	
	public void setsize(String size) {
		this.size =size;
	}
	
	public void setfabric(String fabric) {
		this.fabric =fabric;
	}
	
	public String getsize() {
		return size;
	}
	
	public String getfabric() {
		return fabric;
	}

}
