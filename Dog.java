//Savannah Switzer
package AssignmentSix;
public class Dog extends Pets{
    private boolean floopyEars;
    public Dog(String species, String name, int age, Boolean fEars){
        super(species, name, age);
        floopyEars = fEars;
}

    // Human-readable summary of this Dog's fields
    public String toString(){
        return "Dog(breed=" + getSpecies() + ", name=" + getName() + ", age=" + getAge() + ", floopyEars=" + floopyEars + ")";
    }
    // Dog-specific sound
    public void Speak(){
        System.out.println("Woof");
    }

}
