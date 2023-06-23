public class ReturnValues{
	public static void main(String[] args){
		
		byte resultedValue=getByteValue();
		System.out.println(resultedValue);
		
		short sumTotal=totalNumberOfBoysAndGirls();
		System.out.println(sumTotal);
		
		int sumValue=add();
		System.out.println(sumValue);
		
		long returnedNumber=phoneNumber();
		System.out.println(returnedNumber);
		
		float dividedValue=divide();
		System.out.println(dividedValue);
		
		double returnedValue=lightSpeed();
		System.out.println(returnedValue);
		
		char result=giveVowel();
		System.out.println(result);
		
		boolean correctValue=checkTheNumber();
		System.out.println(correctValue);
		
		String returnedSentence=sentence();
		System.out.println(returnedSentence);
		
		int[] returnedUsnNumber=rollNumbers();
		System.out.println(returnedUsnNumber);
		
		
		
	}
	public static byte getByteValue(){
		byte value=50;
		return value;
	}
	

	
	public static short totalNumberOfBoysAndGirls(){
		short num=500;
		return num;
	}
	
	public static int add(){
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	public static long phoneNumber(){
		long number=1234567892l;
			System.out.println("method started");
		return number;
	}
	
	
	public static float divide(){
		float a=6.2f;
		float b=3.1f;
		float c=a/b;
		return c;
	} 
	
	public static double lightSpeed(){
		double speed=3002975.6153424d;
		return 1;
		
	}
	
	public static char giveVowel(){
		char value='a';
		return value;
	}
	
	public static boolean checkTheNumber(){
		int number=10;
		
		if(number>=10){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static String sentence(){
		String Message="Welcome to Xworkz";
		return Message;
		
	}
	
	public static int[] rollNumbers(){
		int[] usn={10,20,23,34,50};
		return usn;
	}
}