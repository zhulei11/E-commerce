package com.zhulei.ecommerce.service;

import com.zhulei.ecommerce.entity.RecordModel;

import java.util.List;

/**
 * @author ZhuLei
 * @datetime 2023/2/16 21:31
 */
public interface RecordService {
    public List<RecordModel> getsRecord(Long walletId);
    public void addRecord(RecordModel recordModel);
    public Long nextRecordId();
}
