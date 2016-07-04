package com.example.martin.heterogeneousrecycleradapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by santafebound on 4.7.2016.
 */

public class HeterogeneousRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Object> items;
    private final int PRESIDENT = 0, SPONSORED = 1;

    public HeterogeneousRecyclerAdapter(List<Object> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType) {
            case PRESIDENT:
                View v1 = inflater.inflate(R.layout.layout_viewholder1, viewGroup, false);
                viewHolder = new ViewHolder1(v1);
                break;
            case SPONSORED:
                View v2 = inflater.inflate(R.layout.layout_viewholder2, viewGroup, false);
                viewHolder = new ViewHolder2(v2);
                break;
            default:
                View v = inflater.inflate(android.R.layout.simple_list_item_1, viewGroup, false);
                viewHolder = new RecyclerViewSimpleTextViewHolder(v);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()) {
            case PRESIDENT:
                ViewHolder1 vh1 = (ViewHolder1) viewHolder;
                configureViewHolder1(vh1, position);
                break;
            case SPONSORED:
                ViewHolder2 vh2 = (ViewHolder2) viewHolder;
                configureViewHolder2(vh2, position);
                break;
            default:
                RecyclerViewSimpleTextViewHolder vh = (RecyclerViewSimpleTextViewHolder) viewHolder;
                configureDefaultViewHolder(vh, position);
                break;
        }
    }

    private void configureDefaultViewHolder(RecyclerViewSimpleTextViewHolder vh, int position) {
        vh.getLabel().setText((CharSequence) items.get(position));
    }

    private void configureViewHolder1(ViewHolder1 vh1, int position) {
        President president = (President) items.get(position);
        if (president != null) {
            vh1.getLabel1().setText(president.getName());
            vh1.getLabel2().setText(president.getHometown());
        }
    }

    private void configureViewHolder2(ViewHolder2 vh2, int position) {
        Sponsored sponsored = (Sponsored) items.get(position);
        if (sponsored != null) {
            vh2.getLabel1().setText(sponsored.getName());
            vh2.getLabel2().setText(sponsored.getCompany());
        }
    }
}