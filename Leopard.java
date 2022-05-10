/*
Nitin Gupta

Homework 07

Cats and Dogs
 */

public class Leopard extends  Cat {

    private int numberOfSpots;

    public Leopard() {
        this.numberOfSpots = 1;
    }

    public Leopard(String aN, double aW, String aM, int aNS) {
        super(aN, aW, aM);
        this.setNumberOfSpots(aNS);
    }

    public int getNumberOfSpots() {
        return numberOfSpots;
    }

    public void setNumberOfSpots(int aNS)
    {
        if (aNS >= 1)
            this.numberOfSpots = aNS;
        else
            this.numberOfSpots = 1;
    }

    public boolean equals(Leopard aL)
    {
        return aL != null &&
                super.equals(aL) &&
                this.numberOfSpots == aL.getNumberOfSpots();
    }

    public String toString() {
        return super.toString() + " Number of Spots: " + this.numberOfSpots;
    }
}

