package com.krypto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.krypto.DemoDao;
import com.krypto.domain.Demo;

public class DemoService {

	@Autowired
	private DemoDao dao;

	public void addDemo(Demo demo) {
		dao.addDemo(demo);
	}

	public Demo getDemo(int id) {
		return dao.getDemo(id);
	}

	public List<Demo> getAllDemos() {
		return dao.getAllDemos();
	}

	public void updateDemo(int id, Demo demo) {
		dao.updateDemo(id, demo);
	}

	public void deleteDemo(int id) {
		dao.deleteDemo(id);
	}
}
