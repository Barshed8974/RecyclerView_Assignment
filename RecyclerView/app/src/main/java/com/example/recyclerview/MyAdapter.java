package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter {
    private ArrayList<Model> names;

    public MyAdapter(ArrayList<Model> birdList) {
        this.names = birdList;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflater = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        View inflater1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2,parent,false);



        if(viewType==1)
            return new MyHolder(inflater);
        else
            return new MyHolder2(inflater1);
    }

    public int getItemViewType(int position) {
        Model currentrow=names.get(position);
        if(currentrow.getType()==1)

            return 1;
        else
            return 2;
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Model name = names.get(position);
        if(name.getType()==1)
        {
            MyHolder holder1= (MyHolder) holder;
            holder1.name.setText(name.getName());
        }
        else
        {
            MyHolder2 holder2=(MyHolder2) holder;
            holder2.inte.setText((name.getName()));

        }

    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
