package api;

import entity.Product;

import java.util.List;

/**
 * Created by chrzanekk on 02.10.2019
 */
public interface ProductService {
    List<Product> getAllProducts();
    Integer getProductQuantity();
    Product getProductName(String productName);
    boolean isProductCountMoreThanZero(String productName);
    boolean isProductExist(String productName);
    boolean isProductExist(Long productId);

}
