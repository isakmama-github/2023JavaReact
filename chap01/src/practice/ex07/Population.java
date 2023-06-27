package practice.ex07;

public class Population {
	private String city;
	private double population;
	
	public Population(String city, double population) {
		this.city = city;
		this.population = population;
	}

	public String getCity() {
		return city;
	}

	public double getPopulation() {
		return population;
	}
	
	@Override
	public String toString() {
		return city + "( " + population + " )";
	}
	
	
}
