package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface{

    ArrayList<itemModel> itemModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setModels();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerViewAdapter adapter = new recyclerViewAdapter(this,itemModels,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

    }

    public void setModels(){
        itemModels.add(new itemModel("Happy",R.drawable.happiness));
        itemModels.add(new itemModel("Angry",R.drawable.angry));
        itemModels.add(new itemModel("Apple",R.drawable.apple));
        itemModels.add(new itemModel("Excited",R.drawable.excited));
        itemModels.add(new itemModel("Meh",R.drawable.meh));
        itemModels.add(new itemModel("Sad",R.drawable.sad));
        itemModels.add(new itemModel("Seal",R.drawable.seal));
        itemModels.add(new itemModel("Stars",R.drawable.stars));
    }

    @Override
    public void onItemClick(int position) {

    }
}