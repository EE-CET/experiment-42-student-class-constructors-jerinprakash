import java.util.Scanner;

class Student {
   
	String name;
	int rollno;

    // TODO: Create a parameterized constructor Student(String name, int rollNo)

	Student(String name, int rollno){

		this.name=name;
		this.rollno=rollno;

	}    
    // TODO: Create a method or use direct access to print details in the required format

	void print(){

		System.out.println("Name: "+name+" Roll: "+rollno);

	}
}

public class StudentClass {
    
        
        // TODO: Read name1
        // TODO: Read rollNo1
        // Hint: Handle the newline consumption if using nextLine() after nextInt()
        
        // TODO: Read name2
        // TODO: Read rollNo2
        
        // TODO: Create two Student objects
        
        // TODO: Print details for both students

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		String s1= sc.nextLine();
		int n1= sc.nextInt();

		sc.nextLine();

		String s2= sc.nextLine();
		int n2= sc.nextInt();

		Student S1= new Student(s1,n1);
		Student S2= new Student(s2,n2);

		S1.print();
		S2.print();

		sc.close();
    

	}
}
