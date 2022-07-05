package chouxiangduotai;

public abstract class Animal {
				private final String name="北京";
				private int age=20;
				public Animal() {}
				public Animal(int age) 
				{
					this.age=age;
				}
				public void show()
				{
					System.out.println(age);
					System.out.println(name);
				}
				public abstract void eat();
				
}
