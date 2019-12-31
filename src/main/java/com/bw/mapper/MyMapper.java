package com.bw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.entity.Goods;
import com.bw.entity.Querymodel;

public interface MyMapper {
	List<Goods> getall(Querymodel m);
	void del(@Param("id")String ids);
}
