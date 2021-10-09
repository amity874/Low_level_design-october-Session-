package OpenClose;

public class AnimalController {
    public static void main(String[] args) {
        AnimalFeeder a=new AnimalFeeder();
        Dog d=new Dog();
        a.feedAnimal(d);
        a.showerAnimal(d);
    }
}
