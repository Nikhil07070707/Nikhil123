package com.bank.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.Branch;

@Repository
public interface BranchRepositry extends JpaRepository<Branch, Integer> {

}
