package com.zhulei.ecommerce.service.impl;

import com.zhulei.ecommerce.entity.RecordModel;
import com.zhulei.ecommerce.entity.WalletModel;
import com.zhulei.ecommerce.mapper.RecordMapper;
import com.zhulei.ecommerce.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author ZhuLei
 * @datetime 2023/2/16 21:32
 */
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordMapper recordMapper;

    public List<RecordModel> getsRecord(Long walletId){
        return recordMapper.getsRecord(walletId);
    }

    public void addRecord(RecordModel recordModel){
        recordMapper.addRecord(recordModel);
    }
    public Long nextRecordId(){
        return recordMapper.nextRecordId();
    }
}