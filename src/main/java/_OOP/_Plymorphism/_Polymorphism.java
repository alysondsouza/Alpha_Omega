//POLYMORPHISM

package _OOP._Plymorphism;

//Polymorphism is the ability of an object to take on many forms.
//The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
//Any Java object that can pass more than one IS-A test is considered to be polymorphic.

public class _Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }

    //INNER CLASSES
    static class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    static class Pig extends Animal { //Each of these classes can provide its own implementation of the interface.
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    static class Dog extends Animal { //Each of these classes can provide its own implementation of the interface.
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }
}