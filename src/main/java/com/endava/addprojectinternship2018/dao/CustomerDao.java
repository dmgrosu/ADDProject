package com.endava.addprojectinternship2018.dao;

import com.endava.addprojectinternship2018.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerDao extends JpaRepository <Customer, Integer> {

    List<Customer> findAll();
    Optional <Customer> findById(String id);
    Optional<Customer> findByFirstNameAndLastName(String f_name, String L_name);
    Optional<Customer> findByBankAccount(String bank_acc);

}