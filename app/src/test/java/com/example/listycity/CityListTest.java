package com.example.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the CityList class.
 */
class CityListTest {

    /**
     * Creates a mock CityList with one city (Edmonton, Alberta) already added.
     * @return a CityList containing one city
     */
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    /**
     * Creates a mock City object for Edmonton, Alberta.
     * @return a City object for Edmonton
     */
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    /**
     * Tests the add() method.
     * Verifies that adding a city increases the list size
     * and the city is actually contained in the list.
     */
    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    /**
     * Tests that add() throws IllegalArgumentException
     * when trying to add a duplicate city.
     */
    @Test
    void testAddException() {
        CityList cityList = mockCityList();

        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    /**
     * Tests the getCities() method.
     * Verifies that the list is returned in sorted order by city name.
     */
    @Test
    void testGetCities() {
        CityList cityList = mockCityList();

        // Only Edmonton in the list; it should be at position 0
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));

        // Add Charlottetown which comes before Edmonton alphabetically
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);

        // Charlottetown should now be at position 0, Edmonton at position 1
        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    /**
     * Tests the hasCity() method.
     * Verifies it returns true for a city in the list
     * and false for a city not in the list.
     */
    @Test
    void testHasCity() {
        CityList cityList = mockCityList();

        // Edmonton is in the list, so hasCity should return true
        assertTrue(cityList.hasCity(mockCity()));

        // A city not in the list should return false
        City city = new City("Vancouver", "British Columbia");
        assertFalse(cityList.hasCity(city));
    }

    /**
     * Tests the delete() method.
     * Verifies that deleting a city actually removes it from the list
     * and the count decreases.
     */
    @Test
    void testDelete() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());

        // Delete Edmonton
        cityList.delete(mockCity());
        assertEquals(0, cityList.countCities());

        // Edmonton should no longer be in the list
        assertFalse(cityList.hasCity(mockCity()));
    }

    /**
     * Tests that delete() throws IllegalArgumentException
     * when trying to delete a city that is not in the list.
     */
    @Test
    void testDeleteException() {
        CityList cityList = mockCityList();

        // Try to delete a city that is NOT in the list
        City city = new City("Toronto", "Ontario");
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(city);
        });
    }

    /**
     * Tests the countCities() method.
     * Verifies that the count is correct after adding and deleting cities.
     */
    @Test
    void testCountCities() {
        CityList cityList = mockCityList();

        // After mockCityList, there should be 1 city
        assertEquals(1, cityList.countCities());

        // Add another city
        City city = new City("Calgary", "Alberta");
        cityList.add(city);
        assertEquals(2, cityList.countCities());

        // Delete one city
        cityList.delete(city);
        assertEquals(1, cityList.countCities());
    }
}