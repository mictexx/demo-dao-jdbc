package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("\n=== seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		
		Department dept = new Department(2,null);
		System.out.println("\n=== seller findByDepartmentId ===");
		List<Seller> seller2 = sellerDao.findByDepartment(dept);
		
		for(Seller obj: seller2) {
			System.out.println(obj);
		}
		
		
		System.out.println("\n=== seller findAll ===");
	    seller2 = sellerDao.findAll();
		
		for(Seller obj: seller2) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== seller Insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, dept);
		sellerDao.insert(newSeller);
		System.out.println("New Seller inserted - id: "+ newSeller.getId());
		
		
		System.out.println("\n=== seller Update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update successfully!");

	}

}
