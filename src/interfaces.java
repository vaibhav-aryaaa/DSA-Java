interface Animal{
    int eyes= 2;
    public void walk(); // ye by default abstract and public hai, chahe hum public keyword hata bhi de
}

// similar like multiple inheritance but we can't use that in class in Java so we use interface for that in java
interface Herbivore{

}
//  dono ko implement kar diya, dono class ki properties ek saath leli hai horse ne; multiple inheritance
class Horse implements Animal, Herbivore{
    // yahan par public keyword use karna zaruri hai 
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
public class interfaces {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
