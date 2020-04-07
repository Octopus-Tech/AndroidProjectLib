package com.common.framework.ui.adapter.recyclerview;

import java.util.List;

/**
 * Adapter Interface
 *
 * @author zhangyang5547662@126.com
 * @version [AndroidProjectLib, 2019-3-6]
 */
public interface IAdapter<T> {

    void setDataSource(List<T> data);

    List<T> getDataSource();

    T getItem(int position);
}
