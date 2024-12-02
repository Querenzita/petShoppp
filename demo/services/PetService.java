package com.pet.demo.services;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

@Service
public class PetService<petRepository> {
   
   private final petRepository PetRepository = null;
private ProductRepository productrepository;
   
   @Autowired
   public void ProductService(ProductRepository productrepositoy) {
       this.productrepository = productrepositoy;
   }
   
   //Criação do produto
   public Product saveProduct(Product product) {
       try {
		try {
			try {
				return ProductRepository.save(product);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
   //Buscar produto
   public Product getProductByeId(Long id) {
       return productrepository.findById(id).orElse(null);
   }
   
   
   //Procurar todos os produtos
   public java.util.List<Product> getAllProducts(){
       return productrepository.findAll();
   }
   
   //Excluir os produtos
   public void deleteProduct(Long id) {
       productrepository.deleteById(id);
       
   }
}