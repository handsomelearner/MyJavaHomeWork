//TreeTester类：
import java.util.Scanner;
public class TreeTester {

public static void main(String[] args) {
Scanner stdin=new Scanner(System.in);
Tree Apple=new Tree();
Tree Orange=new Tree();
System.out.print("请输入给苹果树浇水的次数：");
try {
int i=stdin.nextInt();
Apple.waterTree(i);
System.out.print("请输入给橙子树浇水的次数：");
i=stdin.nextInt();
Orange.waterTree(i);
}catch(WaterException e) {
System.out.println(e.toString());
}
System.out.printf("苹果树高：%d\n橙子树高：%d\n", Apple.getTree(),Orange.getTree());
}
//Tree类：
public class Tree {
private int height;
Tree(){}
Tree(int height){
this.height=height;
}
int getTree() {
return height;
}
public void waterTree(int i) throws WaterException{
if (i>5) {
throw new WaterException();
}
height+=i;
}
//WaterException类：
public class WaterException extends Exception{
public WaterException() {
super("浇水次数不能大于五次！");
}
