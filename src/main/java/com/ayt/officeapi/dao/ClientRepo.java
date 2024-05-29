package com.ayt.officeapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayt.officeapi.entity.Client;

public interface ClientRepo extends JpaRepository<Client, Integer> {
    
}
