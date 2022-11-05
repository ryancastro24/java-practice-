
//grand parent class
class Animals{
	public void animalSound(String sound){
		System.out.println(sound);
	}
}

//parent class

class Dog extends Animals{
	public void animalSound(String sound){
		System.out.println(sound);
	}
}

//sub class

class Pig extends Animals{
	public void animalSound(String sound){
		System.out.println(sound);
	}
}
//main class
public class Polymor{
	public static void main(String[] args) {
	
		Animals myAnimal = new Animals();
		Animals myDog = new Dog();
		Animals myPig = new Pig();

		myAnimal.animalSound("rarrr!");
		myDog.animalSound("woof!");
		myPig.animalSound("oink!");


	}
}