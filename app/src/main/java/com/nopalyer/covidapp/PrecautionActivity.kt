package com.Abhi6722.covidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_precaution.*

class PrecautionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_precaution)

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        val precautionsList = ArrayList<Model>()
        precautionsList.add(Model(R.drawable.soap,"Hand Wash","Clean your hands often. Use soap and water, or an alcohol-based hand rub."))
        precautionsList.add(Model(R.drawable.hone,"Stay Home","Stay home if you feel unwell and always follow the safety precautions."))
        precautionsList.add(Model(R.drawable.distance,"Social Distance","Maintain a safe distance from others (at least 1 metre), even if they don’t appear to be sick."))
        precautionsList.add(Model(R.drawable.clean,"Clean Object & Surface","Choose open, well-ventilated spaces over closed ones. Open a window if indoors."))
        precautionsList.add(Model(R.drawable.cover,"Avoid Touching","Cover your nose and mouth with your bent elbow or a tissue when you cough or sneeze and avoid touching."))

        val precautionsAdapter = PrecautionsAdapter(precautionsList)

        recyclerView.adapter = precautionsAdapter
    }
}
