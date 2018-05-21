package com.sanshang.li.mydagger.MyDagger2;

import com.sanshang.li.mydagger.MainActivity;
import com.sanshang.li.mydagger.mydagger.MainActivityModle;

import dagger.Component;

/**
 * Created by li on 2018/5/21.
 * WeChat 18571658038
 * author LiWei
 */

@Component(modules = MainActivity2Modle.class)
public interface MainActivity2Component {

    void inject(MainActivity activity);
}
