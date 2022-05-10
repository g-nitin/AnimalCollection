/*
Nitin Gupta

Homework 07

Cats and Dogs
 */

public class AnimalCollection {

    private Animal[] animals;
    public static final int SIZE = 10; // size of the array

    public AnimalCollection()
    {
        this.animals = new Animal[SIZE];
    }

    /**
     * Takes in an instance of an Animal and adds it to the array if it is not already full.
     * @param aA The instance of Animal
     */
    public void addAnimal(Animal aA) {
        if (aA == null) {
            return; // stops the method right here if the input is null
        }

        // ASSUMPTION THAT ALL THE DATA IS KEPT TO THE LEFT (THE START)
        // and everything else is null

        if (animals[animals.length-1] != null) // the last index
        {
            return; // stop the method right here if the list is full
        }

        for (int i = 0; i < animals.length; i++)
        {
            if (animals[i] == null)
            {
                animals[i] = aA;
                break; // terminates the for-loop
            }
        }

    }

    /**
     * Takes in the name and removes the first instance of an animal with that name.
     * @param name String representation of the name of the Animal
     */
    public void removeAnimal(String name)
    {
        if (name == null)
            return; // stops the method right here if the input is null

        // need to check if the aA.getName() value is even in the array...

        // search array for name
        int removeIndex = -1; // sentinel value
        for (int i = 0; i<animals.length; i++)
        {

            if (animals[i] != null && animals[i].getName().equalsIgnoreCase( name ))
            {
                removeIndex = i;
                break;
            }

        }

        if (removeIndex == -1) // no name from the input parameter is present in the array
        {
            System.out.println("This animal does not exist!");
            return; // so stop the method
        }

        else // shift the array...
        {
            for (int i=removeIndex; i<animals.length-1; i++) // start at the index to be removed
                animals[i] = animals[i+1]; // shift the places to the left

            // because value removed by shifting, then last value is null
            animals[animals.length - 1 ] = null;
        }

    }

    /**
     * Method prints the Animals array to the console
     */
    public void printAnimals()
    {
        for (int i = 0; i<animals.length; i++)
        {
            if (animals[i] == null)
                break; // means the array from this place forward is empty

            System.out.println( animals[i] );
        }
    }
}
