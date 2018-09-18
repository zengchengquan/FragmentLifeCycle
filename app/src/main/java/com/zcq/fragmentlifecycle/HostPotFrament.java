package com.zcq.fragmentlifecycle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2018/9/18 0018.
 */

public class HostPotFrament extends Fragment{

    @Override
    public void onAttach(Context context) {
        Log.i("Fragment","-------Fragment----onAttach--------");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i("Fragment","-------Fragment----onCreate--------");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("Fragment","-------Fragment----onCreateView--------");
        View view = inflater.inflate(R.layout.fragment_hostpot,null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.i("Fragment","-------Fragment----onActivityCreated--------");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i("Fragment","-------Fragment----onStart--------");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("Fragment","-------Fragment----onResume--------");
        super.onResume();
    }



    @Override
    public void onPause() {
        Log.i("Fragment","-------Fragment----onPause--------");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("Fragment","-------Fragment----onStop--------");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("Fragment","-------Fragment----onDestroyView--------");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("Fragment","-------Fragment----onDestroy--------");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("Fragment","-------Fragment----onDetach--------");
        super.onDetach();
    }
}
