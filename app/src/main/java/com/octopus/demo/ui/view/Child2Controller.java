package com.octopus.demo.ui.view;

import com.common.framework.ui.activity.view.AppDelegate;
import com.common.framework.ui.activity.view.ViewController;
import com.octopus.R;

/**
 * @author octopus
 * @version 2019/1/23
 */
public class Child2Controller extends ViewController {

    public Child2Controller(AppDelegate appDelegate, int parentId) {
        super(appDelegate, parentId);
    }

    @Override
    public int getView() {
        return R.layout.view_child2;
    }
}
