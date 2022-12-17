package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.app_2.model.FoodItem;
import com.example.app_2.model.IFooditems;

import java.util.List;

public class MenueActivity extends AppCompatActivity {

    private Spinner spinner;
    private ListView list;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menue);
        spinner=findViewById(R.id.spinner);
        list= findViewById(R.id.list);
        button = findViewById(R.id.button);

        IFooditems data = new ItemData();
         List<String> r1 =data.getCategories();

        ArrayAdapter<String> ad1 = new ArrayAdapter<String>(this , android.R.layout.simple_spinner_item,r1);
        spinner.setAdapter(ad1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cat = spinner.getSelectedItem().toString();
                List<FoodItem> r2 = data.getItemsByaCategory(cat);
                ArrayAdapter<FoodItem> ad2 =new ArrayAdapter<FoodItem>(MenueActivity.this, android.R.layout.simple_spinner_item,r2);
                list.setAdapter(ad2);
            }
        });
        }
    }
