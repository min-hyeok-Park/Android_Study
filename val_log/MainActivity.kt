package com.mhpark.val_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value = "여기는 value 입니다!"
        var value2 = "여기는 value2 입니다!"

        // value = "여기는 value 입니다!" -> val은 선언을 한 뒤, 값을 바꾸려고 하면 에러 등장.
        // 반면에 var은 에러가 나지 않는다.
        value2 = "나는 바꿀 수 있지롱~"

        // 이런 식으로 로그를 찍어서 볼 수 있음.
        Log.d("MainActivity", value)
        Log.d("MainActivity", "적어보자잉")

        // 로그 종류 5가지 정도
        Log.e("MainActivity", value) // 오류
        Log.w("MainActivity", value) // 경고
        Log.i("MainActivity", value) // 정보
        Log.d("MainActivity", value) // 디버그
        Log.v("MainActivity", value) // 상세
    }
}