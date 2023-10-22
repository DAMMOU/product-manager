package com.lmnader.productmanager.service;

import com.lmnader.productmanager.model.Product;
import com.lmnader.productmanager.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    ProductRepository productRepository;
    /**
     * Récupère la liste de tous les produits.
     *
     * @return Liste des produits.
     */
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * Récupère un produit par son id.
     *
     * @param id Identifiant du produit.
     * @return Le produit correspondant à l'id, ou null s'il n'est pas trouvé.
     */
    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    /**
     * Enregistre un nouveau produit.
     *
     * @param product Le produit à enregistrer.
     * @return Le produit enregistré.
     */
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    /**
     * Met à jour un produit existant.
     *
     * @param product Le produit à mettre à jour.
     * @return Le produit mis à jour.
     */
    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    /**
     * Supprime un produit par son identifiant.
     *
     * @param id Identifiant du produit à supprimer.
     */
    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
