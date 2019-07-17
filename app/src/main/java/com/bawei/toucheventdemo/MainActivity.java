package com.bawei.toucheventdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcv;
    private HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = findViewById(R.id.rcv);

        hashMap = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            hashMap.put("标题"+i,"");
        }
        Toast.makeText(MainActivity.this, hashMap +"",Toast.LENGTH_LONG).show();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        rcv.setLayoutManager(linearLayoutManager);

        LayAdapter layAdapter = new LayAdapter();
        rcv.setAdapter(layAdapter);
    }

    private class LayAdapter extends RecyclerView.Adapter<LayAdapter.Adapter> {
        @NonNull
        @Override
        public Adapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item, parent);
            return new Adapter(view);
        }

        @Override
        public void onBindViewHolder(@NonNull Adapter holder, int position) {
                holder.name.setText(hashMap.get(position));
        }

        @Override
        public int getItemCount() {
            return hashMap.size();
        }

        public class Adapter extends RecyclerView.ViewHolder {

            private final TextView name;

            public Adapter(@NonNull View itemView) {
                super(itemView);
                name = itemView.findViewById(R.id.item_name);
            }
        }
    }
}
