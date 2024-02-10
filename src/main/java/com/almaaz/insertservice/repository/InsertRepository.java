package com.almaaz.insertservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.almaaz.insertservice.model.Employee;

public interface InsertRepository extends CrudRepository<Employee, Integer> {

}
