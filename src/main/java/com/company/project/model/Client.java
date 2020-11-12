package com.company.project.model;

import io.swagger.models.auth.In;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * @author wangtao
 * @date 2020/11/11 13:48
 * @desc
 */
@Data
public class Client {
    private BigInteger ClientId;
    private String ClientName;
    private Integer ClientAge;
    private BigDecimal ClientDefaultPrice;
    private Timestamp CreateTime;
    private Timestamp UpdateTime;
    private BigInteger CompanyId;
    private Boolean Delete;
    private Company Company;
}
