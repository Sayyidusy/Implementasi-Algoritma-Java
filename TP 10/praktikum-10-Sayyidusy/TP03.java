public class TP03 {

	public static void main(final String[] args) {
	

	for(int i=2;i<=100;i++)
	{
	int angka=0;
	for(int j=1;j<=i;j++)
	{
	   if(i%j==0)
	   {
	        angka++;        
	   }
	}
	if(angka==2)
	       System.out.print(i+" ");     
	}
	}
}