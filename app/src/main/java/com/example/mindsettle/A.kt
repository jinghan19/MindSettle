package com.example.mindsettle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*;
import android.content.*;
import android.view.View
import kotlinx.android.synthetic.main.activity_a.*

public class A: AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        

    }

    fun onRadioButtonClicked(view: View) {
        ;
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked
            val textView: TextView = findViewById(R.id.textViewMood) as TextView

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radioButton4->
                    if (checked) {
                        imageViewPhoto.setImageResource(R.drawable.great);
                        textView.text = getString(R.string.feelgreat);
                    }
                R.id.radioButton5->
                    if (checked) {
                        imageViewPhoto.setImageResource(R.drawable.good);
                        textView.text = getString(R.string.feelgood);
                    }

                R.id.radioButton6->
                    if (checked) {
                        imageViewPhoto.setImageResource(R.drawable.ok);
                        textView.text = getString(R.string.feelok);
                    }

                R.id.radioButton9->
                    if(checked){
                        imageViewPhoto.setImageResource(R.drawable.bad);
                        textView.text = getString(R.string.feelbad);
                    }

                R.id.radioButton10->
                    if(checked){
                        imageViewPhoto.setImageResource(R.drawable.awful);
                        textView.text = getString(R.string.feelawful)
                     }

            }
        }
    }

}