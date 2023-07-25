package com.boot.service;
import com.boot.Repositories.ProductDetailsRepository;


import org.springframework.beans.factory.annotation.Autowired;



@org.springframework.stereotype.Service
public class Service implements ProductDetailsRepository{

	@Autowired
	ProductDetailsRepository productDetailsRepository;
	
	
}
