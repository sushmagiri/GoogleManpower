package com.example.user.googlemanpower.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.user.googlemanpower.R;
import com.example.user.googlemanpower.adapter.AbooutNepalAdapter;

public class AboutNepal extends AppCompatActivity {
  AbooutNepalAdapter abooutNepalAdapter;
    ListView lv;

    public String[] Title={"DESTINATIONS","GEOGRAPHY","CLIMATE","CULTURE","PEOPLE","WHY NEPAL?" };
    public Integer[] mThumbIds ={
            R.drawable.mark,
            R.drawable.globe,
            R.drawable.rain,
            R.drawable.right,
            R.drawable.people,
            R.drawable.question

    };

    public String[] Content={"There are innumarebal agencies in Nepal but very few agencies are strongly leading the reliable manpower selection and staffing, upholding moral","To be recognized as a quality driven agency committed to the provision of professional and quality recruitment solutions in all spheres of","Since the founding of the company, our essential ingredients and philosophy has been to strive for excellence and become ","To be recognized as a quality driven agency committed to the provision of professional and quality recruitment solutions in all spheres of","Since the founding of the company, our essential ingredients and philosophy has been to strive for excellence and become","Since the founding of the company, our essential ingredients and philosophy has been to strive for excellence and become"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_nepal);
        lv=(ListView) findViewById(R.id.list);
        abooutNepalAdapter=new AbooutNepalAdapter(getApplicationContext(),Title,mThumbIds,Content);
        lv.setAdapter(abooutNepalAdapter);

    }

}
