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
        when(v.id) {
            R.id.button1 -> showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
            },
            13, 0, true
        )
        timePickerDialog.show()
    }

    private fun showAlertDialog() {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage("あいさつ")

        val num= ("$hour:$minute")

        if(2:00 <= num < 10:00) {
           Log.d("UI_PARTS", "おはよう")
        } else if(10:00 <= num < 18:00) {
            Log.d("UI_PARTS", "こんにちは")
        } else if(18:00 <= num < 20:00) {
            Log.d("UI_PARTS", "こんばんは")
        }

    }
