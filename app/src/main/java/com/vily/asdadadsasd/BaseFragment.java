package com.vily.asdadadsasd;



import android.content.Context;

import android.os.Bundle;
import android.support.v4.app.Fragment;


public class BaseFragment extends Fragment {

    public Context context;
    public String TAG;
    public MainActivity activity;


    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
        TAG = getClass().getSimpleName();

//
//
//        if (ActivityCompat.checkSelfPermission(context, (Manifest.permission.WRITE_EXTERNAL_STORAGE)) == PackageManager.PERMISSION_DENIED) {
//            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 10);
//        }
//
//        if (ActivityCompat.checkSelfPermission(context, (Manifest.permission.CAMERA)) == PackageManager.PERMISSION_DENIED) {
//            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CAMERA}, 20);
//        }
    }



}
