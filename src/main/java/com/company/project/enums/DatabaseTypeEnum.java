package com.company.project.enums;

/**
 * @author wangtao
 * @date 2020/11/15 19:21
 * @desc
 */
public enum DatabaseTypeEnum {
    PRIMARY("1"), USER("2");

    private String code;

    DatabaseTypeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static DatabaseTypeEnum getDatabaseTypeEnum(String code) {
        for (DatabaseTypeEnum databaseTypeEnum : DatabaseTypeEnum.values()) {
            if (databaseTypeEnum.getCode().equals(code)) {
                return databaseTypeEnum;
            }
        }
        return null;
    }
}
