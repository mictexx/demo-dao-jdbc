package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== Department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		

		List<Department> department2 = null;
		
		
		System.out.println("\n=== seller findAll ===");
		department2 = departmentDao.findAll();
		
		for(Department obj: department2) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== department Insert ===");
		Department newDepartment = new Department(null, "Procurement");
		departmentDao.insert(newDepartment);
		System.out.println("New Department inserted - id: "+ newDepartment.getId());
		
		
		System.out.println("\n=== Department Update ===");
		department = departmentDao.findById(6);
		department.setName("CustomerSuccess");
		departmentDao.update(department);
		System.out.println("Update successfully!");
		
		
		System.out.println("\n=== department Delete ===");
		System.out.print("Enter the id to execute delete:_");
		int idDel = sc.nextInt();
		departmentDao.deleteById(idDel);
		System.out.println("Deleted successfully!");
		
		sc.close();

	}

}
