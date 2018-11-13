package com.example.demo.service.impl;

import com.example.demo.mapper.CRUDMapper;
import com.example.demo.service.DbcenterSequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbcenterSequenceImpl implements DbcenterSequenceService {

    @Override
    public String getOne() {
        return "成功";
    }


    @Autowired
    private CRUDMapper mapper;
}
