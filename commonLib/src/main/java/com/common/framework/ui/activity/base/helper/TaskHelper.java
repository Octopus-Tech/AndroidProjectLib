package com.common.framework.ui.activity.base.helper;

import com.common.framework.task.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Task帮助类
 *
 * @author zhangyang5547662@126.com
 * @version [AndroidProjectLib, 2019-3-6]
 */
public class TaskHelper {
    private List<Task> tasks = new ArrayList<Task>();

    /**
     * 注册Task, Activity销毁时是自动取消解绑
     *
     * @param task
     * @param <T>
     * @return
     */
    public <T extends Task> T findTask(Task task) {
        tasks.add(task);
        return (T) task;
    }

    /**
     * 解绑当前订阅者
     *
     * @param tasks
     */
    public void unregister(Task... tasks) {
        for (Task task : tasks) {
            if (task != null) {
                task.unregister();
            }
        }
    }

    /**
     * 解绑所有订阅者
     */
    public void unregisterAll() {
        for (Task task : tasks) {
            unregister(task);
        }
    }
}
