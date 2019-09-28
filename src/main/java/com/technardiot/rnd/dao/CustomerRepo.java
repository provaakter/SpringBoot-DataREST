package com.technardiot.rnd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.technardiot.rnd.model.Customer;

@RepositoryRestResource(collectionResourceRel="customers", path="customers")
public interface CustomerRepo  extends JpaRepository<Customer, Integer>
{
	
}