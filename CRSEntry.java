public class CRSEntry{
    public static void main(String[] args) {
        Car toyotacar = new Car();
        toyotacar.setCarId("CAR-1");
        toyotacar.setBrand("Toyota");
        toyotacar.setModel("Fortuner");
        toyotacar.setNoOfAvailableCar(1);
        toyotacar.setPriceperDay(3000);

        Car tatacar = new Car();
        tatacar.setCarId("CAR-2");
        tatacar.setBrand("Tata");
        tatacar.setModel("Harrier");
        tatacar.setNoOfAvailableCar(2);
        tatacar.setPriceperDay(3300);

        Car mahindratacar = new Car();
        mahindratacar.setCarId("CAR-3");
        mahindratacar.setBrand("Mahindra");
        mahindratacar.setModel("XUV");
        mahindratacar.setNoOfAvailableCar(3);
        mahindratacar.setPriceperDay(3800);

        CarRentalService crs = new CarRentalService();
        crs.addCar( toyotacar);
        crs.addCar(tatacar);
        crs.addCar(mahindratacar);
          CarRentalService carRentalService = new CarRentalService();
          carRentalService.addCar(toyotacar);
          carRentalService.addCar(tatacar);
          carRentalService.addCar(mahindratacar);

          carRentalService.options();


        
    }
}