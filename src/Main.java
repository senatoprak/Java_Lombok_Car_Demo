class Car {

    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;


    public Car(String model, String brand, int year, int price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }


    public String getModel() { return model; }
    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public int getPrice() { return price; }
    public String getColor() { return color; }
    public int getQuantity() { return quantity; }


    public void setModel(String model) { this.model = model; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(int price) { this.price = price; }
    public void setColor(String color) { this.color = color; }
    public void setQuantity(int quantity) { this.quantity = quantity; }


    public void delivery(int amount) {
        this.quantity += amount;
    }


    public void sell(int amount) {
        this.quantity -= amount;
    }


    @Override
    public String toString() {
        return "Car(model=" + model +
                ", brand=" + brand +
                ", year=" + year +
                ", price=" + price +
                ", color=" + color +
                ", quantity=" + quantity + ")";
    }
}
class CarDemo {
    public static void main(String[] args) {

        Car car1 = new Car("GLE", "Mercedes", 2020, 350000, "white", 5);

        System.out.println(car1.toString());

        car1.sell(1);

        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Quantity: " + car1.getQuantity());

        car1.setColor("black");

        System.out.println(car1.toString());
    }
}