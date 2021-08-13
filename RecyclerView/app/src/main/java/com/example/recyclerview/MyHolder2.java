package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder2 extends RecyclerView.ViewHolder {
    TextView inte;
    public MyHolder2(@NonNull View itemView) {
        super(itemView);
        inte=itemView.findViewById(R.id.item2);
    }
    public void setData(Model model) {
        inte.setText(model.getName());
    }
}
