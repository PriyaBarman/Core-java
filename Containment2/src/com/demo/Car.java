package com.demo;

public class Car {

	private int model;
	private String carname;
	private long carprice;

	Car() {

	}

	Car(int model, String carname, long carprice) {
		this.model = model;
		this.carname = carname;
		this.carprice = carprice;
	}
// getter setter
	public int getModel() 
	{
		return model;
	}

	public void  setModel(  int model)
	{
		this.model = model;
	}
	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}
	public long getCarprice() {
		return carprice;
	}

	public void setCarprice(long carprice ) {
		this.carprice = carprice;
	}
	public String  toString ()
	{
		return " car :" +model+" " +carname+" "+ carprice ;
	}
}
