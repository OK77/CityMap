package citymap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CityMap {
	
	private String roadsAndLocations;
	private City rootCity;
	private City destinationCity;
	
	public CityMap(String roadsAndLocations) {
		this.roadsAndLocations = roadsAndLocations;
	}

	public boolean isJourneyPossible(String startLocation, String destinationLocation) {
		ArrayList<City> visited = new ArrayList<City>();
		Queue<City> toVisit = new LinkedList<>();
		
		for (String cityNeighbourPair : roadsAndLocations.split(",")) {
			String[] cityNeighbours = cityNeighbourPair.split("-");
			
			// TODO Construct a root City object that contains a tree of City objects as neighbours
			City city = new City("b", rootCity, null);
			rootCity = new City("a", city, destinationCity);
			destinationCity = new City("c", rootCity, city);
		}
		
		toVisit.add(rootCity);
		visited.add(rootCity);
		
		while(!toVisit.isEmpty()){
			City currentCity = toVisit.remove();
			visited.addAll(currentCity.getNeighbourCities());
			if(currentCity.getCityName().equals(destinationCity.getCityName())) {
                System.out.println(visited);
                return true;
            }else {
            	if(currentCity.getNeighbourCities().isEmpty()){
                    return false;
            	}else
                	toVisit.addAll(currentCity.getNeighbourCities());
            }
			visited.addAll(currentCity.getNeighbourCities());
		}
		return false;
	}
}
