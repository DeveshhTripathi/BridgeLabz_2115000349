import com.fasterxml.jackson.databind.ObjectMapper;

class Car{
   public String brand;
   public String model;
   public int year;

   public Car(String brand, String model, int year) {
       this.brand = brand;
       this.model = model;
       this.year = year;
   }
}
public class JSONCar{
   public static void main(String[] args) throws Exception {
       Car car = new Car("Toyota", "Fortuner", 2025);
       ObjectMapper objectMapper = new ObjectMapper();
       String json = objectMapper.writeValueAsString(car);
       System.out.println(json);
   }
}
