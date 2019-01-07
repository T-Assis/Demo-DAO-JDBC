package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		

		System.out.println(" ===== TEST SellerDao ===== ");
		System.out.println();
		System.out.println(" === TEST 1: seller findById implementation === "); 
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		
		System.out.println();
		System.out.println(" === TEST 2: seller findByDepartment implementation === "); 
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
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
		Seller seller2 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, dep);
		sellerDao.insert(seller2);
		System.out.println("Inserted! New id = " + seller2.getId());
		System.out.println(seller2); 
		
		
		System.out.println();
		System.out.println(" === TEST 5: seller update implementation === ");	
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		seller.setEmail("marthawaine@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		System.out.println(seller);
		
		
		System.out.println();
		System.out.println(" === TEST 6: seller delete implementation === ");
		System.out.println("Delete completed! Id = 7");
		sellerDao.deleteById(7);
		
		
		
		System.out.println();
		System.out.println();
		System.out.println(" ===== TEST DepartmentDao ===== ");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println();
		System.out.println(" === TEST 1: department findById implementation === ");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		
		System.out.println();
		System.out.println(" === TEST 2: department findAll implementation === ");	
		List<Department> list2 = departmentDao.findAll();
		for (Department obj : list2) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println(" === TEST 3: department insert implementation === ");			
		Department department2 = new Department(null, "Food");
		departmentDao.insert(department2);
		System.out.println("Inserted! New id = " + department2.getId());
		System.out.println(department2); 
		
		
		System.out.println();
		System.out.println(" === TEST 4: department update implementation === ");	
		department = departmentDao.findById(1);
		department.setName("Financial");
		departmentDao.update(department);
		System.out.println("Update completed!");
		System.out.println(department);
		
		
		System.out.println();
		System.out.println(" === TEST 5: department delete implementation === ");
		System.out.println("Delete completed! Id = 5");
		departmentDao.deleteById(5);
			
	}

}
