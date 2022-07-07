package interfacee;

public class Cat extends Animal implements Jumpping{
			public Cat() {}
			
			public Cat(String name,int age) 
			{
				super(name,age);
			}
			
			public  void eat() 
			{
				System.out.println("猫猫吃饭");
			}
			
			public void jump()
			{
				System.out.println("猫猫跳高");
			}
}
