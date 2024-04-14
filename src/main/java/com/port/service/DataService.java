package com.port.service;

import com.port.entity.DataUnit;

import java.util.List;
import java.util.Map;

public interface DataService {
    List<Map<String, Object>> findAll(Integer page, Integer pageSize, String currentPage);
    DataUnit findById(Integer id, String currentPage);
}
