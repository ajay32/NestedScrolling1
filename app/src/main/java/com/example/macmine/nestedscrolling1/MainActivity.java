package com.example.macmine.nestedscrolling1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

//Adding a ScrollView inside ScrollView can be difficult. Most of the times it won’t end well.
// You will end up adding few workarounds and a person maintaining your code will probably hate you for the rest of his life. Fortunately,
// with NestedScrollView class this becomes much easier.
//only one ScrollView will be scrollable.

public class MainActivity extends AppCompatActivity {

    LinearLayout llLinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //the layout file you include into your main layout file ...you dont need to cast them using  inflated ..now they are part of your main file too ..so just initlize them normall as u don view of your main file..

        llLinear = (LinearLayout) findViewById(R.id.ll_linear);

        llLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello cardview 1", Toast.LENGTH_LONG).show();
            }
        });
    }




}
