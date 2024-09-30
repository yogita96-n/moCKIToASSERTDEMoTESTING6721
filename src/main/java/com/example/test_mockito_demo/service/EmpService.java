package com.example.test_mockito_demo.service;

import com.example.test_mockito_demo.entity.Emp;
import com.example.test_mockito_demo.repo.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpRepository empRepository;
    public Emp addDeatils(Emp emp){
      return  empRepository.save(emp);

    }
    public List<Emp> getDeatils(){
        return  empRepository.findAll();

    }public Emp getByIdDeatils(long id){
       return empRepository.findById(id).get();

    }

}
