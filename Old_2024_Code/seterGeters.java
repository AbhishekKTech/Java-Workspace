class myemploye{
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 

}
public class seterGeters {

    public static void main(String[] args) {

        myemploye abhishek = new myemploye();

        // abhishek.id = 43;
        // abhishek.name = ("Sharma ji");

        abhishek.setName("Sharma Ji");
        System.out.println(abhishek.getName());
    }  

}
