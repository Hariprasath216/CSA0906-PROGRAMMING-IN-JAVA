import java.util.*;
class fibThread extends Thread{
public void run(){
try{
int a=0,b=1,c=0,limit;
Scanner s=new Scanner(System.in);
System.out.print("ENTER LIMIT :");
limit=s.nextInt();
System.out.print(a+" "+b+" ");
for(int i=2;i<=limit;i++){
c=a+b;
a=b;
b=c;
System.out.print(c+" ");}
}
catch(Exception e){
System.out.println("Interrupted...");
}
System.out.println("Exiting A Thread");
}
}
class revThread extends Thread{
public void run(){
try{
for(int i=10;i>0;i--){
System.out.println(i);}
}
catch(Exception e){
System.out.println("Interrupted...");
}
System.out.println("Exiting B Thread");
}
public static void main(String arg[]){
fibThread obj1=new fibThread();
revThread obj2=new revThread();
obj1.start();
obj2.start();
}
}