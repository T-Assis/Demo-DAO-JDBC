package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		System.out.println(" === TEST 1: seller findById implementation === "); 
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		
		System.out.println();
		System.out.println(" === TEST 2: seller findByDepartment implementation === "); 
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
		System.out.println();
		System.out.println(" === TEST 3: seller findAll implementation === ");	
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println(" === TEST 4: seller insert implementation === ");			
		Seller seller2 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(seller2);
		System.out.println("Inserted! New id = " + seller2.getId());
		System.out.println(seller2);
		
	}

}
