package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Baby;

import com.example.demo.service.BabyService;

@RestController

public class BabyController {

@Autowired

BabyService service;

@PostMapping("/baby")

public String addProduct(@RequestBody Baby baby) {

return service.addBaby(baby);

}

@GetMapping("/baby")

public List<Baby> read(){

return service.getBaby();

}

@GetMapping("/baby/{field}")

public List<Baby> babyWithSort(@PathVariable String field){

return service.getBabyWithSorted(field);

}

@GetMapping("/baby/{offset}/{pagesize}")

public List<Baby> babyWithPagination(@PathVariable int offset,@PathVariable int pagesize){

return service.getBabyWithPagination(offset, pagesize);

}

@GetMapping("/baby/{offset}/{pagesize}/{field}")

public List<Baby> getWithSortedPagination(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field){

return service.getBabyWithPaginationAndSorting(offset, pagesize, field);

}

}