package api;

import entity.Product;

import java.util.List;

/**
 * Created by chrzanekk on 02.10.2019
 */
public interface ProductService {
    List<Product> getAllProducts();
    Integer getProductQuantity();
    Product getProductByProductName(String productName);
    boolean isProductOnWarehouse(String productName);
    boolean isProductExistByName(String productName);
    boolean isProductExistById(Long productId);

}
