package exam05;


public class Factory {
	
	private static Factory fc = new Factory();
	
	private Factory() {}
	
	public static Factory getInstance() {
		return fc;
	}
	
	public Product createProduct() {
		return new Product();
	}

}
