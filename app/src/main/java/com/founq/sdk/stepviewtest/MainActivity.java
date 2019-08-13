package com.founq.sdk.stepviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.founq.sdk.stepviewtest.widget.StepView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private StepView mStepView;

    private List<String> mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStepView = findViewById(R.id.step_view);
        mText = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            mText.add("第"+i+"个123456789");
        }
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_click:
                mStepView.setText(mText, 12);
                break;
        }
    }
}
