package com.lmnader.productmanager;

import com.lmnader.productmanager.model.Product;
import com.lmnader.productmanager.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductService productService;


    //@Test
    //public void testSaveProduct(){
    //    Product product = new Product();
    //    product.setName("333");
    //    product.setDescription("3333333333333333");
    //    product.setPrice(33333.33);
    //    product.setCreationDate(new Date());
    //    productService.saveProduct(product);
    //}
    //@Test
    //public void testGetAllProducts(){
    //    List<Product> allProducts = productService.getAllProducts();
    //    for (Product product:allProducts) {
    //        System.out.println(product);
    //    }
    //}
}
