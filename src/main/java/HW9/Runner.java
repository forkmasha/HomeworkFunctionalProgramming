package HW9;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {

        List<Car> carList = Arrays.asList(
                new Car(UUID.randomUUID(), CarGenerator.randomBrand(), CarGenerator.randomCarYear(), CarGenerator.randomCarMileage(), CarGenerator.randomCarPrice()),
                new Car(UUID.randomUUID(), CarGenerator.randomBrand(), CarGenerator.randomCarYear(), CarGenerator.randomCarMileage(), CarGenerator.randomCarPrice()),
                new Car(UUID.randomUUID(), CarGenerator.randomBrand(), CarGenerator.randomCarYear(), CarGenerator.randomCarMileage(), CarGenerator.randomCarPrice()),
                new Car(UUID.randomUUID(), CarGenerator.randomBrand(), CarGenerator.randomCarYear(), CarGenerator.randomCarMileage(), CarGenerator.randomCarPrice()),
                new Car(UUID.randomUUID(), CarGenerator.randomBrand(), CarGenerator.randomCarYear(), CarGenerator.randomCarMileage(), CarGenerator.randomCarPrice()),
                new Car(UUID.randomUUID(), CarGenerator.randomBrand(), CarGenerator.randomCarYear(), CarGenerator.randomCarMileage(), CarGenerator.randomCarPrice()),
                new Car(UUID.randomUUID(), CarGenerator.randomBrand(), CarGenerator.randomCarYear(), CarGenerator.randomCarMileage(), CarGenerator.randomCarPrice()),
                new Car(UUID.randomUUID(), CarGenerator.randomBrand(), CarGenerator.randomCarYear(), CarGenerator.randomCarMileage(), CarGenerator.randomCarPrice()),
                new Car(UUID.randomUUID(), CarGenerator.randomBrand(), CarGenerator.randomCarYear(), CarGenerator.randomCarMileage(), CarGenerator.randomCarPrice()),
                new Car(UUID.randomUUID(), CarGenerator.randomBrand(), CarGenerator.randomCarYear(), CarGenerator.randomCarMileage(), CarGenerator.randomCarPrice())
        );
        List<Car> onlyTeslaAndAudi = carList.stream()
                .filter(car -> car.getBrand().equals(Brand.TESLA) || car.getBrand().equals(Brand.AUDI)).toList();
        System.out.println("???????????? ?????????? ?????????? ???? ???????? " + onlyTeslaAndAudi);

        List<Car> carYanger2018 = carList.stream()
                .filter(car -> car.getYear() > 2018).toList();
        System.out.println("???????????? ?????????????? 2018 ???????? " + carYanger2018);

        List<Car> carsMilesLessThen40000 = carList.stream()
                .filter(car -> car.getMileage() < 40000).toList();
        System.out.println("???????????? ?? ???????????????? ?????????? 40000 " + carsMilesLessThen40000);

        List<Car> carsSortedInReverseOrder = carList.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed()).toList();
        System.out.println("???????????? ?????????????????????????? ???? ?????????? ?? ?????????????? ????????????????" + carsSortedInReverseOrder);

        Map cheapestCars = carList.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .limit(3)
                .collect(Collectors.toMap(Car::getId, Car -> Car));
        System.out.println("3 ???????????????????? ????????????:" + cheapestCars);

    }
}
