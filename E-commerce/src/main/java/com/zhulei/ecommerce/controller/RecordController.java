package com.zhulei.ecommerce.controller;

import com.zhulei.ecommerce.entity.RecordModel;
import com.zhulei.ecommerce.service.impl.RecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZhuLei
 * @datetime 2023/2/19 9:51
 */
@RestController
@RequestMapping("record")
public class RecordController {
    @Autowired
    private RecordServiceImpl recordService;

    @PostMapping("getsRecord")
    public List<RecordModel> getsRecord(@RequestParam("userId") Long userId){
        return recordService.getsRecord(userId);
    }
}
