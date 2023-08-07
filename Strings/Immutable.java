public class Immutable {
    public static void main(String[] args) {
        String brand = "pwskill";
        System.out.println(brand);
        brand.concat("Bangaluru");
        System.out.println(brand);

        StringBuilder brand1 = new StringBuilder("pwskill");
        System.out.println(brand1);
        brand1.append("Bangaluru");
        System.out.println(brand1);

    }
}
