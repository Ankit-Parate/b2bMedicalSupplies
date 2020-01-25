package com.b2b.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.b2b.dto.Admin;
import com.b2b.dto.User;

@Repository
public class UserDaoImple implements UserDao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Override
	@SuppressWarnings("deprecation")
	public User getUserType(User user) {
		User usr1 = null;
		System.out.println("VALIDATE (LOGIN) USER--->USER DAO IMPLE");
		String sql = "select * from user where userName=? AND userPass = ?";
		//String sql = "select * from user where userName=?";
		User usr = new User();
  		
  		try 
  		{
     		 usr1 = jdbctemplate.queryForObject(sql, new Object[]{user.getUserName(),user.getUserPass()}, new RowMapper<User>() 
     		 {
     			 @Override
     			 public User mapRow(ResultSet rs, int rowNum) throws SQLException 
     			 {
	     		     User usr = new User();
					 usr.setUserName(rs.getString(2));
					 usr.setUserPass(rs.getString(3));
					 usr.setUserType(rs.getString(4));
					 System.out.println("returning usr");
					 return usr;
     			 }
     		 });
     		 
  		}
	  	catch(Exception e)
		{
			usr = null;
			usr1 = usr;
		}
  		System.out.println("returning usr1");
  		return usr1;
	}

	
	
	/*
	@Override
	public User getUser(User user) {
		String type = user.getUserType().toString();
		
		User usr = new User();
		User usr1 = null;
		
		if(type.equals("admin")) {
			try 
	  		{
				Admin adm = new Admin();
				Admin adm1 = null;
				
				String sql = "select * from admin where adminName=?";
	     		 adm1 = jdbctemplate.queryForObject(sql, new Object[]{user.getUserName()}, new RowMapper<Admin>()
	     		 {
	     			 @Override
	     			 public Admin mapRow(ResultSet rs, int rowNum) throws SQLException 
	     			 {
	     				Admin adm = new Admin();
						 adm.setAdminName(rs.getString(2));
						 //usr.setUserType(rs.getString(3));
						 return adm;
	     			 }
	     		 });
	  		}
		  	catch(Exception e)
			{
				usr = null;
				usr1 = usr;
			}
			
			return adm1;
		}
		else if(type.equals("pharmacy")) {
			try 
	  		{
				String sql = "select * from pharmacy where pharName=?";
	     		 usr1 = jdbctemplate.queryForObject(sql, new Object[]{user.getUserName()}, new RowMapper<User>()
	     		 {
	     			 @Override
	     			 public User mapRow(ResultSet rs, int rowNum) throws SQLException 
	     			 {
		     		     User usr = new User();
						 usr.setUserName(rs.getString(2));
						
						 return usr;
	     			 }
	     		 });
	  		}
		  	catch(Exception e)
			{
				usr = null;
				usr1 = usr;
			}
			
			return usr1;
		}
		else if(type.equals("manufacturer")) {
			try 
	  		{
				String sql = "select * from manufacturer where manuName=?";
	     		 usr1 = jdbctemplate.queryForObject(sql, new Object[]{user.getUserName()}, new RowMapper<User>()
	     		 {
	     			 @Override
	     			 public User mapRow(ResultSet rs, int rowNum) throws SQLException 
	     			 {
		     		     User usr = new User();
						 usr.setUserName(rs.getString(2));
						
						 return usr;
	     			 }
	     		 });
	  		}
		  	catch(Exception e)
			{
				usr = null;
				usr1 = usr;
			}
			
			return usr1;
		}
		return null;
	}
	*/
}
