package com.example.gridrecycler;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> arrContacts;
    int search;
    RecyclerView.LayoutManager layoutManager;
    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrContacts){
        this.context = context;
        this.arrContacts = arrContacts;
    }



//    RecyclerContactAdapter(int search, RecyclerView.LayoutManager layoutManager){
//        this.search = search;
//        this.layoutManager = layoutManager;
//        Log.d("From adapter",""+search);
//    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Log.d("","");
        View  v = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.city1.setText(arrContacts.get(position).city1);
        holder.city2.setText(arrContacts.get(position).city2);
        holder.amt.setText(arrContacts.get(position).price);
        holder.dest.setText(arrContacts.get(position).dest);
        holder.img1.setImageResource(arrContacts.get(position).img1);
        holder.img2.setImageResource(arrContacts.get(position).img2);

        holder.img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Clicked "+arrContacts.get(position).city1,Toast.LENGTH_LONG).show();
            }
        });

        holder.img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Clicked "+arrContacts.get(position).city2,Toast.LENGTH_LONG).show();
            }
        });

        holder.dest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Clicked on"+arrContacts.get(position).dest+" at position "+position,Toast.LENGTH_LONG).show();
            }
        });

    }
    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView city1, city2,amt,dest;
        ImageView img1,img2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            city1 = itemView.findViewById(R.id.city1);
            city2 = itemView.findViewById(R.id.city2);
            amt = itemView.findViewById(R.id.amt);
            dest = itemView.findViewById(R.id.dest);
            img1 = itemView.findViewById(R.id.img1);
            img2 = itemView.findViewById(R.id.img2);
        }
    }
}

