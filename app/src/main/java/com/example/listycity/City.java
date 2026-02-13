package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City object.
 * Each city has a name and a province.
 * Implements {@link Comparable} to allow sorting cities by their city name.
 *
 * @author YourName
 * @version 1.0
 */
public class City implements Comparable<City> {

    /** The name of the city */
    private String city;

    /** The name of the province the city belongs to */
    private String province;

    /**
     * Constructs a new City object with the given city name and province name.
     *
     * @param city
     *      The name of the city
     * @param province
     *      The name of the province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     *
     * @return
     *      The city name as a String
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Returns the name of the province.
     *
     * @return
     *      The province name as a String
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this city to another city by their city names lexicographically.
     * This is used by {@link java.util.Collections#sort(java.util.List)} to sort
     * cities alphabetically by name.
     *
     * @param o
     *      The object to compare to. Must be a {@link City} object.
     * @return
     *      A negative integer, zero, or a positive integer as this city's name
     *      is less than, equal to, or greater than the specified city's name.
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }

    /**
     * Checks whether two City objects are equal.
     * Two cities are considered equal if they have the same city name
     * and the same province name.
     *
     * @param o
     *      The object to compare with this City
     * @return
     *      true if the cities have the same name and province, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) &&
                Objects.equals(province, city1.province);
    }

    /**
     * Returns a hash code value for this City object.
     * Consistent with {@link #equals(Object)}.
     *
     * @return
     *      A hash code based on the city name and province name
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}