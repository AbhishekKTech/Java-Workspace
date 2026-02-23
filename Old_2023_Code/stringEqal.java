class String1 {
    public static void main(String[] args) {

        //------------- immutable string -------------

        String brand = "Mc Donlads";

        StringBuilder brand1 = new StringBuilder("Mc Donlads"); // stored in heap, outside SCP

        if (brand.equals(brand1.toString())) { // compare contents, not references
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}