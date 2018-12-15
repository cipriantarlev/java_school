package polymorphism;

public class OOP {

	public static void main(String[] args) {
		Animal [] animalute = new Animal [] {};
		Animal [] animalutez = new Animal [5];
		
		Animal animal = new Tiger();
		animal.eats();
		
		Tiger tiger = new Tiger();
		Dog dog = new Dog();
		Horse horse = new Horse();
		
		Animal [] animals = {tiger,dog, horse, horse};
		System.out.println("Animale din array:\n");
		for (Animal animalush : animals) {
			animalush.eats();
			animalush.sleep();
			System.out.println();
		}
	}
}
