package com.common.framework.ui.adapter.page;

/**
 * 分页策略1: pageIndex, pageSize
 *
 * @author zhangyang5547662@126.com
 * @version [AndroidProjectLib, 2019-3-6]
 */
public abstract class Page1 extends IPage {
    @Override
    public int handlePageIndex(int currPageIndex, int pageSize) {
        return ++currPageIndex;
    }

    @Override
    protected int handlePage(int currPageIndex, int pageSize) {
        return pageSize;
    }
}
