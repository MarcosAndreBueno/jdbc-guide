package application;

import model.dao.DaoFactory;
import java.util.Date;
import java.util.List;

import model.dao.SellerDao;
import model.entities.Department;
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
		
//		System.out.println("=== TEST 1: seller findById =====");
//		Seller seller = sellerDao.findById(3);
//		System.out.println(seller);
		

//		System.out.println("\n=== TEST 2: seller findByDepartment =====");
//		Department department = new Department(2, null);
//		List<Seller> list = sellerDao.findByDepartment(department);
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
		

		System.out.println("\n=== TEST 3: seller findAll =====");
		List<Seller> list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
//		System.out.println("\n=== TEST 4: seller insert =====");
//		Department department = new Department(2, null);
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New id = " + newSeller.getId());

	} 
}