import Model.Dao.DaoFactory;
import Model.Dao.SellerDao;
import Model.Entities.Department;
import Model.Entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Seller obj2 = new Seller(1, "Maaarcio", "podcast@mail.com", new Date(), 3000.0, obj);
        System.out.println("=== TEST #1: seller findById");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(obj2);
    }
}