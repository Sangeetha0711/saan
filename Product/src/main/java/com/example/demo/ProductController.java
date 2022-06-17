package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {
	
	@Autowired
	ProductService proser;
	@Autowired
	RestTemplate restTemplate; 
	
	//to get the entire student list
	@RequestMapping(value="/student")
	public String getStudentList() {
		  HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<String> entity = new HttpEntity<String>(headers);
	      
	      return restTemplate.exchange(
	         "http://localhost:8081/show1", HttpMethod.GET, entity, String.class).getBody();
	}
	
	
	//to get the particular student information
	@RequestMapping(value="/studentbyid/{id}")
	public String getStudentbyid(@PathVariable int id) {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(headers);
		
		return restTemplate.exchange("http://localhost:8081/show/"+id, HttpMethod.GET, entity, String.class).getBody();
	}
	
	
	@PostMapping(value="/add")
	public String saveval(@RequestBody Product1 p) {
		return proser.saveval(p);
	}
	@GetMapping(value="/show/{id}")
	public Product1 showval(@PathVariable int id) {
		return proser.showval(id);
		
		
	}
	@PutMapping(value="/update")
	public String updateval(@RequestBody Product1 p) {
		return proser.updateval(p);
	}
	@DeleteMapping(value="/delete/{id}")
	public String deleteval(@PathVariable Integer id) {
		return proser.deleteval(id);
	}
	@GetMapping(value="/getall")
	public List<Product1> getall(){
		return proser.getall();
	}
	@PostMapping(value="/setall")
	public String setall(@RequestBody List<Product1> p) {
		return proser.setall(p);
	}
	@GetMapping(value="/getprice/{p1}/{p2}")
	public List<Product1> price(@PathVariable int p1,@PathVariable int p2){
		return proser.price(p1,p2);
	}
}
