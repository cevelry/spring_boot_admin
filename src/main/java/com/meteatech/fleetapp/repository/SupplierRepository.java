package com.meteatech.fleetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meteatech.fleetapp.models.Supplier;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
