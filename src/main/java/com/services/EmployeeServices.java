package com.services;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import com.entity.EmployeePayRool;

public class EmployeeServices {

		
		public static void main(String[] args) {

			EmployeePayRool employee = new EmployeePayRool();
			Scanner scan = new Scanner(System.in);

			System.out.print(" Please enter the name of the employee: ");
			String name = scan.next();

			System.out.print(" Please enter the id of the employee: ");
			int id = scan.nextInt();

			System.out.print(" Please enter the salary of the employee: ");
			double salary = scan.nextDouble();

			employee.setNAME(name);
			employee.setID(id);
			employee.setSALARY(salary);

			System.out.println(employee);
			
			Path path = Paths.get("src/main/resources/someFile.txt");
			FileServices.DoesFileExist(path);
			
			FileServices.DeleteFile(path);
			
			FileServices.CreateDirectory(Paths.get("src/main/resources/someDirectory"));
			
			FileServices.createFile(path);

			FileServices.listFiles(Paths.get("src/test/resources/"));
			scan.close();

		}
	
}

