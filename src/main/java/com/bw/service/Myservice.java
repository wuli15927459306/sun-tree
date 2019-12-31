package com.bw.service;

import java.util.List;

import com.bw.entity.Goods;
import com.bw.entity.Querymodel;

public interface Myservice {
	List<Goods> getall(Querymodel m);

	void del(String  ids);

}
