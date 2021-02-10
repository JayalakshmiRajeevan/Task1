package task1;

class Animals
{
	void sound()
	{
		System.out.println("Animal is making sound");
	}
}
class Dog extends Animals
{
	void sound()
	{
		System.out.println("Dog is barking");
	}
}
class Horse extends Animals
{
	void sound()
	{
		System.out.println("Horse is neighing");
	}
}
class Cat extends Animals
{
	void sound()
	{
		System.out.println("Cat is meowing");
	}
}

public class Animal
{
	public static void main(String[] args)
	{
		Animals d=new Dog();
		d.sound();
		
		Animals h=new Horse();
		h.sound();
		
		Animals c=new Cat();
		c.sound();
	}
}
