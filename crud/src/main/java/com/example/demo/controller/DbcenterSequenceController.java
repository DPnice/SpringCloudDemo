package com.example.demo.controller;

import com.example.demo.entity.DbcenterSequence;
import com.example.demo.mapper.CRUDMapper;
import com.example.demo.service.DbcenterSequenceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "crud模块", tags = "crud")
public class DbcenterSequenceController {
    @Autowired
    private DbcenterSequenceService dbcenterSequenceService;
    @Autowired
    private CRUDMapper mapper;

    @RequestMapping(value = "/get/all", method = RequestMethod.POST)
    @ApiOperation(value = "getAll", produces = "application/json")
    public List<DbcenterSequence> getAllData(@RequestParam int page, @RequestParam int size) {
        return mapper.getAllDbcenterSequence(page, size);
    }

    @RequestMapping(value = "/get/one", method = RequestMethod.GET)
    public String getUser() {
        return dbcenterSequenceService.getOne();
    }

    @RequestMapping(value = "/insert/data", method = RequestMethod.POST)
    @ApiOperation(value = "insertData")
    public DbcenterSequence insertData(@RequestBody DbcenterSequence ds) {
        int i = mapper.insertData(ds);
        if (i == 1) {
            return ds;
        } else {
            return null;
        }
    }

    @RequestMapping(value = "/update/data", method = RequestMethod.POST)
    @ApiOperation(value = "updateData")
    public DbcenterSequence updateData(@RequestBody DbcenterSequence ds) {
        int i = mapper.updateData(ds);
        if (i == 1) {
            return ds;
        } else {
            return null;
        }
    }

    @RequestMapping(value = "/delete/data", method = RequestMethod.POST)
    @ApiOperation(value = "deleteData")
    public String deleteData(@RequestParam(name = "UUID") String UUID) {
        logger.debug("/delete/data: {}", UUID);
        int i;
        try {
            i = mapper.deleteData(UUID);
        } catch (Exception e) {
            return "失败";
        }
        if (i == 1) {
            return "成功";
        } else {
            return "失败";
        }
    }

    @RequestMapping(value = "/search/desc", method = RequestMethod.POST)
    @ApiOperation(value = "searchDesc")
    public DbcenterSequence searchDesc(@RequestParam(name = "desc") String desc) {
        logger.debug("/search/desc: {}", desc);
        DbcenterSequence ds;
        try {
            ds = mapper.searchDesc(desc);
            return ds;
        } catch (Exception e) {
            return null;
        }
    }

    private static final Logger logger = LoggerFactory.getLogger(DbcenterSequenceController.class);
}
