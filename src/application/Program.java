package application;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
//		Read read = new Read();
//		read.testRead();
		
//		Create create = new Create();
//		create.testCreate();
		
//		Delete delete = new Delete();
//		delete.testDelete();
		
//		Transaction transaction = new Transaction();
//		transaction.testTransaction();
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
	}
}