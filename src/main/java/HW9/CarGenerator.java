package HW9;

import java.util.Random;

public class CarGenerator {

    public static Brand randomBrand() {
        Brand[] brand = Brand.values();
        int randomIndex = new Random().nextInt(brand.length);
        return brand[randomIndex];
    }


    public static int randomCarYear() {
        return new Random().nextInt(2000, 2022);
    }

    public static int randomCarMileage() {
        return new Random().nextInt(15000, 350000);
    }

    public static int randomCarPrice() {
        return new Random().nextInt(350000, 2100000);
    }
}
