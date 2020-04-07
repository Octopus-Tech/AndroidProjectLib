package com.octopus.demo.ui;

import com.octopus.demo.R;
import com.octopus.demo.base.BaseActivity;
import com.octopus.demo.logic.ModuleALogic;
import com.octopus.demo.ui.view.MainDelegate;
import android.view.View;


/**
 * @author octopus
 * @version [AndroidProjectLib, 2019-03-07]
 */
public class MainActivity extends BaseActivity<MainDelegate> {
    @Override
    protected Class getDelegateClass() {
        return MainDelegate.class;
    }

    @Override
    protected void onCreate() {
        super.onCreate();

        final ModuleALogic logic = findLogic(new ModuleALogic(this));

        viewDelegate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logic.categoryList();
            }
        }, R.id.btn);

    }

    @Override
    protected void onSuccess(int requestId, Object response, String responseCode) {
        super.onSuccess(requestId, response, responseCode);
        if (requestId == R.id.demo_id) {
        }
    }

    @Override
    protected void onFailure(int requestId, Object response, String responseCode, String errmsg) {
        super.onFailure(requestId, response, responseCode, errmsg);
        if (requestId == R.id.demo_id) {
        }
    }
}
