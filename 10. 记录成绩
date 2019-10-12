package cht20191007;

public class Student {
private int No;
private String Name;
private int English;
private int Math;
private int Computer;
private int Sum;
Student(){}
Student(int no,String name,int english,int math,int computer){
No=no;
Name=name;
English=english;
Math=math;
Computer=computer;
}
int getNo() {return No;}
String getName(){return Name;}
int getEnglish(){return English;}
int getMath(){return Math;}
int getComputer(){return Computer;}
int getSum(){return English+Math+Computer;}
void setNo(int no) {
No=no;
}
void setName(String name){
Name=name;
Sum=getSum();
}
void setEnglish(int english){
English=english;
Sum=getSum();
}
void setMath(int math){
Math=math;
Sum=getSum();
}
void setComputer(int computer){
Computer=computer;
Sum=getSum();
}
void setSum(int sum){
Sum=sum;
}
public String toString() {
return No+"\n"+Name+"\n"+English+"\n"+Math+"\n"+Computer+"\n"+Sum;
}
void Compare(int sumScore) {
if(Sum>sumScore) System.out.println("大于");
else if(Sum<sumScore) System.out.println("小于");
else System.out.println("等于");
}
double testScore() {
return ((double)getSum())/3;
}
}
//StudentXW部分
package cht20191007;

public class StudentXW extends Student {
public StudentXW(int i, String string, int j, int k, int l) {
super(i,string,j,k,l);
}
double testScore() {
return ((double)getSum())/3+3;
}
}
//StudentBZ部分
package cht20191007;

public class StudentBZ extends Student{
public StudentBZ(int i, String string, int j, int k, int l) {
super(i,string,j,k,l);
}

double testScore() {
return ((double)getSum())/3+5;
}
}
//StudentTester部分
package cht20191007;

public class StudentTester {

public static void main(String[] args) {
Student sb=new Student(22,"种伟途",60,61,62);
StudentBZ gay=new StudentBZ(19,"曾闻哲",50,51,52);
StudentXW bt=new StudentXW(20,"林文号",40,41,42);
System.out.print(sb.testScore()+"\n"+gay.testScore()+"\n"+bt.testScore());

}

}
