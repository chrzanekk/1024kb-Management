package service;

import api.ProductService;
import entity.Boots;
import entity.Cloth;
import entity.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chrzanekk on 02.10.2019
 */
public class ProductServiceTest {
    @Test
    public void testGetAllProducts() {
        List<Product> products = new ArrayList<Product>();
        Product boots1 = new Boots(1L, "buty", 120.0f, 2.0f, "brown",12, "39", true);
        Product cloth1 = new Cloth(2L,"spodnie",99.0f, 2.0f,"black", 1, "S", "cotton");
        Product cloth2 = new Cloth(3L, "koszula",149.00f, 0.5f,"white", 0, "XL", "cotton");
        Product cloth3 = new Cloth(4L, "t-shirt", 29.00f, 0.5f, "yellow", 5, "L", "cotton");
        Product boots2 = new Boots(5L, "sportsboots", 159.00f, 1.5f, "black", 0, "41", false);
        products.add(boots1);
        products.add(cloth1);
        products.add(cloth2);
        products.add(cloth3);
        products.add(boots2);

        ProductServiceImpl productService = new ProductServiceImpl(products);
        List<Product> productsFromTheClass = productService.getAllProducts();

        Assert.assertEquals(products, productsFromTheClass);
        }
    @Test
    public void testGetProductQuantity() {
            List<Product> products = new ArrayList<Product>();
        Product boots1 = new Boots(1L, "buty", 120.0f, 2.0f, "brown",12, "39", true);
        Product cloth1 = new Cloth(2L,"spodnie",99.0f, 2.0f,"black", 1, "S", "cotton");
        Product cloth2 = new Cloth(3L, "koszula",149.00f, 0.5f,"white", 0, "XL", "cotton");
        Product cloth3 = new Cloth(4L, "t-shirt", 29.00f, 0.5f, "yellow", 5, "L", "cotton");
        Product boots2 = new Boots(5L, "sportsboots", 159.00f, 1.5f, "black", 0, "41", false);
        products.add(boots1);
        products.add(cloth1);
        products.add(cloth2);
        products.add(cloth3);
        products.add(boots2);

            ProductServiceImpl productService = new ProductServiceImpl(products);
            final int productsFromTheClassCount = productService.getProductQuantity();

            Assert.assertEquals(5, productsFromTheClassCount);
       }
       @Test
    public void testGetProductByProductName() {
           List<Product> products = new ArrayList<Product>();
           Product boots1 = new Boots(1L, "buty", 120.0f, 2.0f, "brown",12, "39", true);
           Product cloth1 = new Cloth(2L,"spodnie",99.0f, 2.0f,"black", 1, "S", "cotton");
           Product cloth2 = new Cloth(3L, "koszula",149.00f, 0.5f,"white", 0, "XL", "cotton");
           Product cloth3 = new Cloth(4L, "t-shirt", 29.00f, 0.5f, "yellow", 5, "L", "cotton");
           Product boots2 = new Boots(5L, "sportsboots", 159.00f, 1.5f, "black", 0, "41", false);
           products.add(boots1);
           products.add(cloth1);
           products.add(cloth2);
           products.add(cloth3);
           products.add(boots2);

           ProductServiceImpl productService = new ProductServiceImpl(products);
           Product productFromTheClass = productService.getProductByProductName("buty");

           Assert.assertEquals(boots1, productFromTheClass);
       }
       @Test
    public void testIsProductOnWarehouse() {
           List<Product> products = new ArrayList<Product>();
           Product boots1 = new Boots(1L, "buty", 120.0f, 2.0f, "brown",12, "39", true);
           Product cloth1 = new Cloth(2L,"spodnie",99.0f, 2.0f,"black", 1, "S", "cotton");
           Product cloth2 = new Cloth(3L, "koszula",149.00f, 0.5f,"white", 0, "XL", "cotton");
           Product cloth3 = new Cloth(4L, "t-shirt", 29.00f, 0.5f, "yellow", 5, "L", "cotton");
           Product boots2 = new Boots(5L, "sportsboots", 159.00f, 1.5f, "black", 0, "41", false);
           products.add(boots1);
           products.add(cloth1);
           products.add(cloth2);
           products.add(cloth3);
           products.add(boots2);

           ProductServiceImpl productService = new ProductServiceImpl(products);
           final boolean isProductOnWarehouse = productService.isProductOnWarehouse("t-shirt");

           Assert.assertTrue(isProductOnWarehouse);
       }
       @Test
    public void testIsProductExistByName() {
           List<Product> products = new ArrayList<Product>();
           Product boots1 = new Boots(1L, "buty", 120.0f, 2.0f, "brown",12, "39", true);
           Product cloth1 = new Cloth(2L,"spodnie",99.0f, 2.0f,"black", 1, "S", "cotton");
           Product cloth2 = new Cloth(3L, "koszula",149.00f, 0.5f,"white", 0, "XL", "cotton");
           Product cloth3 = new Cloth(4L, "t-shirt", 29.00f, 0.5f, "yellow", 5, "L", "cotton");
           Product boots2 = new Boots(5L, "sportsboots", 159.00f, 1.5f, "black", 0, "41", false);
           products.add(boots1);
           products.add(cloth1);
           products.add(cloth2);
           products.add(cloth3);
           products.add(boots2);

           ProductServiceImpl productService = new ProductServiceImpl(products);
           final boolean isProductExistByNameOnClass = productService.isProductExistByName("spodnie");

           Assert.assertTrue(isProductExistByNameOnClass);
       }

    @Test
    public void testIsProductExistById() {
        List<Product> products = new ArrayList<Product>();
        Product boots1 = new Boots(1L, "buty", 120.0f, 2.0f, "brown",12, "39", true);
        Product cloth1 = new Cloth(2L,"spodnie",99.0f, 2.0f,"black", 1, "S", "cotton");
        Product cloth2 = new Cloth(3L, "koszula",149.00f, 0.5f,"white", 0, "XL", "cotton");
        Product cloth3 = new Cloth(4L, "t-shirt", 29.00f, 0.5f, "yellow", 5, "L", "cotton");
        Product boots2 = new Boots(5L, "sportsboots", 159.00f, 1.5f, "black", 0, "41", false);
        products.add(boots1);
        products.add(cloth1);
        products.add(cloth2);
        products.add(cloth3);
        products.add(boots2);

        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductExistByIdOnClass = productService.isProductExistById(5L);

        Assert.assertTrue(isProductExistByIdOnClass);
    }
}
