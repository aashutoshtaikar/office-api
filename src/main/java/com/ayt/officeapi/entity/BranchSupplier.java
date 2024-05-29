package com.ayt.officeapi.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "branch_supplier")
@IdClass(BranchSupplierId.class)
@Data
public class BranchSupplier {

    @Id
    @Column(name = "branch_id")
    private int branchId;

    @Id
    @Column(name = "supplier_name", length = 40)
    private String supplierName;

    @Column(name = "supply_type", length = 40)
    private String supplyType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "FK_branch_supplier_branch"))
    private Branch branch;   
}
