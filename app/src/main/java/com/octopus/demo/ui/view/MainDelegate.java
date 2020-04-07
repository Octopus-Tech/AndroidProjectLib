package com.octopus.demo.ui.view;

import android.content.Intent;

import com.octopus.R;
import com.octopus.demo.base.CommonTitleBarDelegate;


/**
 * @author octopus
 * @version [AndroidProjectLib, 2019-03-07]
 */
public class MainDelegate extends CommonTitleBarDelegate {
    Child1Controller child1;

    @Override
    public int getContentLayoutId() {
        return R.layout.demo_activity_main;
    }

    @Override
    public void initWidget(Intent intent) {
        super.initWidget(intent);
        // 拆分多个子View
        child1 = new Child1Controller(this, R.id.group1);
        Child2Controller child2 = new Child2Controller(this, R.id.group1);
    }
}
