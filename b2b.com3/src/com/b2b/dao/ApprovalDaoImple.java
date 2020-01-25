package com.b2b.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.b2b.dto.Approval;

@Repository
public class ApprovalDaoImple implements ApprovalDao{

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public List<Approval> userList() {
		String sql = "SELECT * FROM approval";
		List<Approval> applications = jdbctemplate.query(sql, new BeanPropertyRowMapper(Approval.class));
		return applications;
	}

	@Override
	public void approveUser(Approval approval) {
		
	}

	@Override
	public void insertUser(Approval approval) {
		System.out.println("INSERT(REGISTER) USER--->APPROVAL DAO IMPLE");
		String sql = " insert into approval(tempType, tempName, tempPass, tempAddr, tempPhoneNo, tempMailId) values(?,?,?,?,?,?)";
		jdbctemplate.update(sql, approval.getTempType(), approval.getTempName(), approval.getTempPass(), approval.getTempAddr(), approval.getTempPhoneNo(), approval.getTempMailId());
		
		String sql2 = " insert into user(userName, userPass , userType) values(?,?,?)";
		jdbctemplate.update(sql2, approval.getTempName(), approval.getTempPass(), approval.getTempType());
	}
}