package interfacee;

public class Dog extends Animal implements Jumpping{
				public Dog() {}
				
				public Dog(String name,int age) 
				{
					super(name,age);
				}
	
				public  void eat() 
				{
					System.out.println("狗狗吃饭");
				}
				
				public void jump()
				{
					System.out.println("狗狗跳高");
				}
}
