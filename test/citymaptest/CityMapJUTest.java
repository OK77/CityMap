package citymaptest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import citymap.CityMap;

public class CityMapJUTest {

	@Test
	public void isJourneyPossibleAA() {
		CityMap cityMap = new CityMap("a-b,b-c");
		assertTrue(cityMap.isJourneyPossible("a", "a"));
	}
	
	@Test
	public void isJourneyPossibleAC() {
		CityMap cityMap = new CityMap("a-b,b-c");
		assertTrue(cityMap.isJourneyPossible("a", "c"));
	}
	
	@Test
	public void isJourneyPossibleFalse() {
		CityMap cityMap = new CityMap("a-b,f-c");
		assertFalse(cityMap.isJourneyPossible("a", "c"));
	}

}
