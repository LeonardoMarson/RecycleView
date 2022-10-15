package com.example.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.adapter.imagemadapter;

public class Recycle_Activity extends AppCompatActivity{
    RecyclerView rvMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        rvMenu = findViewById(R.id.rvMenu);

        rvMenu.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        rvMenu.setAdapter(new imagemadapter());
    }

}
