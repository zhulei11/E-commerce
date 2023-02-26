package com.zhulei.ecommerce.service.impl;

import com.zhulei.ecommerce.entity.RecordModel;
import com.zhulei.ecommerce.entity.WalletModel;
import com.zhulei.ecommerce.mapper.RecordMapper;
import com.zhulei.ecommerce.mapper.WalletMapper;
import com.zhulei.ecommerce.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ZhuLei
 * @datetime 2023/2/16 17:55
 */
@Service
public class WalletServiceImpl implements WalletService {
    @Autowired
    private WalletMapper walletMapper;

    @Autowired
    private RecordServiceImpl recordService;

    public Double getBalanceByAdId(Long userId) {
        return walletMapper.getBalanceByUserId(userId);
    }

    public void updateRefundOrSpend(Double RefundOrSpend,Long userId,Long walletId,String orderNum,Integer transactionType){
        WalletModel wallet = new WalletModel();
        RecordModel record = new RecordModel();
        Date date = new Date();
        Double Balance = walletMapper.getBalanceByUserId(userId) + RefundOrSpend;
        wallet.setWalletId(walletId);
        wallet.setUserId(userId);
        wallet.setBalance(Balance);
        wallet.setLastUpdatedBy(userId);
        wallet.setLastUpdatedDate(date);
        record.setRecordId(recordService.nextRecordId());
        record.setWalletId(walletId);
        record.setFee(RefundOrSpend);
        record.setOrderNum(orderNum);
        record.setTransactionType(transactionType);
        record.setCreatedBy(userId);
        record.setCreatedDate(date);
        walletMapper.updateBalance(wallet);
        recordService.addRecord(record);
    }
}
