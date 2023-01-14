package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

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
		
//		Department obj = new Department(1, "Books");
//		System.out.println(obj);
//		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
//		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	} 
}