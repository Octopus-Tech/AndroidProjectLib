package com.octopus.demo.ui.view;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import com.common.framework.ui.activity.view.AppDelegate;
import com.common.framework.ui.activity.view.ViewController;
import com.octopus.R;

/**
 * @author octopus
 * @version 2019/1/23
 */
public class Child1Controller extends ViewController {
    @BindView(R.id.text)
    TextView text;

    public Child1Controller(AppDelegate appDelegate, int parentId) {
        super(appDelegate, parentId);
    }

    @Override
    public int getView() {
        return R.layout.view_child1;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        text.setText("Child1");
        setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }, R.id.text);
    }
}
