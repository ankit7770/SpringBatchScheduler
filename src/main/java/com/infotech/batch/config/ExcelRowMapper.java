package com.infotech.batch.config;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

import com.infotech.batch.model.Person;

public class ExcelRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(RowSet rs) throws Exception {
		Person person=new Person();
		person.setFirstName(rs.getColumnValue(0));
		person.setLastName(rs.getColumnValue(1));
		person.setEmail(rs.getColumnValue(2));
		person.setAge(24);
		return person;
		}
	
		
}
