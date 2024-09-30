package com.example.test_mockito_demo.controller;

import com.example.test_mockito_demo.entity.Emp;
import com.example.test_mockito_demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empDetails")
public class EmpController {
    @Autowired
    private EmpService empService;
    @PostMapping
    public ResponseEntity<Emp>addDeatils(@RequestBody Emp emp){
        Emp emp1 = empService.addDeatils(emp);
        return new ResponseEntity<>(emp1, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Emp>>getAllDeatils(){
        List<Emp> deatils = empService.getDeatils();
        return new ResponseEntity<>(deatils, HttpStatus.OK);
    }
    @GetMapping("/get")
    public ResponseEntity<Emp>getByIdDeatils(@RequestParam long id){
        Emp emp1 = empService.getByIdDeatils(id);
        return new ResponseEntity<>(emp1, HttpStatus.CREATED);
    }

}

