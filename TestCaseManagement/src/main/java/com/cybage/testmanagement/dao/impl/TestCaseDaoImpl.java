package com.cybage.testmanagement.dao.impl;

import org.springframework.stereotype.Repository;

import com.cybage.testmanagement.dao.TestCaseDao;
import com.cybage.testmanagement.model.TestCaseModel;

@Repository
public class TestCaseDaoImpl implements TestCaseDao {

	public TestCaseModel getTestCase(String id) {

		TestCaseModel testModel = new TestCaseModel();
		testModel.setId(id);
		testModel.setTestCaseName("Dummy Test Case");
		testModel.setTestCaseDescription("Dummy Test Case");
		return testModel;
	}

}
