package edu.hlibbabii.mapdsl.domain;

/**
 * Created by hlib on 12/1/15.
 */
public class Town extends DomainObject {
    private String id;
    private String name;
    private boolean capital;
    private int population;
    private Country country;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Town{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", capital=" + capital +
                ", population=" + population +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Town town = (Town) o;

        if (capital != town.capital) return false;
        if (population != town.population) return false;
        if (id != null ? !id.equals(town.id) : town.id != null) return false;
        if (name != null ? !name.equals(town.name) : town.name != null) return false;
        return !(country != null ? !country.equals(town.country) : town.country != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (capital ? 1 : 0);
        result = 31 * result + population;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}
