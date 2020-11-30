package com.company.project.codeReview.handler;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author wangtao
 * @date 2020/11/30 13:02
 * @desc 工厂模式
 */
public class TestFactory {
    private static Map<String,Handler> strategyMap = Maps.newHashMap();

    public static Handler getInvokeStrategy(String name) {
        return strategyMap.get(name);
    }

    public static void register(String name, Handler handler) {
        if(StringUtils.isEmpty(name) || null == handler) {
            return;
        }
        strategyMap.put(name, handler);
    }
}
