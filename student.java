package Package1;
import java.util.Scanner;
public class student{
public int rollno;
public int maths;
public int science;
public String name;
private String grade;
private static int count;
public int eng;
double totalmarks;
public void aceptinfo()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter rollno");
	rollno=sc.nextInt();
	System.out.println("enter name");
	name=sc.next();
	System.out.println("enter english marks");
	eng=sc.nextInt();
	System.out.println("enter maths marks");
	maths=sc.nextInt();
	System.out.println("enter science marks");
	science=sc.nextInt();	
}
public student()
{
	System.out.println("haaaaaaaa");
	rollno=10;
	maths=39;
	 count=count+1;
}
public student(int rollno,int maths,String name)
{
	this();
	this.rollno=rollno;
	this.maths=maths;
	name=this.name;
}
public void displayinfo()
{
	System.out.println("roll no is-"+rollno);
	System.out.println("maths ,marks is"+maths);
	System.out.println("name is"+name);
	System.out.println("count"+count);
}

}