import java.io.*;

/**
 * File : ReadSerializePerson.java 01/06/2023
 * Nama/NIM : Ahmad Alvin Griffin/24060121140106
 * Deskripsi : program untuk serialisasi objek person
**/

public class ReadSerializePerson{
	public static void main(String[] args){
		Person person = null;
		try{
			FileInputStream f = new FileInputStream("person.ser");
			ObjectInputStream s = new ObjectInputStream(f);
			person = (Person)s.readObject();
			s.close();
			System.out.println("serialize person name = "+person.getName());
		}catch(Exception ioe){
			ioe.printStackTrace();
		}
	}
}