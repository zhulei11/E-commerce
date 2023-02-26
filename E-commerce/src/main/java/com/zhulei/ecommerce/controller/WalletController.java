package com.zhulei.ecommerce.controller;

import com.zhulei.ecommerce.entity.RecordModel;
import com.zhulei.ecommerce.service.impl.WalletServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhuLei
 * @datetime 2023/2/16 17:56
 */
@RestController
@RequestMapping("wallet")
public class WalletController {
    @Autowired
    private WalletServiceImpl walletService;

    @PostMapping("balance")
    public Double getBalance(@RequestParam("userId") Long userId){
        return walletService.getBalanceByAdId(userId);
    }

    @PostMapping("update")
    public void updateRefundOrSpend(@RequestParam("refundOrSpend") Double refundOrSpend,
                                    @RequestParam("userId") Long userId,
                                    @RequestParam("walletId") Long walletId,
                                    @RequestParam("orderNum") String orderNum,
                                    @RequestParam("transactionType") Integer transactionType){
        walletService.updateRefundOrSpend(refundOrSpend,userId,walletId,orderNum,transactionType);
    }

}
