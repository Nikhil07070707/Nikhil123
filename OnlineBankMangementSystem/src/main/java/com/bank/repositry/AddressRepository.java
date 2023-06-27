package com.bank.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
