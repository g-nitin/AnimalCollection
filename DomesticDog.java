/*
Nitin Gupta

Homework 07

Cats and Dogs
 */

public class DomesticDog extends Dog {

    private String type;

    public DomesticDog() {
        this.type = "Mutt";
    }

    public DomesticDog(String aN, double aW, int aEL, String aT) {
        super(aN, aW, aEL);
        this.setType(aT);
    }

    public String getType() {
        return type;
    }

    public void setType(String aT) {
        if (aT == null)
        {
            this.type = "Mutt";
        }
        else if (aT.equalsIgnoreCase("Retriever") ||
                aT.equalsIgnoreCase("Terrier") ||
                aT.equalsIgnoreCase("Husky"))
        {
            this.type = aT;
        }

        else
            this.type = "Mutt";
    }

    public boolean equals(DomesticDog aDD) {
        return aDD != null &&
                super.equals(aDD) &&
                this.type.equalsIgnoreCase( aDD.getType() );
    }

    public String toString() {
        return super.toString() + " Type: " + this.type;
    }
}

