package br.com.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by thalissonestrela on 14/03/16.
 */
public class FreteViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private Context context;
    public TextView tvOrigem;
    public TextView tvDestino;

    public FreteViewHolder(Context context, View view) {
        super(view);
        this.context = context;
        this.tvOrigem = (TextView) view.findViewById(R.id.tvOrigem);
        this.tvDestino = (TextView) view.findViewById(R.id.tvDestino);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this.context, "" + getPosition(), Toast.LENGTH_LONG).show();
    }
}
