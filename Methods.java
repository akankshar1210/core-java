public class Methods{
	public static void main(String[] args){
	students();
	alphabets();
	numbers();
	geometry();
	temperature();
	
	}
	
	public static void students(){
		float[] cgpaOfStudents={8.2f,7.0f,8.3f,9.1f};
		for(int i=0;i<cgpaOfStudents.length;i++){
			System.out.println(cgpaOfStudents[i]);
		}
	}
	
	public static void alphabets(){
	    char[] vowels={'a','e','i','o','u'};
		for(byte i=0;i<vowels.length;i++){
			System.out.println(vowels[i]);
		}
			
	}
	
	public static void numbers(){
		int[] totalNumberOfStudents={10,15,20,50,55};
		for(int i=0;i<totalNumberOfStudents.length;i++){
			System.out.println(totalNumberOfStudents[i]);
		}
	}
	
	public static void geometry(){
		byte[] sidesOfShapes={4,6,5,9};
		for(byte i=0;i<sidesOfShapes.length;i++){
			System.out.println(sidesOfShapes[i]);
		}
	}
	
	public static void temperature(){
		float[] roomTemperature={32.1f,35.0f,30.3f,40.1f};
		for(int i=0;i<roomTemperature.length;i++){
			System.out.println(roomTemperature[i]);
		}
	}
}