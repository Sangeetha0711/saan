package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentDao studao;
	public String add(Student1 s) {
		return studao.add(s);
	}
	public Student1 show(int id) {
		return studao.show(id);
	}
	public String update(Student1 s) {
		return studao.update(s);
	}
	public String delete(Integer id) {
		return studao.delete(id);
	}
	public List<Student1> show1() {
		return studao.show1();
	}
	public String addall(List<Student1> s) {
		return studao.addall(s);
	}
	public List<Student1> age(int age1,int age2){
		return studao.age(age1,age2);
	}
	public List<Student1> gettingall(){
		return studao.gettingall();
	}
	
}
