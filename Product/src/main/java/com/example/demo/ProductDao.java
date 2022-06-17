package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ProductDao {
	@Autowired
	ProductRepo prorepo;
	RestTemplate restTemplate;
	public String saveval(Product1 p) {
		prorepo.save(p);
		return "Successfully saved";
	}
	public Product1 showval(int id) {
		return prorepo.findById(id).get();
		
	}
	public String updateval(Product1 p) {
		prorepo.save(p).getId();
		return "updated successfully";
	}
	public String deleteval(Integer id) { 
		prorepo.deleteById(id);
		return "deleted successfully";
	}
	public List<Product1> getall(){
		return prorepo.findAll();
		
	}
	public String setall(List<Product1> p) {
		for(Product1 pp:p) {
			prorepo.save(pp);
		}
		return "saved successfully";
	}
	public  List<Product1> price(int p1,int p2){
		return prorepo.price(p1, p2);
	}

}
