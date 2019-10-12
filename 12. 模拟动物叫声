//Animal类部分
public abstract class Animal {
abstract void cry();
abstract String getAnimalName();
}

//Simulator类部分
public class Simulator {
public void playSound(Animal i) {
i.cry();
}
}
//Cat类部分
public class Cat extends Animal{

@Override
void cry() {
// TODO Auto-generated method stub
System.out.println("喵～");
}

@Override
String getAnimalName() {
// TODO Auto-generated method stub
return "Cat";
}

}
//Dog类部分
public class Dog extends Animal {

@Override
void cry() {
// TODO Auto-generated method stub
System.out.println("汪汪汪～");
}

@Override
String getAnimalName() {
// TODO Auto-generated method stub
return "Dog";
}

}

//AnimalTester类部分
public class AnimalTester {

public static void main(String[] args) {
// TODO Auto-generated method stub
Dog dog=new Dog();
Cat cat=new Cat();
Simulator player=new Simulator();
player.playSound(dog);
player.playSound(cat);
}

}
