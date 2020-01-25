package com.b2b.service;

import java.util.List;

import com.b2b.dto.Approval;

public interface ApprovalService {
	public List<Approval> userList();
	public void insertUser(Approval approval);
}