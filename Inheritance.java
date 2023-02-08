//Java program to illustrate the 
//concept of inheritance
class Bicycle{
    //the bicycle class has two fields
    public int gear;
    public int speed;

//one constructor
public Bicycle(int gear, int speed)
{
    this.gear = gear;
    this.speed = speed;
}
//3 methods
public void applyBrake(int decrement){
    speed -= decrement;
}
public void speedUp(int increment)
{
    speed += increment;
}
//toString() method to print info of Bicycle
public String toString()
{
    return ("No of gears are "+ gear+"\n"+ "and speed of bicycle is "+speed);
}
}
class MountainBike extends Bicycle{
    public int seatHeight;
public MountainBike(int gear, int speed, int startHeight){
    super(gear, speed);
    seatHeight = startHeight;
}
public void setHeight(int newValue)
{
    seatHeight = newValue;
}
@Override public String toString(){
    return(super.toString()+"\nseat height is "+seatHeight);
}
}
public class Inheritance{
    public static void main(String[] args){
        MountainBike mb = new MountainBike(3,100,25);
        mb.applyBrake(10);
        System.out.println(mb.toString());
    }
}
/*
No of gears are 3
and speed of bicycle is 90
seat height is 25
*/
