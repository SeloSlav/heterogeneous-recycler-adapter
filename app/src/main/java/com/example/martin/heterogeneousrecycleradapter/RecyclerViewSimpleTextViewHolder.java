package com.example.martin.heterogeneousrecycleradapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by santafebound on 4.7.2016.
 */

public class RecyclerViewSimpleTextViewHolder extends RecyclerView.ViewHolder {


    private TextView label;
    public RecyclerViewSimpleTextViewHolder(View itemView) {
        super(itemView);
        label = (TextView) itemView.findViewById(android.R.id.text1);
    }

    public TextView getLabel() {
        return label;
    }

    public void setLabel(TextView label) {
        this.label = label;
    }
}