package com.minifly.adaptation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mAdaptationTextScreenTxt;
    private TextView mAdaptationShowMsgTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mAdaptationTextScreenTxt = (TextView) findViewById(R.id.adaptation_text_screen_txt);
        mAdaptationShowMsgTxt = (TextView) findViewById(R.id.adaptation_show_msg_txt);

        mAdaptationTextScreenTxt.setText("屏幕宽高： " + DensityUtils.getScreenWidth(this) + "  " +
                "" + DensityUtils.getScreenHeight(this)
        );

        mAdaptationShowMsgTxt.setText("" + getResources().getString(R.string.app_name));
    }
}
