package com.zhulei.ecommerce.service;

import com.zhulei.ecommerce.entity.WalletModel;

import java.text.ParseException;
import java.util.List;

/**
 * @author ZhuLei
 * @datetime 2023/2/16 17:54
 */
public interface WalletService {
    public Double getBalanceByAdId(Long userId);
    public void updateRefundOrSpend(Double RefundOrSpend,Long userId,Long walletId,String orderNum,Integer transactionType) throws ParseException;
//    public void updateSpend(Double spend,Long walletId,Long userId)throws ParseException;
}
