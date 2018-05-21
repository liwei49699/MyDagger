package com.sanshang.li.mydagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.sanshang.li.mydagger.MyDagger2.DaggerMainActivity2Component;
import com.sanshang.li.mydagger.MyDagger2.MainActivity2Modle;
import com.sanshang.li.mydagger.mydagger.DaggerMainActivityComponent;
import com.sanshang.li.mydagger.mydagger.MainActivityModle;
import com.sanshang.li.mydagger.mydagger.Student;
import com.sanshang.li.mydagger.myjava.Person;
import com.sanshang.li.mydagger.myjava.Tool;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Student mStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tool tool = new Tool("工具1");
        Person person = new Person(tool);
        person.userTool();


    }

    public void getStudent(View view) {

//        DaggerMainActivityComponent.builder()
////                .mainActivityModle(new MainActivityModle(this))
//                .build()
//                .inject(this);

        DaggerMainActivity2Component.builder()
//                .mainActivity2Modle(new MainActivity2Modle(this))
                .build()
                .inject(this);


        Log.d("--TAG--", "MainActivity getStudent()" + mStudent);
    }
}
