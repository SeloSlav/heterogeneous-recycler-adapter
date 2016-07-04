package com.example.martin.heterogeneousrecycleradapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by santafebound on 4.7.2016.
 */

public class MainActivity extends AppCompatActivity {

    private ArrayList<Object> getSampleArrayList() {
        ArrayList<Object> items = new ArrayList<>();
        items.add(new President("George Washington", "Mount Vernon"));
        items.add(new Sponsored("Craft Beer 20% Off", "Budweiser"));
        items.add(new President("John Adams", "Braintree"));
        items.add(new Sponsored("Craft Beer 20% Off", "Budweiser"));
        items.add(new President("Thomas Jefferson", "Monticello"));
        items.add(new Sponsored("Craft Beer 20% Off", "Budweiser"));
        items.add(new President("James Madison", "Port Conway"));
        items.add(new Sponsored("Craft Beer 20% Off", "Budweiser"));
        return items;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        bindDataToAdapter(recyclerView);

    }

    private void bindDataToAdapter(RecyclerView recyclerView) {
        recyclerView.setAdapter(new HeterogeneousRecyclerAdapter(getSampleArrayList()));
    }

}
