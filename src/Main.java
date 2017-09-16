import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit

		int id;
		double avg;
		String name;
		Date d=new Date();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students");
		int n=sc.nextInt();
		StudentGroup sg=new StudentGroup();
		Student[] s=new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter student data");
			id=sc.nextInt();
			name=sc.next();
			d=sc.next();
			avg=sc.nextDouble();
			s[i]=new Student(id,name,d,avg);
		}
		sg.setStudents(s);
		Student res[]=sg.getStudents();
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i].getId()+" "+res[i].getFullName()+" "+res[i].getBirthDate()+" "+res[i].getAvgMark());
		}
		int k=sc.nextInt();
		
		Student s2=sg.getStudent(k);
		System.out.println(s2.getId()+" "+s2.getFullName()+" "+s2.getBirthDate()+" "s2.getAvgMark());
		Student s3=new Student(1,"alekhya",new Date(1997-02-20),93);
		sg.setStudent(s3,1);

		Student res1[]=sg.getStudents();
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i].getId()+" "+res[i].getFullName()+" "+res[i].getBirthDate()+" "+res[i].getAvgMark());
		}	
		
	}

}
