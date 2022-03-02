package inherited;

abstract class Animal {
	public abstract String speak();
}

class Cow extends Animal {
	public String speak() {
		return "Moo moo";
	}
}

class Dog extends Animal {
	public String speak() {
		return "Woof woof";
	}
}

public class AnimalPet {
	public static Animal[] animals;
	
	public static void petIt(Animal animal) {
		System.out.println(animal.speak());
	}
	
	public static void main(String[] args) {
		Cow cow = new Cow();
		Dog dog = new Dog();
		
		petIt(cow);
		petIt(dog);
		
		animals = new Animal[2];
		animals[0] = cow;
		animals[1] = dog;
		
		for (Animal animal: animals) {
			petIt(animal);
		}
	}
}
