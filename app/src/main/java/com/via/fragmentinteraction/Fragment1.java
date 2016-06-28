package com.via.fragmentinteraction;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ${SweetWang} on 6/23/2016.
 * 衣带渐宽终不悔，为伊消得人憔悴。
 */
public class Fragment1 extends Fragment {

    MainActivity.MyCallback mcb = null;
    private static TextView frg1_tv;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frg1_layout, container, false);
        frg1_tv = (TextView) view.findViewById(R.id.frg1_tv);
        return view;
    }


    public void setCallback(MainActivity.MyCallback mcb) {
        this.mcb = mcb;
    }

    public void postParam() {
        this.mcb.callback("你好我是fragment1,你是谁？");
        frg1_tv.setText("");
    }

    public void showParam(String s) {
        System.out.println("fragment1收到信息：" + s);
        frg1_tv.setText(s);
    }
}
