/*
Nitin Gupta

Homework 07

Cats and Dogs
 */

public class Animal {

    private String name;
    private double weight;

    public Animal()
    {
        this.name = "none";
        this.weight = 1;
    }

    public Animal(String aN, double aW) {
        this.setName(aN);
        this.setWeight(aW);
    }

    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }

    public void setName(String aN) {
        if (aN != null)
            this.name = aN;
        else
            this.name = "none";
    }

    public void setWeight(double aW)
    {
        if (aW >= 1)
            this.weight = aW;
        else
            this.weight = 1;
    }

    public boolean equals(Animal aA)
    {
        return aA != null &&
                this.name.equals( aA.getName() ) &&
                this.weight == aA.getWeight();
    }

    public String toString()
    {
        return "Name: " + this.name + " Weight: " + this.weight;
    }
}
