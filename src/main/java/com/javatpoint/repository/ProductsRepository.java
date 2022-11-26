package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.javatpoint.model.Products;
public interface ProductsRepository extends CrudRepository<Products, Integer>
{
}
