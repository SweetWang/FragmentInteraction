package com.via.fragmentinteraction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment101 fragment101;
    private Fragment102 fragment102;
    private Fragment201 fragment201;
    private Fragment202 fragment202;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.frg1_bt:
                fragment1.postParam();
                break;
            case R.id.frg2_bt:
                fragment2.postParam();
                break;
            case R.id.frg101_bt:
                fragment101.postParam();
                break;
            case R.id.frg102_bt:
                fragment102.postParam();
                break;
            case R.id.frg201_bt:
                fragment201.postParam();
                break;
            case R.id.frg202_bt:
                fragment202.postParam();
                break;

        }
    }

    public interface MyCallback {
        void callback(String param);
    }

    private void initData() {


        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment101 = new Fragment101();
        fragment102 = new Fragment102();
        fragment201 = new Fragment201();
        fragment202 = new Fragment202();

        fragment1.setCallback(new MyCallback() {

            @Override
            public void callback(String param) {
                fragment2.showParam(param);
                fragment101.showParam(param);
                fragment102.showParam(param);
                fragment201.showParam(param);
                fragment202.showParam(param);
            }
        });
        fragment2.setCallback(new MyCallback() {

            @Override
            public void callback(String param) {
                fragment1.showParam(param);
                fragment101.showParam(param);
                fragment102.showParam(param);
                fragment201.showParam(param);
                fragment202.showParam(param);
            }
        });
        fragment101.setCallback(new MyCallback() {

            @Override
            public void callback(String param) {
                fragment1.showParam(param);
                fragment2.showParam(param);
                fragment102.showParam(param);
                fragment201.showParam(param);
                fragment202.showParam(param);
            }
        });
        fragment102.setCallback(new MyCallback() {

            @Override
            public void callback(String param) {
                fragment1.showParam(param);
                fragment101.showParam(param);
                fragment2.showParam(param);
                fragment201.showParam(param);
                fragment202.showParam(param);
            }
        });
        fragment201.setCallback(new MyCallback() {

            @Override
            public void callback(String param) {
                fragment1.showParam(param);
                fragment101.showParam(param);
                fragment102.showParam(param);
                fragment2.showParam(param);
                fragment202.showParam(param);
            }
        });
        fragment202.setCallback(new MyCallback() {

            @Override
            public void callback(String param) {
                fragment1.showParam(param);
                fragment101.showParam(param);
                fragment102.showParam(param);
                fragment201.showParam(param);
                fragment2.showParam(param);
            }
        });


        Button frg1_bt = (Button) findViewById(R.id.frg1_bt);
        Button frg2_bt = (Button) findViewById(R.id.frg2_bt);
        Button frg101_bt = (Button) findViewById(R.id.frg101_bt);
        Button frg102_bt = (Button) findViewById(R.id.frg102_bt);
        Button frg201_bt = (Button) findViewById(R.id.frg201_bt);
        Button frg202_bt = (Button) findViewById(R.id.frg202_bt);
        if (frg1_bt != null) {
            frg1_bt.setOnClickListener(this);
        }
        if (frg2_bt != null) {
            frg2_bt.setOnClickListener(this);
        }
        if (frg101_bt != null) {
            frg101_bt.setOnClickListener(this);
        }
        if (frg102_bt != null) {
            frg102_bt.setOnClickListener(this);
        }
        if (frg201_bt != null) {
            frg201_bt.setOnClickListener(this);
        }
        if (frg202_bt != null) {
            frg202_bt.setOnClickListener(this);
        }

    }
}
