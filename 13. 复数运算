package Page7411;

public class ComplexNumber {
double s1,x1,
s2,x2;
double sResult,
xResult;
String Result;
//
String add()
{
sResult=s1+s2;
xResult=x1+x2;
if(xResult>=0)
{
Result=sResult+"+"+xResult+"i";
}
else
{
Result=sResult+""+xResult+"i";
}
return Result;
}
//
String sub()
{
sResult=s1-s2;
xResult=x1-x2;
if(xResult>=0)
{
Result=sResult+"+"+xResult+"i";
}
else
{
Result=sResult+""+xResult+"i";
}
return Result;
}
//
String mult()
{
sResult=s1*s2-x1*x2;
xResult=x1*s2+s1*x2;
if(xResult>=0)
{
Result=sResult+"+"+xResult+"i";
}
else
{
Result=sResult+""+xResult+"i";
}
return Result;
}
//
String div()

{
sResult=((s1*s2+x1*x2)/(s2*s2+x2*x2));
xResult=((x1*s2-s1*x2)/(s2*s2+x2*x2));
if(xResult>=0)
{
Result=sResult+"+"+xResult+"i";
}
else
{
Result=sResult+""+xResult+"i";
}
return Result;
}
}


















package Page7411;
import java.util.Scanner;
public class ComplexNumberTester {

public static void main(String[] args) {
Scanner stdin=new Scanner(System.in);
ComplexNumber x=new ComplexNumber();
System.out.println("Enter a:");
x.s1=stdin.nextInt();
System.out.println("Enter b:");
x.x1=stdin.nextInt();
System.out.println("Enter c:");
x.s2=stdin.nextInt();
System.out.println("Enter d:");
x.x2=stdin.nextInt();
System.out.println("Select the operation mode:");
System.out.print("1. +\n2. -\n3. *\n4. /\n5. all print");
int p=stdin.nextInt();
switch(p)
{
case 1:System.out.println(x.add());break;
case 2:System.out.println(x.sub());break;
case 3:System.out.println(x.mult());break;
case 4:System.out.println(x.div());break;
case 5:System.out.printf("%s\t%s\t%s\t%s\t",x.add(),x.sub(),x.mult(),x.div());break;
}
}

}
