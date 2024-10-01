package com.example.tugasfragmen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Mahasiswa extends RecyclerView.Adapter<Mahasiswa.MahasiswaViewHolder>{
    private List<item_mahasiswa> item_mahasiswaList;
    public Mahasiswa(List<item_mahasiswa> mahasiswaList) {
        this.item_mahasiswaList = mahasiswaList;
    }

    @NonNull
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }


    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        item_mahasiswa item_mahasiswa = item_mahasiswaList.get(position);
        holder.nama.setText(item_mahasiswa.getNama());
        holder.noTelp.setText(item_mahasiswa.getNoTelp());
        holder.email.setText(item_mahasiswa.getEmail());
        holder.foto.setImageResource(item_mahasiswa.getFoto());
    }


    public int getItemCount() {
        return item_mahasiswaList.size();
    }

    static class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        TextView nama, noTelp, email;
        ImageView foto;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.tvNama);
            noTelp = itemView.findViewById(R.id.tvNoTelp);
            email = itemView.findViewById(R.id.tvEmail);
            foto = itemView.findViewById(R.id.imgFoto);
        }
    }
}