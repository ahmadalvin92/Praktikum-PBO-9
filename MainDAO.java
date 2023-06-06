/**
 * File : MainDAO.java 01/06/2023
 * Nama : Ahmad Alvin Griffin
 * NIM  : 24060121140106
 * Deskripsi : main program untuk akses DAO
**/

public class MainDAO{
	public static void main(String args[]){
		Person person = new Person("Indra");
		DAOManager m = new DAOManager();
		m.setPersonDAO(new MySQLPersonDAO());
		try{
			m.getPersonDAO().savePerson(person);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}