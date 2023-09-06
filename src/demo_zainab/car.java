package demo_zainab;

public class car {  
	int engine;
	int doors;
	static int  noofwheels=6;
	String  colour;
	boolean automatic;
	

	public static void main(String[] args) {
  car audi=new car();
  car bmw=new car();
   audi.mul(5, 4, 8);
	car.sub( 10, 5, 4);
	audi.add(2,5);
	audi.add(2,5.0);
	audi.add(2,5,4);
	audi.add(2);
	
		 	}
	void add(int a ,int b)
	 {
		 System.out.println(a+b);
		 
	 }
	void add(int a ,double b)
	 {
		 System.out.println(a+b);
		 
	 }
	void add(int a ,int b, int c)
	 {
		 System.out.println(a+b+c);
		 
	 }
	void add(int a)
	 {
		 System.out.println(a);
		 
	 }
	static int sub(int a, int b , int c)
	{
		System.out.println(a-b-c);
		return 23;
		
	}
	double mul(int a, int b,int c)
	{
System.out.println(a+b+c);
		return 24; 
	}

}
   
