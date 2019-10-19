package api;

import entity.Product;

import java.io.IOException;
import java.util.List;

/**
 * Created by chrzanekk on 02.10.2019
 */
public interface ProductService {
    List<Product> getAllProducts() throws IOException;
    Integer getProductQuantity() throws IOException;
    Product getProductByProductName(String productName) throws IOException;
    boolean isProductOnWarehouse(String productName);
    boolean isProductExistByName(String productName);
    boolean isProductExistById(Long productId);

}
