package com.company.project.model;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author wangtao
 * @date 2020/11/11 13:44
 * @desc
 */
@Data
public class Company {
    private BigInteger CompanyId;
    private String CompanyName;
    private String CompanyAddress;
    private Timestamp CreateTime;
    private Timestamp UpdateTime;
}
