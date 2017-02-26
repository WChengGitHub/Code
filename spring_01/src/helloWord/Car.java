package helloWord;

public class Car {
    String brand;
    String crop;
    int price;
    int maxSpeed;
	public Car(String brand, String crop, int price, int maxSpeed) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
    
}
