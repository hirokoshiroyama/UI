package com.example.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.Long4
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            textView.text = editText.text.toString()
        } else if (v.id == R.id.button2) {
            showAlertDialog()
        }
    }

    private fun showAlertDialog(){
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("タイトル")
        alertDialogBuilder.setMessage("メッセージ")

        alertDialogBuilder.setPositiveButton("肯定"){dialog, which ->
            Log.d("UI_PARTS","肯定ボタン")
        }

        alertDialogBuilder.setNeutralButton("中立"){_,_->
            Log.d("UT_PARTS","中立ボタン")
        }

        alertDialogBuilder.setNegativeButton("否定"){_,_->
            Log.d("UT_PARTS","否定ボタン")
        }
    val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

}


