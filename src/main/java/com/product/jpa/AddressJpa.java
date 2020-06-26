package com.product.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.model.Address;

public interface AddressJpa extends JpaRepository<Address, Integer> {

}
