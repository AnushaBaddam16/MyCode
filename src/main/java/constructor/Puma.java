package constructor;

public class Puma extends Brand{
    String name;
    public Puma(String name, String brandType) {
        super(brandType);
        this.name = name;
    }

    public Puma(String name) {
        super("Shoe");
        this.name = name;
    }

    public static void main(String[] args) {
        Puma puma = new Puma("Peter");
        System.out.println(puma.brandType);
        System.out.println(puma.name);

        puma = new Puma("Snikers", "Puma");
        System.out.println(puma.name);
        System.out.println(puma.brandType);
    }
}
