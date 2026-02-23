class circale{
    private float area;
    private float rduice;

    public void setArea(float a){
        area = a;
    }

    public void setRduice(float r){
        rduice = r;
    }

    public float getRduice(){
       return rduice;
    }

    public float getArea(){
        return area;
    }
}
public class getersater1 {
    public static void main(String[] args) {
        circale size = new circale();

        size.setRduice(9.8f);
        size.setArea(6);

        System.out.println(size.getRduice());
    }
}
