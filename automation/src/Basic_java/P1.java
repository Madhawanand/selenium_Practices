package Basic_java;

public class P1 
{
	static int a=10;
	int d=30;
			static String name() 
			{
			String Name="Madhav";
				return Name;
			}
	public static void main(String[] args) 
	{
		System.out.println("welcome back after long time ");
		// TODO Auto-generated method stub
         //P1.name();
         System.out.println(name());
         int b=20;
         int c=a+b;
         P1 ref=new P1();
         
       int e=a+b+ref.d;
         System.out.println("sum of a and b is"+c);
 
         //System.out.println("sum of a,b,c is"+(ref.d+a+b));
         //System.out.println(e);
         
         int[]a= {10,20,30,40,50};
         
         for (int i : a)
         {
        	 System.out.println(i);
        	 int  f=10+i;
        	 
        	 System.out.println(f);
        	 
			
		}
	}

}
