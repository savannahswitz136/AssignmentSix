//Savannah Switzer
package AssignmentSix;

// Base class for all pet types; subclasses add their own traits and Speak() behavior
public abstract class Pets {
    private String species;
    private String name;
    private int age;

    public Pets(String species, String name, int age){
        this.species = species;
        this.name = name;
        this.age = age;
    }
    public String getSpecies(){
        return species;
    }
   public String getName(){
        return name;
   }
   public int getAge(){
        return age;

   }
   // Placeholder; each subclass provides its own sound
   public void speek(){

   }
}


