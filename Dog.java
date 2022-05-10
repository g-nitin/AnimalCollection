/*
Nitin Gupta

Homework 07

Cats and Dogs
 */

public class Dog extends Animal{

    private int energyLevel;

    public Dog()
    {
        this.energyLevel = 0;
    }

    public Dog(String aN, double aW, int aEL)
    {
        super(aN, aW);
        this.setEnergyLevel(aEL);
    }

    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public void setEnergyLevel(int aEL)
    {
        if (aEL >= 0 && aEL <= 100)
            this.energyLevel = aEL;
        else
            this.energyLevel = 0;
    }

    public boolean equals(Dog aD)
    {
        return aD != null &&
                super.equals(aD) &&
                this.energyLevel == aD.getEnergyLevel();
    }

    public String toString()
    {
        return super.toString() + " Energy Level: " + this.energyLevel;
    }



}
