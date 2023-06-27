package exam05;

public class Product {
	private static int serialNum = 10000;
	private int productNum;
	
	public Product() {
		serialNum++;
		productNum = serialNum;
	}
	
	public int getProduct() {
		return productNum;
	}
}
