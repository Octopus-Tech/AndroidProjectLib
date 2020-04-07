package com.common.framework.task;

/**
 * 任务接口定义
 *
 * @author zhangyang5547662@126.com
 * @version [AndroidProjectLib, 2019-3-6]
 */
public interface ITask {
    /**
     * 执行耗时任务
     *
     * @return
     */
    Object doInBackground();
}
