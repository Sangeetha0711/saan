package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductRepo extends JpaRepository<Product1, Integer> {
@Query(value="select * from productinfo where price>=:p1 AND price<=:p2",nativeQuery = true)
public List<Product1> price(@PathVariable("p1") int p1,@PathVariable("p2") int p2);
}
