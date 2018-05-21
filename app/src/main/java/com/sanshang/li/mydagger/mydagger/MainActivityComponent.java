package com.sanshang.li.mydagger.mydagger;

import com.sanshang.li.mydagger.MainActivity;

import dagger.Component;

/**
 * Created by li on 2018/5/21.
 * WeChat 18571658038
 * author LiWei
 */

@Component(modules = MainActivityModle.class)
public interface MainActivityComponent {

    void inject(MainActivity activity);
}
