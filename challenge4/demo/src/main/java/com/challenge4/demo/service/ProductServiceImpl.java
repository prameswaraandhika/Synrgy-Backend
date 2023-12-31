	package com.challenge4.demo.service;


	import com.challenge4.demo.model.Product;
	import com.challenge4.demo.repositori.ProductRepository;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import java.util.List;

	@Service
	public class ProductServiceImpl implements ProductService {
		@Autowired
		ProductRepository productRepository;
		@Override
		public List<Product> findAll() {
			return productRepository.findAll();
		}

	}
