package com.lmnader.productmanager.service;

import com.lmnader.productmanager.model.Product;

import java.util.List;

public interface ProductService {
    /**
     * Récupère la liste de tous les produits.
     *
     * @return Liste des produits.
     */
    List<Product> getAllProducts();

    /**
     * Récupère un produit par son identifiant.
     *
     * @param id Identifiant du produit.
     * @return Le produit correspondant à l'identifiant, ou null s'il n'est pas trouvé.
     */
    Product getProductById(Long id);

    /**
     * Enregistre un nouveau produit.
     *
     * @param product Le produit à enregistrer.
     * @return Le produit enregistré.
     */
    Product saveProduct(Product product);

    /**
     * Met à jour un produit existant.
     *
     * @param product Le produit à mettre à jour.
     * @return Le produit mis à jour.
     */
    Product updateProduct(Product product);

    /**
     * Supprime un produit par son identifiant.
     *
     * @param id Identifiant du produit à supprimer.
     */
    void deleteProductById(Long id);
}
