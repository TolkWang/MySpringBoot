package com.company.project.codeReview.handler2;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @author wangtao
 * @date 2020/11/30 13:24
 * @desc
 */
public class TestFactory2 {
    private static Map<String, AbstractHandler> strategyMap = Maps.newHashMap();

    public static AbstractHandler getInvokeStrategy(String name) {
        return strategyMap.get(name);
    }

    public static void register(String name, AbstractHandler handler) {
        if(StringUtils.isEmpty(name) || null == handler) {
            return;
        }
        strategyMap.put(name, handler);
    }
}
