package com.common.framework.ui.adapter.recyclerview;

import android.support.annotation.LayoutRes;

/**
 * 多样式支持
 *
 * @author zhangyang5547662@126.com
 * @version [AndroidProjectLib, 2019-3-6]
 */
public abstract class MultiTypeSupport<T> {
    /**
     * 根据itemType返回不同布局
     *
     * @param itemType
     * @return
     */
    @LayoutRes
    public abstract int getLayoutId(int itemType);

    /**
     * 返回不同itemType
     *
     * @param item
     * @param position
     * @return
     */
    public abstract int getItemViewType(T item, int position);
}
