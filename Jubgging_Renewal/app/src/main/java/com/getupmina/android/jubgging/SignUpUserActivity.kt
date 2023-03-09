package com.getupmina.android.jubgging

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.getupmina.android.jubgging.databinding.ActivitySignupUserBinding

class SignUpUserActivity:AppCompatActivity() {
    private lateinit var binding:ActivitySignupUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_signup_user)

    }
}