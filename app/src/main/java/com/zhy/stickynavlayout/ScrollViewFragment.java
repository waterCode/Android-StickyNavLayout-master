package com.zhy.stickynavlayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lao.zhong on 2018/2/27.
 */

public class ScrollViewFragment extends Fragment {
    public static final String CONTENT = "content";

    private String mContent;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            mContent = getArguments().getString(CONTENT);
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.inflate(R.layout.fragment_article,container,false);
        return inflater.inflate(R.layout.fragment_article,container,false);
    }

    public static ScrollViewFragment newInstance(String content) {

        Bundle args = new Bundle();
        args.putString(CONTENT,content);
        ScrollViewFragment fragment = new ScrollViewFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
