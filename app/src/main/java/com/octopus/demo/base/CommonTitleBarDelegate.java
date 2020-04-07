package com.octopus.demo.base;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.common.framework.ui.activity.view.AppDelegate;
import com.common.framework.ui.widget.AbstractLoadHelper;
import com.octopus.R;


/**
 * 全局统一标题栏
 *
 * @author octopus
 * @version [AndroidProjectLib, 2019-03-07]
 */
public abstract class CommonTitleBarDelegate extends AppDelegate {

    @Override
    public View getTitleView(ViewGroup root) {
        return LayoutInflater.from(getActivity()).inflate(R.layout.layout_common_title, root);
    }

    @Override
    public void initWidget() {
        super.initWidget();
        setCommonTitleColor(Color.parseColor("#ffffff"));
        setLightMode(getActivity());
    }

    @Override
    protected AbstractLoadHelper getLoadViewHelper(View view) {
        return null;
    }
}
