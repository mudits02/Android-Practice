package `in`.mudits02.ageinminutes

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {
    private var SelectedDate : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SelectedDate = findViewById(R.id.SelectedDate)

        val btnDatePicker : Button = findViewById(R.id.btnDatePicker)
        btnDatePicker.setOnClickListener()
        {
            clickDatePicker()
        }


    }

    fun clickDatePicker()
    {
        Toast.makeText(this , "Date selected" , Toast.LENGTH_LONG).show()
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this, DatePickerDialog.OnDateSetListener{view , year , month , day ->} ,
        year,
        month,
        day).show()
        val lundDate = "$year/${month+1}/$day"

        SelectedDate?.text = lundDate

        




    }
}