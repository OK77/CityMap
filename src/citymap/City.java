package citymap;
import java.util.ArrayList;

public class City {
	
	private City neighbourCityOne;
	private City neighbourCityTwo;
	private String cityName;
	
	
	public City(String cityName, City neighbourCityOne, City neighbourCityTwo) {
		this.neighbourCityOne = neighbourCityOne;
		this.neighbourCityTwo = neighbourCityTwo;
		this.cityName = cityName;
	}


	/**
	 * @return The city name
	 */
	public String getCityName() {
		return cityName;
	}


	/**
	 * @return The list of neighbour cities
	 */
	public ArrayList<City> getNeighbourCities(){
        ArrayList<City> neighbours = new ArrayList<>();
        if(this.neighbourCityOne != null)
        {
        	neighbours.add(neighbourCityOne);
        }
        if(this.neighbourCityTwo != null) {
        	neighbours.add(neighbourCityTwo);
        }
        return neighbours;
    }
	
	
	
}
