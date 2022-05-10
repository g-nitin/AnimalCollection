/*
Nitin Gupta

Homework 07

Cats and Dogs
 */

public class Wolf extends Dog {

    private String packLeader;

    public Wolf() {
        this.packLeader = "none";
    }

    public Wolf(String aN, double aW, int aEL, String aPL) {
        super(aN, aW, aEL);
        this.setPackLeader(aPL);
    }

    public String getPackLeader() {
        return packLeader;
    }

    public void setPackLeader(String aPL) {

        if (aPL == null)
        {
            this.packLeader = "none";
        }

        else
            this.packLeader =  aPL;
    }

    public boolean equals(Wolf aW) {
        return aW != null &&
                super.equals(aW) &&
                this.packLeader.equalsIgnoreCase( aW.getPackLeader() );
    }

    public String toString() {
        return super.toString() + " Pack Leader: " + this.packLeader;
    }
}

