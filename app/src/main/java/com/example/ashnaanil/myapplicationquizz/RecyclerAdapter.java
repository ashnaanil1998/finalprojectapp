package com.example.ashnaanil.myapplicationquizz;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ImageViewHolder> {
    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView Categories;
        TextView CategoriesTitle;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            Categories = itemView.findViewById(R.id.categories);
            CategoriesTitle = itemView.findViewById(R.id.categories_title);
        }
    }
}
