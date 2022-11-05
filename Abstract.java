import java.util.*;


abstract class Animals{ //abstract class
	public abstract void animalSound();// empty abstrack method
	public void sleep(){ // regular method
		System.out.println("zzzZZZ");
	}
}
//dog class extend animals class to access attributes and methods
class Dog extends Animals{
	public void animalSound(){
		System.out.println("Woof!");
	}

}
class Pig extends Animals{
	public void animalSound(){
		System.out.println("oinks");
	}
}
// this is the main class
public class Abstract{
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.animalSound();
		myDog.sleep();
		Pig myPig  = new Pig();
		myPig.animalSound();
	}
}