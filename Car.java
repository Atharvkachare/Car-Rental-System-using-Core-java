public class Car {
    private String carId;
    private String brand;
    private String model;
    private double priceperDay;
    private int noOfAvailableCar;

    public String getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPriceperDay() {
        return priceperDay;
    }

    public int getNoOfAvailableCar() {
        return noOfAvailableCar;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPriceperDay(double priceperDay) {
        this.priceperDay = priceperDay;
    }

    public void setNoOfAvailableCar(int noOfAvailableCar) {
        this.noOfAvailableCar = noOfAvailableCar;
    }

    public double calculatePrice(int days){
        return  priceperDay * days;
    }
}
