package innerclass;

public class Outerclass {
			private int num=110;
			
			public void show()
			{
				 class Inner
				 {
					 
					 	public void method()
					 	{
					 		System.out.println(num);
					 	}
					 
				 }
				 
				 Inner i=new Inner();
				 i.method();
			}
}
