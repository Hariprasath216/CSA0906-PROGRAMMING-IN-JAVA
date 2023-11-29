import java.util.*;
class armstrong
{
public static void main(String args[])
{
int rem,sum=0;
int n1;

Scanner s=new Scanner(System.in);
System.out.println("enter a no:");
int n=s.nextInt();
n1=n;
while(n>0)
{
  rem=n%10;
  sum=sum+(rem*rem*rem);
  n=n/10;
}
if(n1==sum)
{
System.out.println("armstron no");
}
else
{
System.out.println("not a armstrong no:");
}
}
}
