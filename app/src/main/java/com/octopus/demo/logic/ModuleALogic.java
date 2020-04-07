package com.octopus.demo.logic;

import com.octopus.R;
import com.octopus.demo.api.ModuleAApi;
import com.octopus.demo.base.DemoBaseLogic;


/**
 * @author octopus
 * @version [AndroidProjectLib, 2019-03-07]
 */
public class ModuleALogic extends DemoBaseLogic {
    ModuleAApi api;
    /**
     * 构造函数
     *
     * @param subscriber 最终订阅者
     */
    public ModuleALogic(Object subscriber) {
        super(subscriber);
        api = create(ModuleAApi.class);
    }
    
    public void categoryList() {
        sendRequest(api.categoryList(), R.id.demo_id);
    }
}
