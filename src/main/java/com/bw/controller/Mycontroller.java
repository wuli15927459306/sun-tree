package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.entity.Goods;
import com.bw.entity.Querymodel;
import com.bw.service.Myservice;

@Controller
public class Mycontroller {
@Autowired
private Myservice myservice;
@RequestMapping("querylist")
public String getall(Model model,Querymodel m) {
	List<Goods> getall = myservice.getall(m);
	model.addAttribute("list", getall);
	model.addAttribute("model", m);
	return "list";
}
@RequestMapping("del")
@ResponseBody
public void del(String ids) {
	myservice.del(ids);
}
}
