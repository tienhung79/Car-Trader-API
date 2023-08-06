package com.example.car_trader.repository;


import com.example.car_trader.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO product(image, price, product_name,quantity, status, product_type_id)" +
            "VALUAS(:image, :price, :product_name,:quantity, :status, :product_type_id)", nativeQuery = true)
    void saveProduct(
            @Param("image") String image,
            @Param("price") String price,
            @Param("product_name") String productName,
            @Param("quantity") Integer quantity,
            @Param("status") String status,
            @Param("product_type_id") Integer productTypeId
    );


    @Query(value = "SELECT * FROM product ORDER BY product_id DESC  LIMIT 8", nativeQuery = true)
    List<Product> findNewProduct();


    @Query(value = "select * from product where product_type_id = :productTypeId" , nativeQuery = true)
    List<Product> getProductByType(@Param("productTypeId") Integer type);
@Query(value = "select * from product where product_name like %:product_name% ",nativeQuery = true)
    List<Product> findByName(@Param("product_name") String nameSearch);
}
