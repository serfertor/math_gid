package com.example.math_gid.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.math_gid.R;

import java.util.ArrayList;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final ArrayList<String> items;

    public interface OnStateClickListener{
        void onStateClick(String state, int position);
    }

    private final OnStateClickListener onClickListener;

    public CustomRecyclerAdapter(Context context, ArrayList<String> items, OnStateClickListener onClickListener) {
        this.items = items;
        this.inflater = LayoutInflater.from(context);
        this.onClickListener = onClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String item = items.get(position);
        holder.text.setText(item);
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                onClickListener.onStateClick(item, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView text;
        ViewHolder(View view){
            super(view);
            text = view.findViewById(R.id.nameTextView);
        }
    }
}
