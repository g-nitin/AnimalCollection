/*
Nitin Gupta

Homework 07

Cats and Dogs
 */

public class HouseCat extends  Cat {

    private String type;

    public HouseCat() {
        this.type = "Short Hair";
    }

    public HouseCat(String aN, double aW, String aM, String aT) {
        super(aN, aW, aM);
        this.setType(aT);
    }

    public String getType() {
        return type;
    }

    public void setType(String aT) {

        if (aT == null) {
            this.type = "Short Hair";
        }

        else if (aT.equalsIgnoreCase("Ragdoll") ||
                aT.equalsIgnoreCase("Sphinx") ||
                aT.equalsIgnoreCase("Scottish Fold"))
        {
            this.type = aT;
        }

        else
            this.type = "Short Hair";
    }

    public boolean equals(HouseCat aHC) {
        return aHC != null &&
                super.equals(aHC) &&
                this.type.equalsIgnoreCase(aHC.getType());
    }

    public String toString() {
        return super.toString() + " Type: " + this.type;
    }
}

