package service;

import api.ProductService;
import entity.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chrzanekk on 02.10.2019
 */
public class ProductServiceImpl implements ProductService {
    List<Product> products;

    public ProductServiceImpl() {
        this.products = new ArrayList<Product>();
    }
    public ProductServiceImpl(List<Product> products) {
        this.products = products;
    }

    public List<Product> getAllProducts() {
        return products;
    }
    public Integer getProductQuantity() {
        return products.size();
    }

    public Product getProductByProductName(String productName) {
        for (Product product : products) {
            if (product.getProductName().equals(productName))
                return product;
        }
        return null;
    }

    public boolean isProductOnWarehouse(String productName) {
        for (Product product : products) {
            if (isProductExistByName(productName) && product.getProductCount() >0)
                return true;
        }
        return false;
    }

    public boolean isProductExistByName(String productName) {
        for (Product product : products) {
            if (product.getProductName().equals(productName)){
                return true;
            }
        }
        return false;
     }

     public boolean isProductExistById(Long productId) {
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                return true;
            }
        }
        return false;
     }
    }


