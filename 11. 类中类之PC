//Test类部分
public class Test {

public static void main(String[] args) {
CPU cpu=new CPU();
HardDisk disk=new HardDisk();
cpu.setSpeed(2200);
disk.setAmount(200);
PC pc=new PC();
pc.setCPU(cpu);
pc.setHardDisk(disk);
pc.show();
}

}
//PC类部分
public class PC {
CPU c=new CPU();
HardDisk h=new HardDisk();
public void setCPU(CPU i){
c.speed=i.speed;
}
public void setHardDisk(HardDisk i) {
h.amount=i.amount;
}
public void show() {
System.out.print
("Speed:"+c.getSpeed()+"\n"+"Amount:"+h.getAmount());
}
}


//CPU类部分
public class CPU {
int speed;
public void setSpeed(int i) {
speed=i;
}
public int getSpeed() {
return speed;
}
}
//HardDisk类部分
public class HardDisk {
int amount;
public void setAmount(int i) {
amount=i;
}
public int getAmount() {
return amount;
}
}
