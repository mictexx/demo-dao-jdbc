package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller1 = new Seller(1,"Adolfo", "adolfo@gmail.com", new Date(), 2000.00, obj);
		System.out.println(seller1);
		
		Seller seller2 = new Seller(1,"Adolfo", "adolfo@gmail.com", sdf.parse("01/01/2000"), 2000.00, new Department(2,"Compras"));
		System.out.println(seller2);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

	}

}
