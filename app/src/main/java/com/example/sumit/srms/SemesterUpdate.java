package com.example.sumit.srms;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SemesterUpdate extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_update);

        //Side Drawer Code
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.admin_drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //End Side Drawer Code

        //Spinner Code
        Spinner spinner_course = (Spinner) findViewById(R.id.spinner_Course);
        ArrayAdapter<String> adapter_course =  new ArrayAdapter<>(SemesterUpdate.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Course));
        adapter_course.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_course.setAdapter(adapter_course);

        Spinner spinner_semester = (Spinner) findViewById(R.id.spinner_Semester);
        ArrayAdapter<String> adapter_semester =  new ArrayAdapter<>(SemesterUpdate.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Sem));
        adapter_semester.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_semester.setAdapter(adapter_semester);

        Spinner spinner_new_sem = (Spinner) findViewById(R.id.spinner_NewSemester);
        ArrayAdapter<String> adapter_new_sem =  new ArrayAdapter<>(SemesterUpdate.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.New_Sem));
        adapter_new_sem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_new_sem.setAdapter(adapter_new_sem);
        // Spinner Code End

    }

    //Side drawer open close related method
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    //End Side drawer open close related method
}
