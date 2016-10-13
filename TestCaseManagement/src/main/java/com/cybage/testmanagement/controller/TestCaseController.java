package com.cybage.testmanagement.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.testmanagement.dto.TestCaseDTO;
import com.cybage.testmanagement.model.TestCaseModel;
import com.cybage.testmanagement.service.TestCaseService;

@RestController
@RequestMapping("/testCase")
public class TestCaseController {

	@Autowired
	TestCaseService testCaseService;

	@RequestMapping(value = "/getTestCase/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public TestCaseDTO getTestCases(@PathVariable String id) {
		TestCaseModel testCaseModel = testCaseService.getTestCase(id);
		ModelMapper modelMapper = new ModelMapper();
		TestCaseDTO testCaseDTO = modelMapper.map(testCaseModel,
				TestCaseDTO.class);
		return testCaseDTO;
	}

}
