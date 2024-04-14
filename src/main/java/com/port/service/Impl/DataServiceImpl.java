package com.port.service.Impl;

import com.port.entity.DataUnit;
import com.port.mapper.DataMapper;
import com.port.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private DataMapper dataMapper;
    @Override
    public List<Map<String, Object>> findAll(Integer page, Integer pageSize, String currentPage) {
        return currentPage.equals("ningbo") ? dataMapper.selectNingBo(page, pageSize) : dataMapper.selectShangHai(page, pageSize);
    }

    @Override
    public DataUnit findById(Integer id, String currentPage) {
        return currentPage.equals("ningbo") ? dataMapper.findByIdNingBo(id) : dataMapper.findByIdShangHai(id);
    }
}
