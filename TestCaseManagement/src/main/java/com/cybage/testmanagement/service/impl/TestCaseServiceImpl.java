package com.cybage.testmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.testmanagement.dao.TestCaseDao;
import com.cybage.testmanagement.model.TestCaseModel;
import com.cybage.testmanagement.service.TestCaseService;

@Service
public class TestCaseServiceImpl implements TestCaseService {

	@Autowired
	TestCaseDao testCaseDao;

	public TestCaseModel getTestCase(String id) {

		return testCaseDao.getTestCase(id);

	}

}
