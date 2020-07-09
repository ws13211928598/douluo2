package com.example.douluo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)//                去除+
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)//  状态栏
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            //val suijishu = (0..3).random()
            val list = mutableListOf("蓝银草","柔骨兔","白虎","七宝琉璃塔","猫","凤凰","食神")
            list.shuffled().take(1).forEach{
               // val huili =(0..10).random()
                this.textView.text = it
                val huili2 =(0..10).random()
                val zhanli = huili2*10
                this.textView2.setText(" 魂力等级：$huili2 \nzhanli: $zhanli")

            }
            //textView.setText("$suijishu")
        }
    }

}
