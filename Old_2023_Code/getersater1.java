class circale{
    private float area;
    private float rduice;

    public void setArea(String a){
        area = a;
    }

    public void setRduice(int r){
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
    circale size = new circale();


    size.setRduice(9.8);
    size.setArea(6);

    System.out.println(size.getRduice());

}
