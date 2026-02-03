public class condition {
    public static void main(String[] args) {
        int speed = 61;
        String vehicle = "car";
    

        if (vehicle.equals("bike ")) {
            if (speed > 1 && speed < 60) {
                System.out.println("good bike driver");
            } else {
                System.out.println("Chalaan hoga ab bike ka");
            }

   
        }
        else if(vehicle.equals("car")){
            if (speed >1 && speed <70 ) {
                System.out.println("you are goood car driver");
                
            }
            else{
            System.out.println("Challan hoga bhari");
            }
        }

    }
}