package kg.itschool.crm;

import kg.itschool.crm.dao.*;
import kg.itschool.crm.dao.daoutil.DaoFactory;
import kg.itschool.crm.model.CourseFormat;
import kg.itschool.crm.model.Manager;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Scanner scan = new Scanner(System.in);

        System.out.print("First name: ");
        manager.setFirstName(scan.nextLine());

        System.out.print("Last name: ");
        manager.setLastName(scan.nextLine());

        System.out.print("Email: ");
        manager.setEmail(scan.nextLine());

        System.out.print("Phone number: ");
        manager.setPhoneNumber(scan.nextLine());

        System.out.print("Date of birth: ");
        manager.setDob(LocalDate.parse(scan.nextLine())); // yyyy-MM-dd

        System.out.print("Salary: ");
        manager.setSalary(scan.nextDouble());

        System.out.println("Input: " + manager);

        ManagerDao managerDao = DaoFactory.getManagerDaoSQL();

        System.out.println("From database: " + managerDao.save(manager));
//        System.out.println(managerDao.findById(1L));
//        System.out.println(managerDao.findById(6L));

//        CourseFormat courseFormat = new CourseFormat();

//        courseFormat.setFormat("Boot");

    }
}
