package dao;

import api.ProductDao;

import java.io.IOException;

/**
 * Created by chrzanekk on 14.10.2019
 */
public class ProductDaoImpl implements ProductDao {

    private final String fileName;
    private final String productType;


    public ProductDaoImpl(String fileName, String productType) throws IOException {
        this.fileName = fileName;
        this.productType = productType;


    }
}
