package com.getupmina.android.jubgging

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.getupmina.android.jubgging.databinding.ActivitySignupAccountBinding

class SignUpAccountActivity:AppCompatActivity() {
    private lateinit var binding:ActivitySignupAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_signup_account)
    }
}