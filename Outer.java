package innerclass;

public class Outer {

				private int num=10;
				
				private class Inner
				{
						public void show()
						{
								System.out.println(num);
						}
				}
				
				public void show()
				{
						Inner i=new Inner();
						i.show();
				}
	
}
