package com.krypto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.krypto.domain.Demo;
import com.krypto.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping(value = "/addDemo", method = RequestMethod.POST)
	public void addDemo(Demo demo) {
		demoService.addDemo(demo);
	}

	@RequestMapping(value = "/getDemo/{id}", method = RequestMethod.GET)
	public Demo getDemo(int id) {
		return demoService.getDemo(id);
	}

	@RequestMapping(value = "/getAllDemos", method = RequestMethod.GET)
	public List<Demo> getAllDemos() {
		return demoService.getAllDemos();
	}

	@RequestMapping(value = "/updateDemo/{id}", method = RequestMethod.POST)
	public void updateDemo(int id, Demo demo) {
		demoService.updateDemo(id, demo);
	}

	@RequestMapping(value = "/deleteDemo/{id}", method = RequestMethod.DELETE)
	public void deleteDemo(int id) {
		demoService.deleteDemo(id);
	}

}
