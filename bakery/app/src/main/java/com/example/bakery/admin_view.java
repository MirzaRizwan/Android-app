package com.example.bakery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class admin_view extends AppCompatActivity {

    String [] main = {};
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_view);

        gridView = findViewById(R.id.list_view_1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(admin_view.this,android.R.layout.simple_list_item_1,main);
        gridView.setAdapter(adapter);

    }
}
