package Inventory.Data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Inventory.Data.Model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
