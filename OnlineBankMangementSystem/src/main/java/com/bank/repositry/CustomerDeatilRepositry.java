package com.bank.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.CustomerDetail;

@Repository
public interface CustomerDeatilRepositry extends JpaRepository<CustomerDetail, Integer> {

}
