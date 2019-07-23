class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Eating Meat Again");
	}
	void bark()
	{
		System.out.println("Barking");
	}
}
class Test
{
	public static void main(String[] args) {
		Animal a=new Dog();
		a.eat();
		//a.bark();
	}
}















