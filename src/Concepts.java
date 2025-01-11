// 1. Encapsulation :- Wrapping up of data member (variables) and member function (method) together into a single unit called is known as encapsulation .
// 2. Abstruction :- It is the act of representung essential features of class without including the background details. ex :- switch board , etc.
// 3. Polymorphism :- It is the ability of an object to behave in different form according to the message passed to it. In java it is implimentes due to function ove loading 
// 4. Inheritance :- It is the ability of an object to acquire the properties of another class.

//  automatically garbage collectors so isme hume destructors(created object ko delete karne ke liye) likhne ki zarurat nahi padhti

// 1- POLYMORPHISM- 2 shabdo se milke bana hai poly=many and morphism means forms , jab hum ek hi kaam ko alag alag tareeke se java ke andar karte hai toh usko hum polymorphism kehte hai
// iske bhi 2 types hote hai, function OVERLOADING(Compiletime polymorphism) and FUCNTION OVERRIDING(Runtime polymorphism, ye inheritance mein use hoga) 

// COMPILETIME POLYMORPHISM ya fir FUNCTION OVERLOADING, different different functions create kar dena aur unn functions ke same naam hote hai   DOUBT-Method Overloading in Java is a feature that allows a class to have multiple methods with the same name but different parameter lists. It enhances program readability and allows methods to perform similar functionality with varying inputs. rertun type does not play any role in function overloading. If there are two functions with same name and same parameter list, then comp iler will throw an error. This is because the java compiler cannot differentiate between two methods based on their return type.

// class Student {
//     String name;
//     int age;

//     public void printInfo(String name) {
//         System.out.println(name);
//     }

