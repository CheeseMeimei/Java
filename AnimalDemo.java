package interfacee;

public class AnimalDemo {

	public static void main(String[] args) {
				Jumpping j=new Cat();
				j.jump();
				
				Jumpping u=new Dog();
				u.jump();
				
				Animal  a=new Cat("布偶",18);
				a.eat();
				
				Cat c=new Cat();
				c.eat();
				c.jump();
	}

}
