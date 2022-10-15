package com.example.app.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.R;
import com.example.app.Recycle_Activity;

public class imagemadapter extends RecyclerView.Adapter<imagemadapter.ViewHolderImg> {
    private int[] imagensMenu = {
            R.drawable.carona,
            R.drawable.lanche,
            R.drawable.carona,
            R.drawable.lanche,
            R.drawable.carona,
            R.drawable.lanche,
            R.drawable.carona,
            R.drawable.lanche,
            R.drawable.carona,
            R.drawable.lanche
    };

    @NonNull
    @Override
    public imagemadapter.ViewHolderImg onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemrecycle,parent,false);
        return new ViewHolderImg(view);
    }

    @Override
    public void onBindViewHolder(@NonNull imagemadapter.ViewHolderImg holder, int position) {
        holder.imgMenu.setImageResource(imagensMenu[position]);

    }

    @Override
    public int getItemCount() {
        return imagensMenu.length;
    }
    class ViewHolderImg extends RecyclerView.ViewHolder{
        private ImageView imgMenu;

        public ViewHolderImg(@NonNull View itemView) {
            super(itemView);

            imgMenu = (ImageView) itemView.findViewById(R.id.imgMenu);
        }
    }

}
