// sub class / child class

public class Dog extends Animal{
    
    public void sound()
    {
        // implementation
        System.out.println("bow");
    }

    // child only method
    public void walk()
    {
        System.out.println("dog run behind bikes");
    }

    public static void main(String[] args) {

        Animal a = new Animal();

        Animal d = new Dog();

        a.sound();
        d.sound();
        
    }
}
