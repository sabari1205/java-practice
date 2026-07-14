class MobilePhone {
    String brand;
    int price;

    void show() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }
}

public class CreatingObjects {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        m1.brand = "Samsung";
        m1.price = 15000;

        MobilePhone m2 = new MobilePhone();
        m2.brand = "Apple";
        m2.price = 80000;

        m1.show();
        m2.show();
    }
}
