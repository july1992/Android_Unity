package com.vily.asdadadsasd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2019/4/12
 *  
 **/

public class BBBFragment extends BaseFragment {

    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_2, null);
        return view;
    }
}
