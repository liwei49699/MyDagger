package com.sanshang.li.mydagger.mydagger;

import com.sanshang.li.mydagger.MainActivity;

import dagger.Module;

/**
 * Created by li on 2018/5/21.
 * WeChat 18571658038
 * author LiWei
 */

@Module
public class MainActivityModle {

    private MainActivity mActivity;

    public MainActivityModle(MainActivity activity) {
        mActivity = activity;
    }
}
