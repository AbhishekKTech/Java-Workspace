class string{
    public static void main(String[] args)
    {

        // --------- ImMutable String ---------

        String brand = "Mc Donlds";
        System.out.println(brand);

        brand.concat("Pizza");


        // --------- Mutable String ---------

        StringBuilder brand1 = new StringBuilder("Mc Donlds");
        System.out.println(brand1);

        brand1.append("Pizza");
        System.out.println(brand1);
    }
}