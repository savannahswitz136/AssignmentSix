//Savannah Switzer
package AssignmentSix;

public class Cat extends Pets{
    private boolean clawed;
    public Cat(String species, String name, int age, Boolean claws){
        super(species, name, age);
        clawed = claws;
}
    // Human-readable summary of this Cat's fields
    public String toString(){
        return "Cat(breed=" + getSpecies() + ", name=" + getName() + ", age=" + getAge() + ", Clawed=" + clawed + ")";
    }
    // Cat-specific sound
    public void Speak(){
        System.out.println("Meow");
    }

}

