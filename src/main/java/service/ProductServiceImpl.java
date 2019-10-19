package service;

import api.ProductDao;
import api.ProductService;
import dao.ProductDaoImpl;
import entity.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chrzanekk on 02.10.2019
 */
public class ProductServiceImpl implements ProductService {

    private static ProductServiceImpl instance = null;
    private ProductDao productDao = new ProductDaoImpl("product.data", "PRODUCT");

    private ProductServiceImpl() throws IOException {

    }
    public ProductServiceImpl getInstance() throws IOException {
        if (instance == null) {
            instance = new ProductServiceImpl();
        }
        return instance;
    }

    public List<Product> getAllProducts() throws IOException {
        return productDao.getAllProducts();
    }
    public Integer getProductQuantity() throws IOException {
        return getAllProducts().size();
    }

    public Product getProductByProductName(String productName) throws IOException {
        return productDao.getProductByProductName(productName);
    }

    public boolean isProductOnWarehouse(String productName) {
        try {
            for(Product product : getAllProducts()) {
                if (isProductExistByName(productName) && product.getProductCount() > 0) {
                    return true;
                }

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isProductExistByName(String productName) {
        Product product = null;
        try {
            product = productDao.getProductByProductName(productName);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        if (product == null) return false;
        return true;
    }

     public boolean isProductExistById(Long productId) {
         Product product = null;
         try {
             product = productDao.getProductById(productId);
         }
         catch (IOException e) {
             e.printStackTrace();
         }
         if (product == null) return false;
         return true;
     }

    }


