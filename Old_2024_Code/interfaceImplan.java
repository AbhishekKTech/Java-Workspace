public class interfaceImplan {
    public static void main(String[] args){

        man h1 = new man();
        h1.sleep();

        

    }
}


interface human{
    void sleep();
}

class man implements human{
    public void sleep(){
        System.out.println("Sleeping");
    }
}