/*
Inheritance is of 3 types :-
    1. Single-Level Inheritance
    2. Multi-Level Inheritance
    (There is also Type called Multiple Inheritance available in some languages.
     But Java doesn't support Multiple Inheritance)

Let us see it through an Example :-
(See Class A,B,C,D,E)

class A
{
    // show
}

class B
{
    // show
}

class C extends A // Single-Level Inheritance.
{

}

class D extends C // Multi-Level Inheritance.
{

}

class E extends A,B{ // Multiple Inheritance
{

}
// Person obj = new Person();
// Obj.show();
// In this case, as the show method is available differently, it will create a problem called
   "AMBIGUITY PROBLEM / DIAMOND PROBLEM"

BUT WHEN WE EXTEND A SUPER CLASS,WE ALSO EXTEND THE OBJECT CLASS.
SO, IT CREATES MULTIPLE INHERITANCE.
BUT, THE SOLUTION IS THE SUPER-CLASS WILL EXTEND THE OBJECT CLASS A THE SUB-CLASS WILL EXTEND THE SUPER CLASS,
AND NOT THE OBJECT CLASS.
SO, IT BECOMES A MULTI-LEVEL INHERITANCE AND NOT MULTIPLE INHERITANCE.
LET US CLEAR IT THROUGH A DIAGRAM.

{
        SUPER-CLASS    OBJECT CLASS
            \               /
                SUB-CLASS             -> Multiple Inheritance (Not Supported)


SOLUTION :-

          OBJECT CLASS
                |
          SUPER-CLASS
                |
           SUB-CLASS                   -> Multi-Level Inheritance (Supported)
}
*/

// Every class in Java extends the Object class.
class Alien2 extends Object // Inheritance
{
    String name;
    private String tech;
    private int experience;
    private String laptop;

    /*
    If a Method doesn't do anything, we have to make it an "abstract" method using the "abstract" keyword.
    It is used if we want to just declare a method and do not define it.
    But if you use the "abstract" method, you have to make sure that is is in a abstract class too.
    We can also have an abstract class without actually having any abstract method.
    Example :-
     */
    abstract class demo
    {
        public abstract void DoSomething();
    }
    /*
    If a class only has abstract methods, we don't need to write "public" or "abstract" everytime before the methods.
    We can make it an interface class.
    Example :-
     */
    interface Person {
        void work(); // Already an abstract method.

        void jump(); // Already an abstract method.
    }


    /*
    Method Overriding (Dynamic PolyMorphism) is the Process by which,
    if there is already a user-defined method by a name (reference),
    IT WILL NOT EVEN CALL OR EXTEND ANY DEFAULT/SUPER CLASS METHODS BY THE SAME NAME.
    It is a part of PolyMorphism (See PolyMorphism).
     */

    public String toString() // Method Overriding
    {
        return "My To String";
    }
    /*
    Here, a predefined method was already existing in the Object class named toString.
    But after defining another toString Method, it didn't even call the Default toString Method (See line - 91).
    This is an Example of Method Overriding.
     */


    /*
    Method Overloading (Static PolyMorphism) means creating two different methods with the same name in a same place,
    but with different parameters.
    It is a part of PolyMorphism.
    Example :-
     */
    public class test{
        public void draw()
        {
            System.out.println("Drawing...");
        }
        public void draw(int x)
        {
            System.out.println("Drawing...");
        }
    }


    public Alien2(String name, String tech, int experience, String laptop) {
        this.name = name;
        this.tech = tech;
        this.experience = experience;
        this.laptop = laptop;
    }
    /*
    Encapsulation is the process to Privatize of the instance variables of a class
    and use Getters and Setters for them.
    It is a very good practice to Encapsulate classes.
    It is done so that no other classes or methods can access your class.
    Ex. - Instance variables are like the Properties of a Class.
          In Real world, we don't say our Properties (The things we know) to any other person.
          They will know only if they ask us.
          Similarly, Instance Variables can be accessed only if you call their method.
     */

    // Encapsulation :-
    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    public void buildProject() {
        System.out.println("In the buildProject method");
    }
}

/*
PolyMorphism :-
    It means - "ONE THING IS HAVING MANY FORMS" ('Poly' - means MANY, 'Morph' - means FORM)
    It is of 2 Types in Java :-
        1. Method Overriding (Dynamic PolyMorphism)
        2. Method Overloading (Static PolyMorphism)

    Let us understand it through the following example :-
 */

class Computer
{
    public static Computer getComputer()
    {
        return new Laptop();
    }

    public void show(){}
}

class Laptop extends Computer
{
    public void show()
    {
        System.out.println("Show Method of Laptop, you can carry me.");
    }
}

class Desktop extends Computer
{
    public void show()
    {
        System.out.println("Show Method of Desktop, you can't carry me.");
    }
}

// Execution Part.
public class MoreAboutOOPs {
    public static void main(String[] args) {
        Alien2 a1 = new Alien2("Darshan", "Java", 1,"HP");
        /*
        a1 - Object Reference;
        Alien - Class name (Data Type) for the Object;
        new Alien - The Real Object (Class Instance);
        new - Creates a Space in Alien Class for the Object;
        Alien() - Constructor for the Object;
        */
        a1.name = "Darshan";
        if(a1.name!=null) {
            System.out.print(a1.name + " (Length - ");
            System.out.println(a1.name.length() + ")");
        }
        a1.setTech("Java");
        if(a1.getTech()!=null) {
            System.out.print(a1.getTech() + " (Length - ");
            System.out.println(a1.getTech().length() + ")");
        }
        System.out.println(a1.toString());

        Computer lap1 = new Laptop();
        Computer comp = Computer.getComputer();
        Computer desk1 = new Desktop();
        comp.show();

        // The "final" Keyword
        final int value = 7; // "final" means Constant
        // value++; - will give an Error ("Cannot assign a value to a a final variable")

        // We can also use "final" keyword with a Class.
        // If we do so, no other classes can extend the Final Class.
        // A Final Class :-
        final class Herbivore // A class inside a Class is called an Inner Class.
        {
            public void getProperty()
            {
                System.out.println("Eats only plants.");
            }
        }
        /* Now, if we try to Use a sub-class for the final class,
          it will give Error ("Cannot inherit from final 'Herbivore'")
         */

        // We can also use the "final" keyword with a method.
        class sample
        {
            public final void demo()
            {
                System.out.println("This is a demo method.");
            }
        }
        // Now if we try to override it, we will get an Error. (Try it!)


        /* Summary of "final" keyword :-
               If we use the final keyword with a variable, it will make it constant.
               If we use it with a class it will be non-inheritable.
               If we use it with a method, then no other method can override it.
         */

    /*
        The "static" keyword is used to make a variable, method or class global.
        Example :- If we use a variable inside a class or method, it will not be available outside the same.
                   To make it available, we can use the "static" keyword.
                   (Try creating a class/method and create a normal variable inside it.
                    You can't access it, right?
                    To access it, use the "static" keyword before the variable.)

        Ex. - static int num = 12;
    */

    }
}
