package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    EditText add,del,poss,data;
    Button btnadd,btndel,btnUpdate;
    MyAdapter adapter;

    int count=0;
    private ArrayList<Model> modelList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildStudentList();
        setRecyclerView();
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=add.getText().toString();
                if(count%2==0) {
                    Model model=new Model(s,1);
                    modelList.add(model);
                    adapter.notifyDataSetChanged();
                    count++;
                }
                else
                {
                    Model model=new Model(s,2);
                    modelList.add(model);
                    adapter.notifyDataSetChanged();
                    count++;
                }
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=Integer.parseInt(del.getText().toString());
                modelList.remove(i);
                adapter.notifyDataSetChanged();
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=Integer.parseInt(poss.getText().toString());
                int j=modelList.get(i).type;
                String s=data.getText().toString();
                Model model=new Model(s,j);
                modelList.set(i,model);
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void buildStudentList() {
        Model model=new Model("Ali",1);
        modelList.add(model);
        modelList.add(model);
        Model model1=new Model("task1",2);
        modelList.add(model1);
        modelList.add(model1);
    }

    private void setRecyclerView() {
        adapter=new MyAdapter(modelList);
        LinearLayoutManager gridLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void initView() {
        recyclerView=findViewById(R.id.recycler);
        add=findViewById(R.id.add);
        del=findViewById(R.id.del);
        poss=findViewById(R.id.position);
        data=findViewById(R.id.update);
        btnadd=findViewById(R.id.btnadd);
        btndel=findViewById(R.id.btndel);
        btnUpdate=findViewById(R.id.btnUpdate);
    }
}