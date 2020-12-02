package com.company.project.convert;

/**
 * @author wangtao
 * @date 2020/12/2 13:50
 * @desc
 */
public interface DTOConvert<S,T> {
    T convert(S s);
}
