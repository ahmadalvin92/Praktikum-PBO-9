
/**
 * File : DAOManager.java 01/06/2023
 * Nama : Ahmad Alvin Griffin
 * NIM  : 24060121140106
 * Deskripsi : pengelola DAO dalam program
**/

public class DAOManager{
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO person){
		personDAO = person;
	}

	public PersonDAO getPersonDAO(){
		return personDAO;
	}
}