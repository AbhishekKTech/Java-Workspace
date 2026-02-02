public class StringMethods {
    public static void main(String[] args) {
        // Method 1 : public char charAt(int index) it gets you the latter on the string that is given by charAtIndex

        String name = "Abhsihek";
        char latter = name.charAt(0);
        System.out.println(latter);

        // public String concat(String str) // its do the marging of two strings

        String lastName = "Sharma";
        String fullName = name.concat(" ").concat(lastName);
        System.out.println(fullName);

        // public boolean equals(Object o) it check the contant of the both String is equal or not and return true and false;
        String passHome = "25mca015";
        String passWiork = "25mca012";  

        if ( passHome.equals(passWiork)){
            System.out.println("Same Password");
        }
        else{
            System.out.println("No same password");
        }

       // public boolean equalsIgnoreCase(String s) it checks the wethe two string are equal or not but ignore that it is upparcase or lowercase

       String city = "Noida";
       String serch = "noidaa";
        if (city.equalsIgnoreCase(serch)) {
            System.out.println("Equal");
        }
        else{
            System.out.println("not equal");
        }


        // public String subString(int begin) its extract the string and from the index that you specifed in the substring fuction
        String fileName = "resdume.pdf";
        String extasionFindr = fileName.substring(7);
        System.out.println(extasionFindr);
        
        //public String subString(int begin,int end)

        String Animal = "Elephant";
        String extractior = Animal.substring(4, 6);
        System.out.println(extractior);

        // public int length() it used for the printing the number of elemnet are present in the string.

        System.out.println(Animal.length());
        System.out.println(fullName.length());

        //public String replace(char old, char new)

        String date = "02-02-2026";
        System.out.print(date.replace('/', '-'));

        
    }
}
