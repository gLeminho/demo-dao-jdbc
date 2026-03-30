package modelDao;

import db.DB;
import modelDaoImpl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao creatSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
