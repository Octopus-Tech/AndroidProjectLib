package com.common.framework.logic;

import android.os.Message;

/**
 * 业务层回调接口
 *
 * @author octopus
 * @version [AndroidProjectLib, 2019-04-30]
 */
public interface LogicCallback {
    /**
     * {@link Message#what} 区分业务Id，{@link Message#obj} 保存业务数据
     *
     * @param msg
     */
    void call(Message msg);
}
