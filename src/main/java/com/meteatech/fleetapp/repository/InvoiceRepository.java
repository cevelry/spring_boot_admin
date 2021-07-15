package com.meteatech.fleetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meteatech.fleetapp.models.Invoice;


@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
