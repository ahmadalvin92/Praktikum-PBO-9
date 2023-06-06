/**
 * File : Person.java 01/06/2023
 * Nama : Ahmad Alvin Griffin
 * NIM  : 24060121140106
 * Deskripsi : Person database model
**/

public class Person{
	private int id;
	private String name;
	
	public Person(String n){
		name = n;
	}

	public Person(int i, String n){
		id = i;
		name = n;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}
}