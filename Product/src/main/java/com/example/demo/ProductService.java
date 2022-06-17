package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductDao prodao;
	public String saveval(Product1 p) {
		return prodao.saveval(p);
	}
	public Product1 showval(int id) {
		return prodao.showval(id);
	}
	public String updateval(Product1 p) {
		return prodao.updateval(p);
	}
	public String deleteval(Integer id) {
		return prodao.deleteval(id);
	}
	public List<Product1> getall(){
		return prodao.getall();
	}
	public String setall(List<Product1> p) {
		return prodao.setall(p);
	}
	public List<Product1> price(int p1,int p2){
		return prodao.price(p1,p2);
	}
}
