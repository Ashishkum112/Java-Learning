public class ISP {
    public interface VehicleWhichDrive 
    {
        void drive();
    }
    public interface VehicleWhichFly 
    {
        void fly();    
    }

    public class Car implements VehicleWhichDrive {

        @Override
        public void drive() {
            System.out.println("Car is driving");
        }   
    }
    public class Aeroplane implements VehicleWhichFly {
        
        @Override
        public void fly() {
            System.out.println("Aeroplane can fly "); 
        }
        
    }
}



