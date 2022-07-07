package interfacee;

public abstract class Animal {
				private String name;
				private int age;
			
				public Animal(){}//无参构造函数
				public Animal(String name,int age){
				this.name=name;
				this.age=age;
			}
				public void setname(String name){
				this.name=name;}
				public String getname(){
				return  name;}
				public void setage(int age){
				this.age=age;}
				public int getage(){
				return  age;}
				public abstract void eat();
}
