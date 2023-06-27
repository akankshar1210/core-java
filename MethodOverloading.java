public class MethodOverloading{
	public static void main(String[] args){
			
		int addedValue=add(10,30);
		System.out.println(addedValue);
		int addedValue1=add(10,20,50);
		System.out.println(addedValue1);
		float addedValue2=add(2,5.6f);
		System.out.println(addedValue2);
		float addedValue3=add(3.3f,6);
		System.out.println(addedValue3);
		long addedValue4=add(4,(short)30,23234l);
		System.out.println(addedValue4);
		long addedValue5=add(10,200000l);
		System.out.println(addedValue5);
		
		String returnedName=name("Akanksha");
		System.out.println(returnedName);
		String returnedName1=name("Akanksha",'f');
		System.out.println(returnedName1);
		String returnedName2=name("riya",true);
		System.out.println(returnedName2);
		String returnedName3=name("riya",8.2f);
		System.out.println(returnedName3);
		String returnedName4=name("SHIV",80.2f,3.14528d); 
		System.out.println(returnedName4);
		String returnedName5=name(9.7f,3.142583d,"archita");
		System.out.println(returnedName5);
		
		char checkedValue=check(true,'B');
		System.out.println(checkedValue);
		boolean checkedValue1=check(true,"institute");
		System.out.println(checkedValue1);
		boolean checkedValue2=check(true,false);
		System.out.println(checkedValue2);
		char checkedValue3=check('A',1234567l);
		System.out.println(checkedValue3);
		long checkedValue4=check(2323234l,false,'b');
		System.out.println(checkedValue4);
		boolean checkedValue5=check(7.8f,true);
		System.out.println(checkedValue5);
	}
	
	public static int add(int x,int y){
		int z=x+y;
		return z;
	}
	
	public static int add(int y,int x,int z){
		int a=y+x+z;
		return a;
	}
	
	public static float add(int x,float y){
		float z=x+y;
		return z;
	}
	
	public static float add(float x,int y){
		float z=x+y;
		return z;
	}
	
	public static long add(int x,short y,long z){
		long a=x+y+z;
		return a;
	}
	
	public static long add(int x,long y){
		long z=x+y;
		return z;
	}
	
	
	public static String name(String a){
		System.out.println("my name");
		return a;
	}
	
	public static String name(String x, char n){
		return x;
	}
	
	public static String name(String s, boolean n){
		return s;
	}
	
	public static String name(String s, float n){
		return s;
	}
	
	public static String name(String s, float n, double d){
		return s;
	}
	
	public static String name(float n, double d,String s){
		return s;
	}
	
	public static char check(boolean b, char c){
		return c;
	}
	
	public static boolean check(boolean b, String c){
		return b;
	}
	
	public static boolean check(boolean b, boolean c){
		return b;
	}
	
	public static char check(char c, long l){
		return c;
	}
	
	public static long check(long l, boolean b, char c){
		return l;
	}
	
	public static boolean check(float x,boolean b){
		return b;
	}	
}