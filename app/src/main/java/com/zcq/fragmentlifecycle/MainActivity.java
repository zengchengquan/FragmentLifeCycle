package com.zcq.fragmentlifecycle;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_hostpot,tv_topline;
    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Fragment","-------Activity----onCreat--------");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        tv_hostpot = (TextView)findViewById(R.id.host_pot);
        tv_topline = (TextView)findViewById(R.id.top_line);

        tv_hostpot.setOnClickListener(this);
        tv_topline.setOnClickListener(this);

        manager=getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.add(R.id.content_layout,new HostPotFrament());
        transaction.commit();

    }


    @Override
    public void onClick(View v) {
        transaction = manager.beginTransaction();
        switch (v.getId()){
            case R.id.host_pot:
                transaction.replace(R.id.content_layout,new HostPotFrament());
                break;
            case R.id.top_line:
                transaction.replace(R.id.content_layout,new TopLineFragment());
                break;
        }
        transaction.commit();
    }

    @Override
    protected void onStart() {
        Log.i("Fragment","-------Activity----onStart--------");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.i("Fragment","-------Activity----onRestart--------");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.i("Fragment","-------Activity----onPause--------");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("Fragment","-------Activity----onStop--------");
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.i("Fragment","-------Activity----onResume--------");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.i("Fragment","-------Activity----onDestroy--------");
        super.onDestroy();
    }


}
