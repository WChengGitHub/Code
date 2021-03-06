package helloWord;

import java.util.List;

public class Person {

	private Car car;
	private String name;
	private int age;
	private List<Car>cars;
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Person [car=" + car + ", name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
	
}
