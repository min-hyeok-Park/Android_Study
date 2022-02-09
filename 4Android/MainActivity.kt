package com.mhpark.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mhpark.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("여말잘 여자말을 잘 듣자.")
        sentenceList.add("어머니 말을 들으면 자다가도 떡이 생긴다.")
        sentenceList.add("어흥")
        sentenceList.add("지아 말을 잘 들어라.")


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {

            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)

        }

        binding.goodWordTextArea.setText(sentenceList.random())

    }
}