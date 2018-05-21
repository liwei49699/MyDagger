package com.sanshang.li.mydagger.myjava;

import android.util.Log;

/**
 * Created by li on 2018/5/21.
 * WeChat 18571658038
 * author LiWei
 */

public class Tool {

    private String mName;

    public Tool(String name) {

        mName = name;
    }

    public void myUser(){

        Log.d("--TAG--", "Tool myUser()" + mName);
    }
}
