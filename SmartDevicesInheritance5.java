class Device{
    protected String deviceId;
    protected String status;
    public Device(String deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
  }
    public void displayStatus(){
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
  }
}
class Thermostat extends Device{
    private int temperatureSetting;
    public Thermostat(String deviceId, String status, int temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
  }
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "C");
  }
}
public class SmartDevicesInheritance5{
    public static void main(String[] args){
        Device obj = new Device("D001", "On");
        Thermostat T1 = new Thermostat("T100", "Active", 22);
      	obj.displayStatus();
        T1.displayStatus();
  }
}
