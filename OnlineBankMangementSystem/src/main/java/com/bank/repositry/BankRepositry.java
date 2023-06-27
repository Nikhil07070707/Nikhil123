package com.bank.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.Bank;

@Repository
public interface BankRepositry extends JpaRepository<Bank, Integer> {

}
