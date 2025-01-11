// abstract kiya kyuki ye sirf ek concept/blueprint hai for other class like horse and chicken, here walk function ka koi kaam nahi hai, sabpe ye hona chaiye toh humne isse abstract kar diya
abstract class Animal{
    Animal(){
        System.out.println("you are creating a new Animal");
    }
    abstract void Walk();
    public void eat(){
        System.out.println("animal eats");
    }

}
class Horse extends Animal{
    Horse(){
        System.out.println("created a horse");
    }
    public void Walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void Walk(){
        System.out.println("walks on 2 legs");
    }
}

















public class abs {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.Walk();
        // Animal animal = new Animal();
        // animal.Walk(); // error, kyuki animal class sirf ek abstract hai, ek bluprint/concept hai, isse actually nahi create kara jaa sakta. This gave runtime error.
        horse.eat();
    }
}
