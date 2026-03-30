package application;

import java.util.List;

import modelDao.DaoFactory;
import modelDao.SellerDao;
import modelEntities.Department;
import modelEntities.Seller;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("===TEST 1: seller finfById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n===TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);

        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out:: println);

    }
}
