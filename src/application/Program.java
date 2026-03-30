package application;

import modelDao.DaoFactory;
import modelDao.SellerDao;
import modelEntities.Seller;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("===TEST 1: seller finfById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
