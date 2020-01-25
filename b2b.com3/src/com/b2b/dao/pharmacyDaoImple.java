package com.b2b.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.b2b.dto.Pharmacy;

@Repository
public class pharmacyDaoImple implements pharmacyDao{

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	@Override
	public void updatePharmacy(Pharmacy pharmacy) {
		System.out.println("UPDATE(REGISTER) USER--->USER DAO IMPLE");
		String sql = "update pharmacy set pharName = ?, pharPass = ?, pharAddress = ?, pharMailId = ? where pharId = ?";
		//jdbctemplate.update(sql, user.getUserType(), user.getUserName(), user.getPassword(), user.getAddress(), user.getPhoneNumber(), user.getEmailId());
		jdbctemplate.update(sql, pharmacy.getPharName(), pharmacy.getPharPass(), pharmacy.getPharAddress(), pharmacy.getPharMailId(), pharmacy.getPharId());
	}
	
}
