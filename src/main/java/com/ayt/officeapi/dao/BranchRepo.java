package com.ayt.officeapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayt.officeapi.entity.Branch;

public interface BranchRepo extends JpaRepository<Branch, Integer> {
    
}
