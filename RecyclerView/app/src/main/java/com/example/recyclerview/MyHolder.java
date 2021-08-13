package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView number;
    public MyHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.item);
        number=itemView.findViewById(R.id.item2);
    }

    public void setData(Model model) {
            name.setText(model.getName());
    }
}
