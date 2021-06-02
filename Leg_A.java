package com.example.gym_splits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

public class Leg_A extends AppCompatActivity {
    String[] name={
            "Walking Lunges(3 sets of 15 reps)",
            "Barbbel Squats(3 sets of 12-15 reps)",
            "Leg Press(3 sets of 10-12 reps)",
            "Lying Leg Curls(3 sets of 10-12 reps)",
            "Seated Calf Raises(3 sets of 12-15 reps)"
    };

    Integer[] icon={
            R.drawable.walkinglunges,
            R.drawable.barbellsquat,
            R.drawable.legpress,
            R.drawable.lyinglegcurl,
            R.drawable.seatedcalfraises

    };

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_leg2);

        lv=findViewById(R.id.lega_list);

        MyAdapter5 adapter=new MyAdapter5(this,name,icon);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Intent intent4=new Intent(getApplicationContext(),lega_img.class);
                intent4.putExtra("item",name[position]);
                intent4.putExtra("image",icon[position]);

                startActivity(intent4);


            }
        });
    }
}