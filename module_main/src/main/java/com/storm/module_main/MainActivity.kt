package com.storm.module_main

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import com.alibaba.android.arouter.launcher.ARouter
import com.storm.module_main.common.ARouterContract
import com.storm.module_main.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = "MainActivity"
    }

    lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setUpListener();

    }

    private fun setUpListener() {

        mBinding.btnLogin.setOnClickListener {

            ARouter.getInstance().build(ARouterContract.login).navigation();
        }
    }
}