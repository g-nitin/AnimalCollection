/*
Nitin Gupta

Homework 07

Cats and Dogs
 */

import java.util.Scanner;

public class AnimalCollectionFE {

    public static Scanner keyboard = new Scanner(System.in);
    public static AnimalCollection aCollection = new AnimalCollection();

    public static void main(String[] args) {

        System.out.println("Welcome to your collection of animals.");

        boolean quit = false;
        while (!quit)
        {

            // give choice...
            System.out.println("""
                    
                    Enter 1. Add animal to the collection
                    Enter 2. Remove animal from the collection
                    Enter 3. Print the animals in the collection
                    Enter 9. To Quit.""");
            int decision = keyboard.nextInt();
            keyboard.nextLine(); // fix-up

            switch (decision)
            {
                case 1:
                    aCollection.addAnimal( makeAnAnimal() );
                    break;

                case 2:
                    aCollection.removeAnimal( makeAnAnimal().getName() );
                    break;

                case 3:
                    aCollection.printAnimals();
                    break;

                case 9:
                    quit = true;
                    break;

                default:
                    System.out.println("Invalid input.");

            }

        }

    }

    /**
     * Makes an instance of Animal based on the user choice
     * @return an instance of Animal based on the user input
     */
    public static Animal makeAnAnimal()
    {
        Animal someAnimal;

        // give choice...
        System.out.println("""
                    
                    Enter 1. If it is a cat
                    Enter 2. If it is a dog""");
        int animalChoice = keyboard.nextInt();
        keyboard.nextLine(); // fix-up

        System.out.println("Enter the name: ");
        String animalName = keyboard.nextLine();
        System.out.println("Enter its weight: ");
        double animalWeight = keyboard.nextInt();
        keyboard.nextLine();

        switch (animalChoice)
        {
            case 1: // within a cat
                someAnimal = makeACat(animalName, animalWeight);
                break;

            case 2: // within a dog
                someAnimal = makeADog(animalName, animalWeight);
                break;

            default:
                someAnimal = new Animal(animalName, animalWeight);
        }

        return someAnimal;

    }

    /**
     * Makes an instance of the Cat class
     * @param name the name of the Animal which is the same for every Cat instance
     * @param weight the weight of the Animal which is the same for every Cat instance
     * @return an instance of the Cat class based on the user input
     */
    public static Animal makeACat(String name, double weight)
    {
        Animal someCat;

        // give choice...
        System.out.println("""
                    
                    Enter 1. If it is a house cat
                    Enter 2. If it is a leopard""");
        int catChoice = keyboard.nextInt();
        keyboard.nextLine(); // fix-up

        System.out.println("Enter its mood: ");
        String catMood = keyboard.nextLine();

        switch (catChoice)
        {
            case 1: // house cat
                System.out.println("Enter its type: ");
                String houseCatType = keyboard.nextLine();
                someCat = new HouseCat(name, weight, catMood, houseCatType);
                break;

            case 2: // leopard
                System.out.println("Enter the number of spots: ");
                int leopardSpots = keyboard.nextInt();
                keyboard.nextLine();
                someCat = new Leopard(name, weight, catMood, leopardSpots);
                break;

            default: // cat
                someCat = new Cat(name, weight, catMood);
        }

        return someCat;
    }

    /**
     * Makes an instance of the Dog class
     * @param name the name of the Animal which is the same for every Dog instance
     * @param weight the weight of the Animal which is the same for every Dog instance
     * @return an instance of the Dog class based on the user input
     */
    public static Animal makeADog(String name, double weight)
    {
        Animal someDog;

        // give choice...
        System.out.println("""
                    
                    Enter 1. If it is a domestic dog
                    Enter 2. If it is a wolf""");
        int dogChoice = keyboard.nextInt();
        keyboard.nextLine(); // fix-up

        System.out.println("Enter its energy level: ");
        int dogEL = keyboard.nextInt();
        keyboard.nextLine();

        switch (dogChoice)
        {
            case 1: // domestic dog
                System.out.println("Enter its type: ");
                String domesticDogType = keyboard.nextLine();
                someDog = new DomesticDog(name, weight, dogEL, domesticDogType);
                break;

            case 2: // wolf
                System.out.println("Enter the pack leader name: ");
                String pLeaderName = keyboard.nextLine();
                someDog = new Wolf(name, weight, dogEL, pLeaderName);
                break;

            default: // dog
                someDog = new Dog(name, weight, dogEL);
        }

        return someDog;
    }

}
