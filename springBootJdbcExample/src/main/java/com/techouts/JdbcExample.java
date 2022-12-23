package com.techouts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcExample {
	@Autowired
	JdbcTemplate template;
	@RequestMapping("/create")
	public String create() {
		template.execute("create table student(id int primary key,name varchar(40)");
		return "table created";
		
	}
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insert() {
		template.execute("insert into student(id,name)values('2','ruksana')");
		return "inserted successfully";
	}
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public String update() {
		template.execute("update student set name='ruksana' where id=1 ");
		return "updated successfully";
	}
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	public String delete() {
		template.execute("delete from student where id=1");
		return "deleted successfully";
	}
	@RequestMapping(value="/retrieve",method=RequestMethod.POST)
	public String get() {
		template.execute("select * from student");
		return "retireved successfully";
	}
}
	