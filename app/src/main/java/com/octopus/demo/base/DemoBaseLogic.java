package com.octopus.demo.base;

/**
 * @author octopus
 * @version [AndroidProjectLib, 2019-03-07]
 */
public class DemoBaseLogic extends com.common.framework.logic.BaseLogic {
    /**
     * 构造函数
     *
     * @param subscriber 最终订阅者
     */
    public DemoBaseLogic(Object subscriber) {
        super(subscriber);
    }

    @Override
    protected String getBaseUrl() {
        return "http://10.100.122.34:3000";
    }
}
