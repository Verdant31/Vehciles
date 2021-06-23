public class Vehicle {
    public int id;
    public String name;
    public String brand;
    public float price;
    protected int tankSize;
    protected float kmTraveled;
    protected float consume;

    public Vehicle() {}

    public Vehicle(String name, String brand, float price, int tankSize, float kmTraveled, float consume, int id) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.kmTraveled = kmTraveled;
        this.tankSize = tankSize;
        this.consume = consume;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getConsume() {
        return this.consume;
    }

    public void setConsume(float consume) {
        this.consume = consume;
    }

    public int getTankSize() {
        return this.tankSize;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    public float getKmTraveled() {
        return this.kmTraveled;
    }

    public void setKmFuelTank(float kmTraveled) {
        this.kmTraveled = kmTraveled;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Id: "+ id + "\nName: " + name + "\nBrand: " + brand + "\nPrice: $" + price + "\nTank size: " + tankSize +
        "\nConsume: " + consume + " km/l\n";
    }
    
}
