package com.zhulei.ecommerce.mapper;

import com.zhulei.ecommerce.entity.WalletModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ZhuLei
 * @datetime 2023/2/16 17:37
 */
@Mapper
public interface WalletMapper {
    public Double getBalanceByUserId(Long userId);
    public void updateBalance(WalletModel wallet);
}
