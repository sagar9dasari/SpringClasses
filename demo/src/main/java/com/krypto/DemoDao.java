package com.krypto;

import java.util.ArrayList;
import java.util.List;

import com.krypto.domain.Demo;

public class DemoDao {

	private List<Demo> demoList = new ArrayList<Demo>();

	public void addDemo(Demo demo) {
		demoList.add(demo);
	}

	public Demo getDemo(int id) {
		for (int i = 0; i < demoList.size(); i++) {
			if (demoList.get(i).getId() == id) {
				return demoList.get(i);
			}
		}
		return null;
	}

	public List<Demo> getAllDemos() {
		return demoList;
	}

	public void updateDemo(int id, Demo demo) {
		for (int i = 0; i < demoList.size(); i++) {
			if (demoList.get(i).getId() == id) {
				demoList.set(i, demo);
				break;
			}
		}
	}

	public void deleteDemo(int id) {
		for (int i = 0; i < demoList.size(); i++) {
			if (demoList.get(i).getId() == id) {
				demoList.remove(i);
				break;
			}
		}
	}
}
