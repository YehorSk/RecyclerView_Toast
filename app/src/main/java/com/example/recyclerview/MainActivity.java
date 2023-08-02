package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

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
        ToastClick(itemModels.get(position).getName(),itemModels.get(position).getImage());
    }
    public void ToastClick(String text, Integer image){
        LayoutInflater layoutInflater = getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.toast_layout,this.findViewById(R.id.toast_layout));
        ImageView imageView = view.findViewById(R.id.image);
        TextView textView = view.findViewById(R.id.text);
        imageView.setImageResource(image);
        textView.setText(text);
        Toast toast = new Toast(this);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }
}