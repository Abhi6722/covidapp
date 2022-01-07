package com.Abhi6722.covidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_symptoms.*

class SymptomsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptoms)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)
        val symptomsList = ArrayList<Model>()
        symptomsList.add(Model(R.drawable.cough,"Dry Cough","This means coughing a lot for more than an hour, or 3 or more coughing episodes in 24 hours."))
        symptomsList.add(Model(R.drawable.fever,"Fever","This means you feel hot to touch on your chest or back (you do need to measure your temperature)."))
        symptomsList.add(Model(R.drawable.pain,"Head Ache","This is a potential symptom of COVID-19. However, it's less common than other COVID-19 symptoms."))
        symptomsList.add(Model(R.drawable.sore_throat,"Sore Throat","This is a condition marked by pain in the throat, caused by inflammation due to a cold or other virus."))

        val symptomsAdapter = SymptomsAdapter(symptomsList)

        recyclerView.adapter = symptomsAdapter
    }
}
