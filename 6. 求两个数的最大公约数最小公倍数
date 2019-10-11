package page102works;
import java.util.Scanner;
public class Tester05 {
static int GCD(int a,int b)
{ 
int t;
if(a<b)
{
t=a;
a=b;
b=t;
}
while(b!=0)
{
t=a%b;
a=b;
b=t;
}
return a;
}
static int LCM(int a,int b)
{
int t=GCD(a,b);
return (a*b/t);
}
public static void main(String[] args) {
Scanner stdin=new Scanner(System.in);
int a=stdin.nextInt(),
b=stdin.nextInt();
System.out.printf("%d与%d最大公约数为：%d，最小公倍数为：%d\n",a,b,GCD(a,b),LCM(a,b));

}

}
