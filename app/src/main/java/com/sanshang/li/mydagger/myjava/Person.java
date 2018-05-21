package com.sanshang.li.mydagger.myjava;

/**
 * Created by li on 2018/5/21.
 * WeChat 18571658038
 * author LiWei
 */

public class Person {

    private Tool mTool;

    public Person(Tool tool) {
        mTool = tool;
    }

    public void userTool(){

        mTool.myUser();
    }
}
