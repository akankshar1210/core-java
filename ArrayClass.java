public class ArrayClass{
	public static void main(String[] args){
		int[] noOfStudents={10,20,30,40,15};
		System.out.println(noOfStudents[0]);
		System.out.println(noOfStudents[2]);
		int[] totalNumberOfCollege={40,55,67,80,70};
		System.out.println(totalNumberOfCollege[1]);
		int[] numberOfMaleCandidates={1,5,7,10,12};
		System.out.println(numberOfMaleCandidates[2]);
		int[] lenghtOfPipes={20,40,50,60,65};
		System.out.println(lenghtOfPipes[0]);
		char[] firstLetterOfName={'a','k','s','h','u'};
		System.out.println(firstLetterOfName[0]);
		System.out.println(firstLetterOfName[3]);
		char[] division={'A','B','C','D','E'};
		System.out.println(division[1]);
		char[] vowels={'a','e','i','o','u'};
		System.out.println(vowels[2]);
		float[] cgpaOfStudents={8.2f,9.2f,7.6f,8.5f,9.0f};
		System.out.println(cgpaOfStudents[2]);
		float[] weightInGrams={8.1f,5.6f,9.0f,8.7f,10.9f};
		System.out.println(weightInGrams[2]);
		float[] percentage={90.1f,80.5f,80.6f,65.7f};
		System.out.println(percentage[0]);
		
		for(int i=0;i<vowels.length;i++){
			System.out.println(vowels[i]);
		}
		for(int i=0;i<division.length;i++){
			System.out.println(division[i]);
		}
		for(int i=0;i<firstLetterOfName.length;i++){
			System.out.println(firstLetterOfName[i]);
		}
		for(int i=0;i<cgpaOfStudents.length;i++){
			System.out.println(cgpaOfStudents[i]);
		}
		for(int i=0;i<noOfStudents.length;i++){
			System.out.println(noOfStudents[i]);
		}
		
		int[] numberOfInstitute=new int[5];
		numberOfInstitute[0]=10;
		numberOfInstitute[1]=20;
		numberOfInstitute[2]=30;
		numberOfInstitute[3]=40;
		numberOfInstitute[4]=50;
		System.out.println(numberOfInstitute);
		
		int[] rollNumber=new int[5];
		rollNumber[0]=5;
		rollNumber[1]=15;
		rollNumber[2]=20;
		rollNumber[3]=21;
		rollNumber[4]=9;
		System.out.println(rollNumber);
		
		int[] costOfMaterials=new int[6];
		costOfMaterials[0]=20;
		costOfMaterials[1]=15;
		costOfMaterials[2]=40;
		costOfMaterials[3]=50;
		costOfMaterials[4]=10;
		costOfMaterials[5]=12;
		System.out.println(costOfMaterials);
		
		char[] symbols=new char[4];
		symbols[0]='D';
		symbols[1]='s';
		symbols[2]='a';
		symbols[3]='t';
		System.out.println(symbols);
		
		char[] coloursOfRainbow=new char[7];
		coloursOfRainbow[0]='v';
		coloursOfRainbow[1]='i';
		coloursOfRainbow[2]='b';
		coloursOfRainbow[3]='g';
		coloursOfRainbow[4]='y';
		coloursOfRainbow[5]='o';
		coloursOfRainbow[6]='r';
		System.out.println(coloursOfRainbow);
		
		char[] grade=new char[3];
        grade[0]='A';
        grade[1]='B';
        grade[2]='C';
        System.out.println(grade);
		
        byte[] sidesOfSquare=new byte[2];
        sidesOfSquare[0]=4;
        sidesOfSquare[1]=6;
        System.out.println(sidesOfSquare);
		
        float[] weight=new float[3];
        weight[0]=8.6f;
        weight[1]=9.8f;
        weight[2]=8.5f;
        System.out.println(weight);
		
        byte[] heightOfPerson=new byte[5];
        heightOfPerson[0]=5; 		
		heightOfPerson[1]=6;
		heightOfPerson[2]=4;
		heightOfPerson[3]=5;
		heightOfPerson[4]=7;
		System.out.println(heightOfPerson);
		
		int[] totalNumberOfSubjects=new int[4];
		totalNumberOfSubjects[0]=10;
		totalNumberOfSubjects[1]=6;
		totalNumberOfSubjects[2]=7;
		totalNumberOfSubjects[3]=8;
		System.out.println(totalNumberOfSubjects);
	}
}