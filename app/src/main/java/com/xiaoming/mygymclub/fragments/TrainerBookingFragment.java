package com.xiaoming.mygymclub.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.xiaoming.mygymclub.R;
import com.xiaoming.mygymclub.activities.IntroductionActivity;

public class TrainerBookingFragment extends BaseMainFragment {
    LinearLayout teacher1;

    public TrainerBookingFragment(){}

    public static TrainerBookingFragment newInstance(){
        TrainerBookingFragment fragment = new TrainerBookingFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_teachers, container, false);

        teacher1 = v.findViewById(R.id.teacher1);
        teacher1.setOnClickListener(v1 -> {
            Intent intent = new Intent(getActivity(), IntroductionActivity.class);
            startActivity(intent);
//            getActivity().getActionBar().setTitle(R.string.information_title);
        });
        return v;
    }
}
