package com.example.bsfragments;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DataAdapter  extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Item> items;

    DataAdapter(Context context, List<Item> items) {
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.nameView.setText(item.getName());
        holder.authorView.setText(item.getAuthor());
        holder.bookGanreView.setText(item.getbookGanre());
        holder.priceView.setText(item.getPrice());
        holder.imageBookView.setImageResource(item.getImageBook());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageBookView;
        final TextView nameView, authorView, bookGanreView, priceView;
        ViewHolder(View view){
            super(view);
            imageBookView = (ImageView)view.findViewById(R.id.imageBook);
            nameView = (TextView) view.findViewById(R.id.name);
            authorView = (TextView) view.findViewById(R.id.author);
            bookGanreView = (TextView) view.findViewById(R.id.bookGanre);
            priceView = (TextView) view.findViewById(R.id.price);
        }
    }
}
