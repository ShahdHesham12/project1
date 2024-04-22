
public class Product {
	private int productID;
	private String name;
	private float price;
	
	public Product() {
		
	}
	
	public Product (int productID, String name, float price) {
		this.productID= productID;
		this.name= name;
		this.price= Math.abs(price);
	}
	
	public void setproductID(int productID) {
		if(productID>0) {
			this.productID= productID;
		}else {
			this.productID= Math.abs(productID);	
		}
	}
	
	public void setname(String name) {
		this.name= name;
	}
	
	public void setprice(float price) {
		if(price>0) {
			this.price= price;
		}else {
			this.price= Math.abs(price);	
		}
		
	}
	
	public int getproductID() {
		return productID;
	}
	
	public String getname() {
		return name;
	}
	
	public float getprice() {
		return price;
	}
	

}
