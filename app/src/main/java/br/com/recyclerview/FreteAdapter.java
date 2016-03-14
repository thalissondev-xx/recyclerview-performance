package br.com.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/**
 * Created by thalissonestrela on 14/03/16.
 */
public class FreteAdapter extends RecyclerView.Adapter<FreteViewHolder> {
    private Context context;
    private ArrayList<Frete> list;

    public FreteAdapter(Context context, ArrayList<Frete> list) {
        this.context = context;
        this.list = list;
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public FreteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.listview_item, parent, false);
        FreteViewHolder viewHolder = new FreteViewHolder(this.context, view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(FreteViewHolder holder, int position) {
        Frete frete = this.list.get(position);
        holder.tvOrigem.setText(frete.getOrigem());
        holder.tvDestino.setText(frete.getDestino());
    }
}
