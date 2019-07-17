package com.tw.apistackbase.core;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CompanyRepository extends CrudRepository<Company,Long> {
}
