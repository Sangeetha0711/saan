package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepo sturepo;
	public String add(Student1 s) {
		sturepo.save(s);
		return "Saved successfully";
	}
	public Student1 show(int id) {
		return sturepo.findById(id).get();
	}
	public String update(Student1 s) {
		sturepo.save(s).getId();
		return "data updated";
	}
	public String delete(Integer id) {
		sturepo.deleteById(id);
		return "data has been deleted";
	}
	public List<Student1> show1() {
		return sturepo.findAll();
	}
	public String addall(List<Student1> s) {
		for(Student1 ss:s) {
			sturepo.save(ss);
		}
		return "Saved successfully";
	}
	public List<Student1> age(int age1,int age2){
		return sturepo.age(age1, age2);
	}
	public List<Student1> gettingall(){
		List<Student1> student=show1().stream().filter(a->a.getAge()>12).collect(Collectors.toList());
		return student; 
	}
}
