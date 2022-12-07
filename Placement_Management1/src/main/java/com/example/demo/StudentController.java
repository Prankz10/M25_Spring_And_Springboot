package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	private StudentService service;
	
	//creation
	@PostMapping("/Student")
	public void add(@RequestBody Student s)
	{
		service.create(s);
	}
	
	//deletion
	@DeleteMapping("/Student/{id}")
	public void remove (@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	//Retrieve data with all details
	@GetMapping("/Student")
	public List<Student>list()
	{
		return service.listAll();
	}
	
	//Retrieve with specific ID
	@GetMapping("/Student/{id}")
	public ResponseEntity<Student>get(@PathVariable Integer id)
	{
		try 
		{
			Student s=service.retrieve(id);
		return new ResponseEntity<Student>(s,HttpStatus.OK);
		}
		
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	//update any data
	@PutMapping("/Student/{id}")
	public ResponseEntity<Student>update(@RequestBody Student p, @PathVariable Integer id)
	{
		try 
		{
		Student s1=service.retrieve(id);
		service.create(s1);
		return new ResponseEntity<Student>(s1,HttpStatus.OK);
		}
		
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}

}