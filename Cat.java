/*
Nitin Gupta

Homework 07

Cats and Dogs
 */

public class Cat extends Animal{

    private String mood;

    public Cat()
    {
        this.mood = "sleepy";
    }

    public Cat(String aN, double aW, String aM)
    {
        super(aN, aW);
        this.setMood(aM);
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String aM) {

        if (aM == null)
        {
            this.mood = "sleepy";
        }
        else if (aM.equalsIgnoreCase("playful") ||
                aM.equalsIgnoreCase("hunger"))
        {
            // not checking for "sleepy" because that is checked in the else statement below
            this.mood = aM;
        }
        else
            this.mood = "sleepy";
    }

    public boolean equals(Cat aC)
    {
        return aC != null &&
                super.equals(aC) &&
                this.mood.equalsIgnoreCase( aC.getMood());
    }

    public String toString()
    {
        return super.toString() + " Mood: " + this.mood;
    }

}