//     public void printInfo(int age) {
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age) {
//         System.out.println(name + " " + age);
//     }

// }

// public class Concepts {
//     public static void main(String args[]) {

//         Student s1 = new Student();
//         s1.name = "Amanda";
//         s1.age = 24;

//         s1.printInfo(s1.name, s1.age);
//         s1.printInfo(s1.age);
//         s1.printInfo(s1.name);

//     }
// }










// 2-INHERITANCE ek class ki properties ya fir methods jab doosri class lena chahti hai. Reusability badhti hai. Jis class se property li jaati hai, usse kehte hai base class or parent class aur jisme property inherit kari jaati hai,  usse kehte hai sub class or child class.
// inheritance ke java ke andar 4 types hote hai aur C++ ke andar 5(extra= multiple inheritance, but ye concept java mein interfaces mein hota hai) types hote hai
// class Shape{
//     String color;
// }
// // triangle ne inherit kar liya shape class ki property ko using "extends" keyword
// class Triangle extends Shape {

// }

// public class Concepts{
//     public static void main(String[] args) {
//         Triangle t1= new Triangle();
//         t1.color="red";
// }
// }


// types 
// 1.Single level inheritance
    // base class
    // |
    // v
    // derived class
// class Shape {
//     public void area(){
//         System.out.println("displays area");
//     }
// }
// // here triangle is derived class and shape is base class
// class Triangle extends Shape {
//     public void area(int l, int h ){
//         System.out.println(1/2*l*h);
//     }
// }

// public class Concepts {
//     public static void main(String[] args) {
   
//     }

// }


// 2.Multiple levels inheritance
    // base class 
    // |
    // v
    // derived class 
    // |
    // v
    // derived class 
// class Shape {
//     public void area(){
//         System.out.println("displays area");
//     }
// }
// // here triangle and euilateraltriangle are derived class and shape is base class
// class Triangle extends Shape {
//     public void area(int l, int h ){
//         System.out.println(1/2*l*h);
//     }
// }
// class EquilateralTriangle extends Triangle {
//     public void area(int l, int h){
// System.out.println(1/2*h*l);
//     }
// }

// public class Concepts {
//     public static void main(String[] args) {
   
//     }

// }



// 3.heirarchial inheritance ek hi class hai aur multiple derived classes ne ussi same base class ko inherit kar rakha hai
            //   Base class
//             /           \
    // derived class     // derived class
import java.util.*;

import bank.Account;
    class Shape {
        public void area(){
            System.out.println("displays area");
        }
    }

    class Triangle extends Shape {
        public void area(int l, int h ){
            System.out.println(1/2*l*h);
        }
    }
    class Circle extends Shape {
        public void area(int r){
            System.out.println((3.14)*r*r);
        }
    }
    
    public class Concepts {
        public static void main(String[] args) {
       bank.Account account1 =new bank.Account();
       account1.name="customer1";
        }
    
    }

   

























    
// 4.Hybrid Inheritance 
            //   Base class
//             /           \
    // derived class     // derived class
//                            \
                            // derived class

// 5.Multiple Inheritance classes ki form mein java mein nahi hota, C++ mein hota hai , instead of this java mein hum interfaces ko use karte hai usse implement karne ke liye



// PACKAGES- iske andar hum related code likhte hai, 2 types- built-in and user defined.


// ye PACKAGES and ACCESS MODIFIERS  account.java par test ho rha hai 
// import java.util.*; allows you to use all classes and interfaces from the java.util package, like ArrayList, HashMap, Scanner, Date, etc., without needing to write java.util each time. It simplifies coding but can include unnecessary imports.



// ACCESS MODIFIERS 4 types(public, private, protected and default); isse ye define hota hai ki kaunsi cheez kisko accessible hogi

// 1.Public- isse humari info pori ki pori class mein koi bhi access kar sakta hai, saath ke sath koi doosre package mein bhi access kar sakta hai, yahi kahin se bhi kisi ne object bana liya toh koi bhi isse access kar sakta hai EX- public string name
// 2.default- ye hume khud se specify nahi karna padhta, ye already exist karta hai, yani kisi bhi property ke saamne, kisi bhi parameter ke saamne, kisi bhi function ke saamne agar aap kuch bhi nahi lagate toh vo default type ka hojata hai, yaani apne package ke andar usse saare cheeze access kar paayengi bas koi doosra package usko access nahi kar paayega.
// 3.Protected- usme apni package mein toh saari cheeze access kar sakti hai, saath hi saath agar doosre package mein karna hai toh sirf sub classes access kar sakti hai, baaki koi access nahi kar sakta
// 4.private-private ko class ke bahar koi bhi access nahi kar sakta, sirf ek class ke andar hi usko access kiya jaa sakta hai, na koi sub class na koi aur class uske package mein access kar paayengi, na kisi bahar ke package ko access milega. Protected member can be accessed by any class in the same package 
// and by subclasses in other packages.
// private ko access karne ke liye we use "GETTERS(Yaani uss private cheez ki info aap wapas de dijiye) and SETTERS(uss private cheez ki aap koi value set kar dijiye) FUNCTIONS". So iss tareeke se hum directly uss private cheez ko access nahi kar rhe instead uske liye function bana liye.

// ye private waala VS mein nahi chala, intelliJ mein chala hai 


// 3- ENCAPSULATION- aap data aur uske functions ko combine karde ek hi entity mein; Data(humari class ki props) and uske Functions)(usme likhe hue methods) inn dono ko combine karke humne ek unit ke andar daal diya aur iss unit ko humne naam de diya hai class. this is called as encapsulation here means kisi cheez ko dhak lena. matlab classes bana aur objects banaana is encapsulation. ENCAPSULATION se DATA HIDING ka concept possible ho pata hai java mein, DATA HIDING- jo data user ko dikhana nahi hai, jo sensitive data hai usse aap chupa lete hai. DATA HIDING ko hum access modifier ki help se implement karte hai. Data hiding is the process of protecting members of class from unintended changes


// 4- ABSTRACTION is hiding the implementation details and showing only important/useful parts to the user. Can be implemented using 2 methods: 1. Using abstact keyword, abstract classes banaye, functions banaye, props banaye. 2. Using Interfaces.  

// PROPS OF abstact
// . An abstract class must be declared with an abstract keyword.
// . it can have abstract and non-abstract methods.
// . it cannot be instantiated.( matlab object nahi bana sakte) 
// . it can have constructor and static methods also. ( jab bhi aap derived class ka object create karte hai, toh sabse pehle base class ka constructor call hota hai fir derived class ka constructor call hota hai, Isse JAVA mein CONSTRUCTOR CHAINING kehte hai jab bhi hum inheritance mein constructor banane ki koshish karte hai)
// . it can have final methods which will force the sublcass not to change the body of the method.



// INTERFACES for abstraction- saari useless info hide kar degi aur, saari useful info user ko dikha degi. INTERFACES is similar like class bas inme kuch fix properties hoti hai. Inke constructors nahi ho sakte. inke andar koi non-abstract function nahi hona chaiye, na hi function ki implementation honi chaiye, toh usko hum nahi implement kar sakte, animal ki jo property hogi usko specific animal hi implement karega. Instead of "extends" we use "implement" keyword

// PROPS of interface
// . All the fields in the interfaces are public, static and final by default.matlab agar humne jaise animal interface mein int eyes=2; declare kara toh vo sabke liye fix and same hongi.
// . All methods are public and abstract by default.
// . A class that implements an interface must implement all the methods declared in the interface.
// . Interfaces support the functionality of multiple inheritance.



// STATIC keyword- vo cheeez jo sabke liye accessible hai not like public; static hum unn properties ko btate hai jo class ke liye common hoti hai. Abhi tak hum student class ka pehle object bnate thee fir . karke cheezo ko access krte thee. Lekin jin cheeezo ko hum static banate hai,unko hum class ke naam se access kar sakte hai kyuki vo class ki cheeeze hai object ki cheeze nahi hai.  kuch function bhi static ho sakte hai jinhe hum class ke thru call karte hai.
// it can be used using 4 ways------ properties ke saamne laga sakte hai, functions ke saamne laga sakte hai, blocks ke saamne laga sakte hai jaise humne kisi block ko static rakhna hai, ya fir kisi nested class ke andar laga sakte hai.
// jo bhi cheeze static hoti hai, unko memory ek hi baar di jaati hai aur jo object ki cheeze hoti hai unko memory baar baar di jaati hai, isliye hume jab bhi memory bachani hai aur humare pass common infor hai toh uss variable ya function ko static bana dete hai.