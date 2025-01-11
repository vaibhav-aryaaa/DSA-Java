class Pen{
    String color;
    String type; // ballpoint; gel;
    

    // har ek objext ke pass uski kuch props hoti hai and kuch methods hote hai, ye props hoti hai jaise color, type and methods togethers are called as DATA and MEMEBERS of a CLASS. data aur memebers yaani data jo bhi usme store ho rha hai string, int, type ka data aur members yaani uske functions.
    public void write(){
        System.out.println("write something");
    }
    
    public void printColor(){
        System.out.println(this.color);
        // this is a keyword of java, ab jo bhi object iss function ko call kar rhi hogi, uska ye color print karwa dega, this ye function ko btayega ki isse kis object ne call kiya hai
}
}

// classes ke naam capital letter se shuru hote hai by covnentions, functions ke naam by convention small letter se shuru hote hai
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // TYPES of constructor
    // 1- Non-parameterised constructor: vo constructors jiske andar parameters nahi hote
    Student(){
        System.out.println("constructor called");
    }
    //  so ab jab bhi "student waala method call hoga toh ye bhi saath-saath run hojayegi"
    // java by default non-parameterised constructor bana deta hai, tabhi humara method khud se chal rha tha pehle bhi.
    // 2- Parameterised constructor: vo constructors jiske andar parameters hote, isme intitalisation khud se kar sakte hai
    Student(String name, int age){
        this.name = name;
        this.age = age;
        // this.name is object ka naam and only name jo hai vo string name(argument) hai
    }
    // 3- Copy constructor: ek object ko copy karke doosre object mein daal dena
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    // ye student 2 ki saare info ko copy karke apne current object mein daal rha hai


}
public class OOPS {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "black"; 
        // pen2.type = "ballpoint";

        // pen1.printColor();
        // pen2.printColor();

// jaisi hi "new" keyword humne laga diya, memory heap ke andar ek jagah allocate hojayegi, usss jagah ke andar pori ki pori object jaake store ho jaayegi, toh vo jagah humne object ke hisaab se allocate kar di hai
// here "Student()" is a special type of fucntion called as CONSTRUCTORS, ye java ki objects ko construt karte hai, toh hum object ko 3 tarah se bana sakte hai/ construct kar sakte hai 


// ye niche waala is parameterized constructor
// Student s1= new Student("aman", 24);
// s1.printInfo();
// in case of Parameterized constructor jab bhi hum student ko create karenge toh hume constructor ke andar name and age pass karni padhegi.....
// toh humne parameterized constructor mein dekha ki humne parameters pass kar diye, uske baad usne unhe object mein assign kar diya and finally humare pass info print hogayi function se


// ye niche waala is copy constructor
Student s1= new Student();
s1.name= "Amanda";
s1.age=24;

Student s2= new Student(s1); // copy constructor call
s2.printInfo();

// Agar hum copy constructor ko call kiya hai toh hume    Student s1= new Student();  Ko bhi define karna padhega kyuki ye by default nahi ban rha in case of MADAM Ka VS CODE but mere mein without it bhi chal rha hai

// properties of constructor
//  property 1- object ka ya class ka jo constructor hoga, uska same naam hoga jo class ka hoga
//  property 2- constructors kuch return nahi karte, vo methods and functions hi hote hai par vo kuch return nahi karte, na unka koi return type hota hai
//  property 3- ek object ke liye constructor sirf ek hi baar call ho sakta hai,vo bhi jab koi object create hota hai.

    }
}



