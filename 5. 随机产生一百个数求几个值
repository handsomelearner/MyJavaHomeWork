package page102works;
import java.util.Random;
public class Tester04 {
static int findMax(int[] a)
{
int Max=0;
for(int i=0;i<a.length;i++)
{
if(a[i]>Max) Max=a[i];
}
return Max;
}
static int findMin(int[] a)
{
int Min=0;
for(int i=0;i<a.length;i++)
{
if(a[i]<Min) Min=a[i];
}
return Min;
}
static int countNum(int[] a)
{
int Sum=0;
for(int i=0;i<a.length;i++)
{
if(a[i]>50) Sum++;
}
return Sum;
}
public static void main(String[] args) {
Random rand=new Random();
int[] a=new int[100];
for(int i=0;i<100;i++)
{
a[i]=rand.nextInt(99);
}
System.out.println("最大者：" + findMax(a));
System.out.println("最小者：" + findMin(a));
System.out.println("大于50的整数个数：" + countNum(a));
}

}
