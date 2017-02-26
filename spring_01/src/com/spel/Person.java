package com.spel;

import com.spel.Address;

public class Person {
    private Car car;
    private String city;
    private String info;
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Person [car=" + car + ", city=" + city + ", info=" + info + "]";
	}
    
}
