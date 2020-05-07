package jp.techacademy.mami.ootani.aisatsuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.app.TimePickerDialog

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
            Log.d("UI_PARTS", "ボタンをタップしました")
        }
        //textと式を記述する場所(仮)
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
            },
            2, 0, true)

        //記述する場所
        //案3
        val hourOfDay = Log.d("UI_PARTS", "$:$")

        if (2 <= hourOfDay && hourOfDay <= 9) {
            textview.text = "おはよう"
            Log.d("textview", "おはよう")
        } else if (10 <= hourOfDay && hourOfDay <= 17) {
            textview.text = "こんにちは"
            Log.d("textview", "こんにちは")
        } else if (18 <= hourOfDay && hourOfDay <= 23) {
            textview.text = "こんばんは"
            Log.d("textview", "こんにちは")
        } else if (0 <= hourOfDay && hourOfDay <= 1) {
            textview.text = "こんばんは"
            Log.d("textview", "こんばんは")
        }
        timePickerDialog.show()

    }
}
