package com.example.mindsettle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*;
import android.content.*;
import android.view.View
import kotlinx.android.synthetic.main.activity_a.*
import kotlinx.android.synthetic.main.activity_events.*

class EventsActivity: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)

        imageViewStep.setOnClickListener{
            val intent = Intent(this, TakeASmallStep::class.java)
            startActivity(intent)
        }

        TextViewStep.setOnClickListener{
            val intent = Intent(this, TakeASmallStep::class.java)
            startActivity(intent)
        }

        imageViewGratitude.setOnClickListener{
            val intent = Intent(this, gratitudeActivity::class.java)
            startActivity(intent)
        }

        TextViewGratitude.setOnClickListener{
            val intent = Intent(this, gratitudeActivity::class.java)
            startActivity(intent)
        }

    }

}