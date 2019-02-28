package models;

import java.math.BigDecimal;
import java.util.TreeMap;

public class Continents
{
    private TreeMap<String, Continent> continents = new TreeMap<>();

    public Continents()
    {
        Continent africa = new Continent("Africa", 30244049, 4900, 1215770813, "africa.jpg", 54, "Nile", "Josh", "Josh.jpg", 532);
        Continent asia = new Continent("Asia", 44391162, 8849, 4406273622L, "asia.jpg", 48, "Yangtze", "Josh", "Josh.jpg", 5332);

        continents.put(africa.getName(), africa);
        continents.put(asia.getName(), asia);
    }


}
