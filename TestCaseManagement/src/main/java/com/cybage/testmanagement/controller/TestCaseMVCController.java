package com.cybage.testmanagement.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.testmanagement.dto.TestCaseDTO;
import com.cybage.testmanagement.model.TestCaseModel;
import com.cybage.testmanagement.service.TestCaseService;

@Controller
public class TestCaseMVCController {
	
	@Autowired
	TestCaseService testCaseService;
	
	@RequestMapping("/showTestCaseDetails")
	public ModelAndView showMessage(
			@RequestParam(value = "id", required = false, defaultValue = "1") String id) {
		System.out.println("in controller");
		TestCaseModel testCaseModel = testCaseService.getTestCase(id);
		ModelMapper modelMapper = new ModelMapper();
		TestCaseDTO testCaseDTO = modelMapper.map(testCaseModel,
				TestCaseDTO.class);
		ModelAndView mv = new ModelAndView("testCaseDisplay");
		mv.addObject("testCaseDTO", testCaseDTO);
		return mv;
	}
}
