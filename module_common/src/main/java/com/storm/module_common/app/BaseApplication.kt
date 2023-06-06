package com.storm.module_common.app

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter

public class BaseApplication : Application() {


    companion object {
        val TAG = "MyApplication";

        lateinit var appContext: Context;

    }

    override fun onCreate() {
        super.onCreate()
        appContext = this

        initARouter()

    }

    private fun initARouter() {

        if (BuildConfig.DEBUG){
            ARouter.openLog()
            ARouter.openDebug()
            ARouter.printStackTrace();
        }

        ARouter.init(this)

    }


}