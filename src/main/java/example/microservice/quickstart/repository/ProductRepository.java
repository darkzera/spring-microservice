package example.microservice.quickstart.repository;

import example.microservice.quickstart.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Integer> {
}
