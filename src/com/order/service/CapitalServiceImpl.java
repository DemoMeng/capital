package com.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capital.entity.Capital;
import com.order.dao.CapitalDao;


@Service
@Scope("prototype")
@Transactional
public class CapitalServiceImpl implements CapitalService {
	
	@Autowired
	private CapitalDao capitalDao;
	

	
	@Override
	public List<Capital> getAllCapital() {
		return capitalDao.getAllCapital();
	}
	
}

















