package com.gzeinnumer.dateformaterkt

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class MainActivity : AppCompatActivity() {

    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val temp = "07/10/2019"
        val date: Date?
        val formatter = SimpleDateFormat("dd/mm/yyyy")
        date = formatter.parse(temp)
        val strTemp: String?

        val formatter1 = SimpleDateFormat("dd")
        strTemp = formatter1.format(date)

        Toast.makeText(applicationContext, strTemp, Toast.LENGTH_SHORT).show()
    }
}
