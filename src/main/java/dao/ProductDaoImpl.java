package dao;

import api.ProductDao;
import entity.Product;
import entity.ProductParser;
import utils.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chrzanekk on 14.10.2019
 */
public class ProductDaoImpl implements ProductDao {

    private final String fileName;
    private final String productType;


    public ProductDaoImpl(String fileName, String productType) throws IOException {
        this.fileName = fileName;
        this.productType = productType;
        FileUtils.createNewFile(fileName);
    }

    public List<Product> getAllProducts() throws IOException {
        List<Product> products = new ArrayList<Product>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String readLine = bufferedReader.readLine();
        while (readLine != null) {
            Product product = ProductParser.stringToProduct(readLine, productType);
            if (product != null) {
                products.add(product);
            }
            readLine = bufferedReader.readLine();
        }
        bufferedReader.close();

        return products;
    }

    public void saveProducts(List<Product> products) throws FileNotFoundException {
        FileUtils.clearFile(fileName);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(fileName,true));
        for (Product product : products) {
            printWriter.write(product.toString() + "\n") ;
        }
        printWriter.close();
    }

    public void saveProduct(Product product) throws IOException {
        List<Product> products = getAllProducts();
        products.add(product);
        saveProducts(products);
    }

    public Product getProductById(Long productId) throws IOException {
        List<Product> products = getAllProducts();
        for (Product product : products) {
            boolean isFoundProduct = product.getId().equals(productId);
            if (isFoundProduct) {
                return product;
            }
        }
        return null;
    }


}
