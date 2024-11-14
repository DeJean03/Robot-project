public class Robot {
    int batteryLevel = 100;
    int speed = 0;
    String name = "Robo";
    String color = "red";
    public void move(){
        speed = 5;
        System.out.println(name + " moving at speed " + speed + "mph");  
    }
    public void stop(){
        speed = 0;
        System.out.println(name + " has stopped ");
    } 
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println(name + " battery is fully charged");
    }
    public void checkbatteryLevel() {
        System.out.println(name+ " 's current battery level is " + batteryLevel + "%"); 
    }


    public void displayInfo(){
        System.out.println(color+ " is the color of " + name);
    }
}
