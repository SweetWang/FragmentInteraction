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
public class Fragment202 extends Fragment {

    MainActivity.MyCallback mcb = null;
    private static TextView frg202_tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frg202_layout, container, false);
        frg202_tv = (TextView) view.findViewById(R.id.frg202_tv);
        return view;

    }

    public void setCallback(MainActivity.MyCallback mcb) {
        this.mcb = mcb;
    }

    public void postParam() {
        this.mcb.callback("你们好我是fragment202,你是谁？");
        frg202_tv.setText("");
    }

    public void showParam(String s) {
        System.out.println("fragment202收到信息：" + s);
        frg202_tv.setText(s);

    }
}
