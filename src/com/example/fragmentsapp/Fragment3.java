package com.example.fragmentsapp;

/**
 * Created with IntelliJ IDEA.
 * User: Ruslik
 * Date: 08.10.13
 * Time: 22:52
 * To change this template use File | Settings | File Templates.
 */
import android.app.Activity;
//import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

public class Fragment3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment3, null);
    }
}