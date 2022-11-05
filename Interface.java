
interface Animals{

	int x = 10;
	public void animalSound();
	public void run();
}

interface Movement{
	public void eating();
}

class Dog implements Animals, Movement {

	
	public void animalSound(){
		System.out.println("woof!");
	}
	public void run(){
		System.out.println("running");
	}
	public void eating(){
		System.out.println("The dog is eating...");
	}
}



public class Interface{
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.animalSound();
		myDog.run();
		myDog.eating();
		//System.out.println(myDog.x);


	}
}