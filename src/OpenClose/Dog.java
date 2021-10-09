package OpenClose;
public class Dog implements Animal,ShowerAnimal{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void ShowerAnimal() {
        System.out.println("Dog is bathing");
    }
}
