package Basic_java;

public class split {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String a="24/nov/2021";
		String[] day=a.split("/");
		String comb=day[0];
		System.out.println(comb);
		System.out.println(a.split("/")[0].trim());
	////	String comb1=day[1]+day[2];
		//System.out.println(comb1);
		
	//	System.out.println(day[1]);
	}

}
