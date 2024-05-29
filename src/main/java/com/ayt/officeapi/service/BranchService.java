package com.ayt.officeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayt.officeapi.dao.BranchRepo;
import com.ayt.officeapi.entity.Branch;

@Service
public class BranchService {
    @Autowired
    private BranchRepo branchRepo;

    public List<Branch> getBranches() {
        return branchRepo.findAll();
    }
}
