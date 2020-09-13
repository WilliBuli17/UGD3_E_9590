package com.smith.ugd3_y_xxxx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.smith.ugd3_y_xxxx.databinding.AdapterRecyclerViewBinding;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context context;
    private List<Mahasiswa> result;

    public RecyclerViewAdapter(){}

    public RecyclerViewAdapter(Context context, List<Mahasiswa> result){
        this.context = context;
        this.result = result;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        AdapterRecyclerViewBinding adapterRecyclerViewBinding = AdapterRecyclerViewBinding
                .inflate(layoutInflater, parent, false);

        return new MyViewHolder(adapterRecyclerViewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Mahasiswa mhs = result.get(position);
        holder.bindMhs(mhs);
    }

    @Override
    public int getItemCount() {
        return result.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private AdapterRecyclerViewBinding adapterRecyclerViewBinding;

        public MyViewHolder(AdapterRecyclerViewBinding adapterRecyclerViewBinding){
            super(adapterRecyclerViewBinding.getRoot());
            this.adapterRecyclerViewBinding = adapterRecyclerViewBinding;
        }
        public void onClick(View view) {
            Toast.makeText(context, "You touch me?", Toast.LENGTH_SHORT).show();
        }

        public void bindMhs(Mahasiswa mahasiswa) {
            adapterRecyclerViewBinding.setMhs(mahasiswa);
            adapterRecyclerViewBinding.executePendingBindings();
        }
    }
}