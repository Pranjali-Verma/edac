import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,sum=0;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
c=a;
while(a>0)
{
    b=a%10;
    sum=sum+b*b*b;
    a=a/10;
}
    if(sum==c)
    {
    	System.out.println("it is an armstrong number");
    }
    else
    {
    	System.out.println("it is not an armstrong number");
    }
	}

}
