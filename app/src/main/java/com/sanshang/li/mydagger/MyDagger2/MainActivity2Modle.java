package com.sanshang.li.mydagger.MyDagger2;

import com.sanshang.li.mydagger.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by li on 2018/5/21.
 * WeChat 18571658038
 * author LiWei
 */

@Module
public class MainActivity2Modle {

    private MainActivity mActivity;

    public MainActivity2Modle(MainActivity activity) {
        mActivity = activity;
    }

    @Provides
    Student2 provideStudent2(){

        return new Student2();
    }
}
