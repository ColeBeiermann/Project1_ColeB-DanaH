
public abstract class Product {

	private double productCode;
	private String productType;

	public Product(double productCode, String productType) {
		this.productType = productType;
		this.productCode = productCode;
	}
	
	public double getProductCode() {
		return productCode;
	}

	public String getProductType() {
		return productType;
	}




}
