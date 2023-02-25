package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Baby;
import com.example.demo.repository.BabyRepo;

@Service
public class BabyService {
	@Autowired
	BabyRepo repository;
	public String addBaby(Baby baby){
		repository.save(baby);
		return "Added";
}
	public List<Baby> getBaby(){
		return repository.findAll();
	}
	public List<Baby> getBabyWithSorted(String field){
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<Baby> getBabyWithPagination(int offset,int pagesize){
			Page<Baby> page=repository.findAll(PageRequest.of(offset, pagesize));
			return page.getContent();
	}
	public List<Baby> getBabyWithPaginationAndSorting(int offset,int pagesize,String field){
		Pageable paging=PageRequest.of(offset,pagesize,Sort.by(field));
		Page<Baby> page=repository.findAll(paging);
		return page.getContent();
	}
}
