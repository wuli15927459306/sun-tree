package com.bw.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.entity.Goods;
import com.bw.entity.Querymodel;
import com.bw.mapper.MyMapper;
import com.bw.service.Myservice;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class Myserviceimpl implements Myservice {
@Autowired
private MyMapper myMapper;
	public List<Goods> getall(Querymodel m) {
		Page<Goods> startPage = PageHelper.startPage(m.getPagenum(), m.getPagesize());
		List<Goods> getall = myMapper.getall(m);
		PageInfo<Goods> b=new PageInfo<Goods>(startPage);
		m.setPagenum(b.getPageNum());
		m.setPages(b.getPages());
		return getall;
		
	}
	public void del(String ids) {
		// TODO Auto-generated method stub
		myMapper.del(ids);
	}

}
