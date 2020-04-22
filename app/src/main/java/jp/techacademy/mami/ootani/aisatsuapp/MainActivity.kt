package jp.techacademy.mami.ootani.aisatsuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
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
        when (v.id) {
            R.id.button1 -> showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
            },
            13, 0, true)
            timePickerDialog.show()

        fun setText(s: String) {
            when ("hour:minute") {

                ("2:00 <= \"hour:minute\" < 10:00") ->  {
                    Log.d("UI_PARTS", "おはよう")
                    setText ("おはよう")
                }
                ("10:00 <= \"hour:minute\" < 18:00")  -> {
                    Log.d("UI_PARTS", "こんにちは")
                    setText ("こんにちは")
                }
                ("18:00 <= \"hour:minute\" < 24:00 || 0:00 <= \"hour:minute\" < 02:00") -> {
                    Log.d("UI_PARTS", "こんばんは")
                    setText ("こんばんは")
                }
            }

        }


    }
}
