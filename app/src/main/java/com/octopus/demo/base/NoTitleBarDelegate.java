package com.octopus.demo.base;

import android.view.View;
import android.view.ViewGroup;

import com.common.framework.ui.activity.view.AppDelegate;


/**
 * 不带标题栏
 *
 * @author octopus
 * @version [AndroidProjectLib, 2019-03-07]
 */
public abstract class NoTitleBarDelegate extends AppDelegate {
    @Override
    public View getTitleView(ViewGroup root) {
        return null;
    }
}
