class Animal{
	protected String name;
	protected int age;

	public Animal(String name , int age){
	this.name = name;
	this.age = age;
	}
	
	public void makeSound(){
		System.out.println(name +" makes sound");
	}
}
class Bird extends Animal{
	
	public Bird(String name , int age){
	super(name,age);
	}
	public void makeSound(){
	System.out.println(name + " makes sound");
}
}
class Dog extends Animal{
	public Dog(String name ,int age){
	super(name,age);
	}
	public void makeSound(){
	System.out.println(name +" makes sound");
	}
}
class Cat extends Animal{
	public Cat(String name , int age){
	super(name,age);
	}
}
public class AnimalInheritance1{
	public static void main(String args[]){
	Animal obj = new Animal("Domestic", 10);
	obj.makeSound();
	Animal c1 = new Cat("Cattie" , 5);
	c1.makeSound();
	Animal d1 = new Dog("Sheru",7);
	if(obj instanceof Dog){   //Returns false because obj is not instance of Dog as it is instance of animal which dog extends
	d1.makeSound();
	}
}
}
