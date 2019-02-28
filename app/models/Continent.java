package models;

import java.math.BigDecimal;

public class Continent
{
    private String name;
    private int squareKilometers;
    private int highestPointMeters;
    private long population;
    private String imageName;
    private int numberOfCountries;
    private String longestRiver;
    private String angriestCitizen;
    private String angriestCitizenImageName;
    private int numberOfMcDonalds;

    public Continent(String name, int squareKilometers, int highestPointMeters, long population, String imageName, int numberOfCountries, String longestRiver, String angriestCitizen, String angriestCitizenImageName, int numberOfMcDonalds)
    {
        this.name = name;
        this.squareKilometers = squareKilometers;
        this.highestPointMeters = highestPointMeters;
        this.population = population;
        this.imageName = imageName;
        this.numberOfCountries = numberOfCountries;
        this.longestRiver = longestRiver;
        this.angriestCitizen = angriestCitizen;
        this.angriestCitizenImageName = angriestCitizenImageName;
        this.numberOfMcDonalds = numberOfMcDonalds;
    }

    public String getName()
    {
        return name;
    }

    public int getSquareKilometers()
    {
        return squareKilometers;
    }

    public int getHighestPointMeters()
    {
        return highestPointMeters;
    }

    public long getPopulation()
    {
        return population;
    }

    public String getImageName()
    {
        return imageName;
    }

    public int getNumberOfCountries()
    {
        return numberOfCountries;
    }

    public String getLongestRiver()
    {
        return longestRiver;
    }

    public String getAngriestCitizen()
    {
        return angriestCitizen;
    }

    public String getAngriestCitizenImageName()
    {
        return angriestCitizenImageName;
    }

    public int getNumberOfMcDonalds()
    {
        return numberOfMcDonalds;
    }
}
