package com.zhulei.ecommerce.mapper;

import com.zhulei.ecommerce.entity.RecordModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ZhuLei
 * @datetime 2023/2/16 21:31
 */
@Mapper
public interface RecordMapper {
    public List<RecordModel> getsRecord(Long walletId);
    public void addRecord(RecordModel recordModel);
    public Long nextRecordId();
}
