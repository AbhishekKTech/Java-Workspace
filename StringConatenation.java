

public class StringConatenation {
    public static void main(String[] args){
        String firsName = "Abhishek";
        String lastName = "Sharma";
        // String fullName = firsName + " " + lastName;
        // System.out.print(fullName);

        String fullName = firsName.concat(" ").concat(lastName);
        System.out.print(fullName);

    }
}
