package com.port.controller;

import com.port.entity.Result;
import com.port.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping
public class DataController {
    @Autowired
    private DataService dataService;
    @GetMapping("/findAll")
    public Result findAll(@RequestParam Integer page, Integer pageSize, String currentPage){
        return Result.success(dataService.findAll(page, pageSize, currentPage));
    }
    @GetMapping("/findById")
    public Result findById(@RequestParam Integer id, String currentPage){
        return Result.success(dataService.findById(id, currentPage));
    }
}
