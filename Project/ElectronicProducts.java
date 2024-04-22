
public class ElectronicProducts extends Product{
	private String brand;
	private int warrantyPeriod;
	
	public ElectronicProducts() {
		
	}
	
public ElectronicProducts(int productID, String name, float price,String brand, int warrantyPeriod) {
		super(productID,name,price);
		this.brand= brand;
		this.warrantyPeriod = Math.abs(warrantyPeriod);
	}
	
	
	public void setbrand(String brand) {
		this.brand= brand;
	}
	
	public void setwarrantyPeriod(int warrantyPeriod) {
		if(warrantyPeriod>0) {
			this.warrantyPeriod= warrantyPeriod;
		}else {
			this.warrantyPeriod= Math.abs(warrantyPeriod);
		}
	}
	
	public String getbrand() {
		return brand;
	}
	
	public int getwarrantyPeriod() {
		return warrantyPeriod;
	}

}
