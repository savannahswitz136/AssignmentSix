//Savannah Switzer
package AssignmentSix;
import java.util.ArrayList;


public class PetDriver {
    public static void main(String[] args) {
        // List holds any Pets subtype (Dog, Cat, etc.)
       ArrayList<Pets>pets = new ArrayList<>();

        // Add a mix of Dogs and Cats to the list
        pets.add(new Dog("Begal", "Jon", 5, true ));
        pets.add(new Dog("Lab","Suzie", 2, true ));
        pets.add(new Cat("Bangal", "Cassie",6,  false));
        pets.add(new Cat("Ragdoll", "Rick", 9, true));

        // Print each pet with its index; toString() resolves polymorphically
        for (int i = 0; i< pets.size(); i++) {
            System.out.println("["+ i + "]" + pets.get(i));
        }

}
}
