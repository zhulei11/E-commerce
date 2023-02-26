package com.zhulei.ecommerce.enums;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @author ZhuLei
 * @datetime 2023/2/18 12:45
 */
public enum TransactionTypeEnum {

    RECHARGE_MONET(1,"充钱"),

    CASH_WITHDRAWAL(2,"提现"),

    BUY(3,"购买"),

    RETURN_GOODS(4,"退货");


    private Integer code;

    private String type;

    TransactionTypeEnum(Integer code, String type) {
        this.code = code;
        this.type = type;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
