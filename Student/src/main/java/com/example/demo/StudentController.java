package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService stuser;
	@PostMapping(value="/add")
	public String add(@RequestBody Student1 s) {
		return stuser.add(s);
	}
	@GetMapping(value="/show/{id}")
	public Student1 show(@PathVariable int id) {
		return stuser.show(id);
	}
	@PutMapping(value="/update")
	public String update(@RequestBody Student1 s) {
		return stuser.update(s);
	}
	@DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return stuser.delete(id);
	}
	@GetMapping(value="/show1")
	public List<Student1> show1() {
		return stuser.show1();
	}
	@PostMapping(value="/adding")
	public String addall(@RequestBody List<Student1> s) {
		return stuser.addall(s);
	}
	@GetMapping(value="/getage/{age1}/{age2}")
	public List<Student1> age(@PathVariable int age1,@PathVariable int age2){
		return stuser.age(age1,age2);
	}	
	
	@GetMapping(value="getall")
	public List<Student2> getall(){
		List<Student2> stud=new ArrayList<Student2>();
		stud.add(new Student2(16,116,"shamali","VI",'B',"female",12));
		stud.add(new Student2(17,117,"haran","X",'C',"male",15));
		stud.add(new Student2(18,118,"chandru","XI",'A',"male",16));
		stud.add(new Student2(19,119,"bakiya","VII",'D',"male",13));
		stud.add(new Student2(20,120,"banumathi","V",'E',"female",10));
		List<Student2> age=stud.stream().filter(s->s.getAge()>15).collect(Collectors.toList());
		   
		return age;
	}
	@GetMapping("/getting")
	public List<Student1> gettingall(){
		return stuser.gettingall();
	}
	
	
}
