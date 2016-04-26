package com.example.viewstub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;

public class UserActivity extends AppCompatActivity {

    private ViewStub mViewStub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        mViewStub = (ViewStub) findViewById(R.id.stub);

        findViewById(R.id.imageview_avatar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewStub.inflate();
            }
        });
    }
}
