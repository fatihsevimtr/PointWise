package com.exerate.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exerate.model.Receipt;

public interface ReceiptRepository extends MongoRepository<Receipt, Long>{
	Receipt findByCustomerId(String id);
}
