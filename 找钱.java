package page102works;
import java.util.Scanner;
public class Tester06 {

public static void main(String[] args) {
Scanner stdin=new Scanner(System.in);
double sale=stdin.nextDouble();
double pay=stdin.nextDouble();
double back=(pay-sale)*100;
int[] a=new int[12];
for(int i=0;i<a.length;i++)
{
a[i]=0;
}
while(back>=1)
{
if(back>=5000&&back<10000)
{
back=back-5000;
a[0]++;
}
else if(back>=2000&&back<5000)
{
back=back-2000;
a[1]++;
}
else if(back>=1000&&back<2000)
{
back=back-1000;
a[2]++;
}
else if(back>=500&&back<1000)
{
back=back-500;
a[3]++;
}
else if(back>=200&&back<500)
{
back=back-200;
a[4]++;
}
else if(back>=100&&back<200)
{
back=back-100;
a[5]++;
}
else if(back>=50&&back<100)
{
back=back-50;
a[6]++;
}
else if(back>=20&&back<50)
{
back=back-20;
a[7]++;
}
else if(back>=10&&back<20)
{
back=back-10;
a[8]++;
}
else if(back>=5&&back<10)
{
back=back-5;
a[9]++;
}
else if(back>=2&&back<5)
{
back=back-2;
a[10]++;
}
else if(back>=1&&back<2)
{
back=back-1;
a[11]++;
}
}
System.out.println("50:"+a[0]);
System.out.println("20:"+a[1]);
System.out.println("10:"+a[2]);
System.out.println("5:"+a[3]);
System.out.println("2:"+a[4]);
System.out.println("1:"+a[5]);
System.out.println("0.5:"+a[6]);
System.out.println("0.2:"+a[7]);
System.out.println("0.1:"+a[8]);
System.out.println("0.05:"+a[9]);
System.out.println("0.02:"+a[10]);
System.out.println("0.01:"+a[11]);

}

}
