package OpenClose;

public class Cat implements Animal,ShowerAnimal{

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void ShowerAnimal() {
        System.out.println("Cat is taking shower");
    }
}