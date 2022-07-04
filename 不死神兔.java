public class chiken{
	public static void main(String[] args){
		int[] arry=new int[20];
		arry[0]=1;arry[1]=1;
		for(int i=2;i<20;i++){
			arry[i]=arry[i-2]+arry[i-1];
}
		System.out.print(arry[19]);
}
}