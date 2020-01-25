package com.b2b.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.b2b.dao.ApprovalDao;
import com.b2b.dto.Approval;

@Service
public class ApprovalServiceImple implements ApprovalService{

	@Autowired
	private ApprovalDao approvalDao;
	
	@Override
	public List<Approval> userList() {
		List<Approval> applications = approvalDao.userList();
		return applications;
	}

	@Override
	public void insertUser(Approval approval) {
		approvalDao.insertUser(approval);
	}

}
