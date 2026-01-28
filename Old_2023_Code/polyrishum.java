class Airplane{
    public void fy(){
        System.out.println("Airplne Fly");
    }

    public void tackoff(){
        System.out.println("Airpane tackoff");
    }
}

class CaroPlane extends Airplane{

    public void fy(){
        System.out.println("Cargopane Fly fly bootm sky");
    }

    public void tackoff(){
        System.out.println("Cargopalne tackoff quickly");
    }
}

class Jetplane extends Airplane{

    public void fy(){
        System.out.println("Jet Fly fast");
    }

    public void tackoff(){
        System.out.println("Jetplane tackoff very Fast");
}
}

class Airpot extends Airplane{

    public void poly(Airplane ref){

        ref.fy();
        ref.tackoff();
        System.out.println("--------------------------------");
    }
}

public class polyrishum {

    public static void main(String[] args){

        Airplane air = new Airplane();
        CaroPlane cc = new CaroPlane();
        Jetplane jet = new Jetplane();

        Airpot a = new Airpot(); 

        a.poly(air);
        a.poly(cc);
        a.poly(jet);

        
        // air.fy();
        // air.tackoff();

        // cc.fy();
        // air.tackoff();

        // jet.fy();
        // jet.tackoff();
        
    }    
}