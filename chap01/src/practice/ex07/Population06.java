//06. 6개의 수도('서울', '워싱턴', '베이징', '파리', '마드리드', '런던')와 대응하는 인구 수(973.7, 63.2, 2115.0, 224.4, 326.5, 853.9)를 
//포함하는 2개의 리스트 객체를 사용하여 다음을 수행하는 프로그램을 작성하라.
//1) 수도 이름과 인구 수를 나타내는 Population클래스를 작성하되 생성자와 모든 getter메소드를 정의하고, toString()메소드를 오버라이딩한다.


package practice.ex07;

import java.util.List;

public class Population06 {
	
	private String name;
	private double population;
	
	public Population06() {
	}
	
	public Population06(String name, double population) {
		this.name = name;
		this.population = population;
		
	}
	
	public Population06(double population) {
		this.population = population;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	
    public void setFields(String name, double population) {
        this.name = name;
        this.population = population;
    }
	
	@Override
	public String toString() {
		return name + "(" +population+")" ;
	}
	
}
