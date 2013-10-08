package com.example.fragmentsapp;
//import android.app.Activity;
import android.os.Bundle;
//import android.app.FragmentTransaction;
import android.view.View;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
public class MyActivity extends FragmentActivity {

    Fragment1 MountainFragm;
    Fragment2 LakeFragm;
    Fragment3 DepthFragm;
   // FragmentTransaction MyTrans;
    FragmentTransaction MyTrans;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        MountainFragm = new Fragment1();
        LakeFragm = new Fragment2();
        DepthFragm =new Fragment3();
                      }

    public void onClick(View v) {
       // MyTrans = getFragmentManager().beginTransaction();
        MyTrans=getSupportFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.butnMountain:
                MyTrans.replace(R.id.frgmCont, MountainFragm);

                break;
            case R.id.btnLake:
                MyTrans.replace(R.id.frgmCont, LakeFragm);
                break;
            case R.id.btnDepth:
                MyTrans.replace(R.id.frgmCont, DepthFragm);
            default:
                break;
        }

        MyTrans.commit();
    }
}