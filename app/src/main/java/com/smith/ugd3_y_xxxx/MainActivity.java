package com.smith.ugd3_y_xxxx;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.smith.ugd3_y_xxxx.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Mahasiswa> ListMahasiswa;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_main);

        //get data mahasiswa
        ListMahasiswa = new DaftarMahasiswa().MAHASISWA;

        //recycler view
        RecyclerView recyclerView = activityMainBinding.recyclerViewMahasiswa;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new RecyclerViewAdapter(this, ListMahasiswa));
    }
}