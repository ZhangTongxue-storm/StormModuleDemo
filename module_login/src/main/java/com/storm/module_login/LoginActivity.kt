package com.storm.module_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.storm.module_login.databinding.ActivityLoginBinding

@Route(path = "/module_login/Login")
public  class LoginActivity : AppCompatActivity() {

    lateinit var mBinding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(mBinding.root)


    }
}