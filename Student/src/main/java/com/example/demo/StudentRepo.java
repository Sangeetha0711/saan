package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface StudentRepo extends JpaRepository<Student1, Integer> {
	@Query(value="select * from stud_info where age>=:age1 AND age<=:age2",nativeQuery = true)
	public List<Student1> age(@PathVariable("age1") int age1,@PathVariable("age2") int age2);
}
