package com.ayt.officeapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "works_with")
@IdClass(WorksWithId.class)
@Data
public class WorksWith {

    @Id
    @Column(name = "emp_id")
    private Integer employeeId;

    @Id
    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "total_sales")
    private Integer totalSales;
}

