package com.whatsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class SpinnerListActivity extends AppCompatActivity {

    Spinner spinner;
    //String[] countryArray = {"India","Canada","Australia","US"};
    ArrayList<String> arrayList;

    GridView gridView;
    AutoCompleteTextView autoTxt;
    MultiAutoCompleteTextView multiTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_list);

        spinner = findViewById(R.id.spinner);

        arrayList = new ArrayList<>();
        arrayList.add("India");
        arrayList.add("Canada");
        arrayList.add("Australia");
        arrayList.add("US");
        arrayList.add("Demo");
        arrayList.add("Fransh");
        arrayList.add("Ireland");

        arrayList.remove(4);
        arrayList.set(4,"France");
        arrayList.add(2,"England");

        ArrayAdapter adapter = new ArrayAdapter(SpinnerListActivity.this, android.R.layout.simple_list_item_1,arrayList);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_checked);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SpinnerListActivity.this, arrayList.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        gridView = findViewById(R.id.listview);
        ArrayAdapter listAdapter = new ArrayAdapter(SpinnerListActivity.this, android.R.layout.simple_list_item_1,arrayList);
        gridView.setAdapter(listAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SpinnerListActivity.this, arrayList.get(i), Toast.LENGTH_SHORT).show();
            }
        });

        autoTxt = findViewById(R.id.spinner_autoTxt);
        ArrayAdapter autoAdapter = new ArrayAdapter(SpinnerListActivity.this, android.R.layout.simple_list_item_1,arrayList);
        autoTxt.setAdapter(autoAdapter);
        autoTxt.setThreshold(1);

        multiTxt = findViewById(R.id.spinner_multiautoTxt);
        ArrayAdapter multiAdapter = new ArrayAdapter(SpinnerListActivity.this, android.R.layout.simple_list_item_1,arrayList);
        multiTxt.setAdapter(multiAdapter);
        multiTxt.setThreshold(1);
        multiTxt.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }
}