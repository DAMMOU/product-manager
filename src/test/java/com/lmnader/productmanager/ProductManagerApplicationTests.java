package com.lmnader.productmanager;

import com.lmnader.productmanager.model.Product;
import com.lmnader.productmanager.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AssertionErrors;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ProductManagerApplicationTests {

	@Autowired
	private ProductRepository productRepository;
	@Test
	public void createProdcutTest(){
		Product product = new Product();
		product.setName("ggg");
		product.setDescription("fksfv");
		product.setPrice(2000.00);
		product.setCreationDate(new Date());
		productRepository.save(product);
	}
	@Test
	public void testFindProductById() {
		Long productId = 1L;
		Product product = productRepository.findById(productId).orElse(null);
		// Vérifier que le produit a été trouvé
		System.out.println(product);
	}
	@Test
	public void updateProductTest() {
		Long productId = 1L;
		try {
			Product product = productRepository.findById(productId).orElse(null);
			if (product != null) {
				product.setPrice(10.0);
				productRepository.save(product);
			} else {
				System.out.println("Id = " + productId + " not found");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void findAllProducts(){
		List<Product> products = productRepository.findAll();
		for (Product product:products) {
			System.out.println(product);
		}
	}


}
