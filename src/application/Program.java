package application;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import modelEntities.Department;
import modelEntities.Seller;
import modelDao.DaoFactory;
import modelDao.SellerDao;

public class Program {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===TEST 1: seller finfById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n===TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);

        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out:: println);

        
        System.out.println("\n===TEST 3: seller findAll ===");;

        list = sellerDao.findAll();
        list.forEach(System.out:: println);


        System.out.println("\n===TEST 4: seller Insert ===");;
        
        Seller newSeller = new Seller(null,"Greg","Greg@gmail.com",LocalDate.of(1995,5,15),2000.0, department);
        sellerDao.insert(newSeller);

        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n===TEST 5: seller Update ===");

        seller = sellerDao.findById(1);

        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update complete");

        System.out.println("\n===TEST 6: seller Delete ===");
        System.out.println("Enter id for delete test: ");
        int id = scn.nextInt();
        sellerDao.deleteById(id);

        scn.close();



    }
}
