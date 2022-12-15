class House{
    int rooms;
    float area;
    String color, address;
 private String name;
    House(int rooms){
        this.rooms = rooms;
    }
    /*ABC()
     * ABC(INT X)
     * x=5
     * ABC(ABC abc)
     * x = abc.x;
     */


float total_area(int rooms, float area_per_room){
    return rooms*area_per_room;
}
}
public class Demo{

public static void main(String[] args) {
    House dosi = new House(10);
    System.out.println(dosi.rooms);
    System.out.println(dosi.total_area(5,10));

}
 }
