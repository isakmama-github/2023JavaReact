package practice.ex03;

public class Triangle {

	private double base;
	private double height;
	
	public double getbese() {
		return base;
	}
	public double getheight() {
		return height;
	}
	
	
	public void setbese(double base) {
		if(base > 0) {
			this.base = base;
		}else {
			this.base = 10;
			System.out.println("밑면은 마이너스가 될 수 없기에 10으로 교체");
		}
	}
	
	public void setheight(double height) {
		if(height > 0) {
			this.height = height;
		}else {
			this.height = 10.0;
			System.out.println("높이는 마이너스가 될 수 없기에 10.0으로 교체");

		}
	}
	
	double findtriangle() {
		return base*height/2;
	}
	
	boolean isSameArea(Triangle area1) {
		if(findtriangle() == area1.findtriangle()) {
			return true;
		}else {
			return false;
			
		}
	}
	
	
	void show(double x, double y, double z) {
		System.out.println("밑면 " + x + " * " + " 높이 " + y + "= "+ "넓이 " + z);
	}
	
}