package com.example.user.googlemanpower.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.googlemanpower.R;

public class EmployeeResponsibility extends AppCompatActivity {
    ListView lv;
ArrayAdapter<String>adapter;
    String[]text={"Arrange timely receipt of the workers at airport.\n","Inform Paradise about receipt of the workers.","Advance payment of an amount to each worker on arrival in the country of work (deductable from monthly salary).","Arrange furnished housing accommodation suitable to human living.","Ensure water and electricity in the living place.","Ensure full security of the workers in the living and working places, especially in cases of female workers.","Timely payment of salary for every working month","Keeping updated the validity of the passport, residence permit/employment visa of the workers.","Treating workers as human being.","Proper medical treatment of the workers in case of any sickness/accident.","Inform Paradise any problem that requires handling from our end.","Follow terms of agreement signed between the Employer and the Workers."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_responsibility);
        lv=(ListView)findViewById(R.id.list);
        adapter = new ArrayAdapter<String>(this,R.layout.list_item, text);
        lv.setAdapter(adapter);

    }
}
