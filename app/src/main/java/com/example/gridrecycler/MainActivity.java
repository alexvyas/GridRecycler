package com.example.gridrecycler;

import static android.app.ProgressDialog.show;

import static java.lang.Integer.parseInt;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrContacts = new ArrayList<>();
    RecyclerView recyclerView;
    EditText search;
    Button btn;

    int val;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        search = findViewById(R.id.search);
        btn = findViewById(R.id.btn_search);
        recyclerView = findViewById(R.id.recyclerContact);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = parseInt(search.getText().toString());
                layoutManager.scrollToPosition(val);
//                new RecyclerContactAdapter(val,layoutManager);
            }
        });

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        arrContacts.add(new ContactModel(R.drawable.miami,R.drawable.new_york,"10,000$","Miami","New York","USA"));
        arrContacts.add(new ContactModel(R.drawable.parth,R.drawable.melborn,"8,000$","Sydney","Melbourne","AUSTRALIA"));
        arrContacts.add(new ContactModel(R.drawable.pune,R.drawable.mumbai,"15,000$","Pune","Mumbai","INDIA"));
        arrContacts.add(new ContactModel(R.drawable.shenzen,R.drawable.beijing,"5,000$","Shenzen","Beijing","CHINA"));
        arrContacts.add(new ContactModel(R.drawable.bangkok,R.drawable.pattaya,"7,000$","Bangkock","pattaya","THAILAND"));
        arrContacts.add(new ContactModel(R.drawable.tokyo,R.drawable.yokohama,"12,000$","Tokyo","Yokohama","JAPAN"));
        arrContacts.add(new ContactModel(R.drawable.seoul,R.drawable.busan,"10,000$","Seoul","Busan","Korea"));
        arrContacts.add(new ContactModel(R.drawable.sao,R.drawable.rio,"9,000$","Sao Paulo","Reo","Brazil"));
        arrContacts.add(new ContactModel(R.drawable.los_angeles,R.drawable.melborn,"17,000$","Tyumen","Moscow","RUSSIA"));
        arrContacts.add(new ContactModel(R.drawable.los_angeles,R.drawable.new_york,"14,000$","Munich","Berlin","GERMANY"));
        arrContacts.add(new ContactModel(R.drawable.yokohama,R.drawable.bangkok,"4,000$","Marseille","Paris","FRANCE"));
        arrContacts.add(new ContactModel(R.drawable.los_angeles,R.drawable.new_york,"21,000$","Edinburg","London","BRITAIN"));
        arrContacts.add(new ContactModel(R.drawable.miami,R.drawable.new_york,"10,000$","Miami","New York","USA"));
        arrContacts.add(new ContactModel(R.drawable.parth,R.drawable.melborn,"8,000$","Sydney","Melbourne","AUSTRALIA"));
        arrContacts.add(new ContactModel(R.drawable.pune,R.drawable.mumbai,"15,000$","Pune","Mumbai","INDIA"));
        arrContacts.add(new ContactModel(R.drawable.shenzen,R.drawable.beijing,"5,000$","Shenzen","Beijing","CHINA"));
        arrContacts.add(new ContactModel(R.drawable.bangkok,R.drawable.pattaya,"7,000$","Bangkock","pattaya","THAILAND"));
        arrContacts.add(new ContactModel(R.drawable.tokyo,R.drawable.yokohama,"12,000$","Tokyo","Yokohama","JAPAN"));
        arrContacts.add(new ContactModel(R.drawable.seoul,R.drawable.busan,"10,000$","Seoul","Busan","Korea"));
        arrContacts.add(new ContactModel(R.drawable.sao,R.drawable.rio,"9,000$","Sao Paulo","Reo","Brazil"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);

    }
}