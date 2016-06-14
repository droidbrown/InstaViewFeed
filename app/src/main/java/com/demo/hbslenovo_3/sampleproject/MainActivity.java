package com.demo.hbslenovo_3.sampleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.demo.hbslenovo_3.sampleproject.adapter.DemoAdatpter;
import com.demo.hbslenovo_3.sampleproject.model.ModelList;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.recycler_view)
    RecyclerView mRecycle;

    private ArrayList<ModelList> movieList = new ArrayList<>();

    private DemoAdatpter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mAdapter = new DemoAdatpter(this,movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecycle.setLayoutManager(mLayoutManager);
        mRecycle.setItemAnimator(new DefaultItemAnimator());
        mRecycle.setAdapter(mAdapter);

        addDataToList();



    }

    private void addDataToList() {

        try{

            ModelList movie = new ModelList("Mad Max: Fury Road");
            movieList.add(movie);

            movie = new ModelList("Inside Out");
            movieList.add(movie);

            movie = new ModelList("Star Wars: Episode VII - The Force Awakens");
            movieList.add(movie);

            movie = new ModelList("Shaun the Sheep");
            movieList.add(movie);

            movie = new ModelList("The Martian");
            movieList.add(movie);

            movie = new ModelList("Mission: Impossible Rogue Nation");
            movieList.add(movie);

            movie = new ModelList("Up");
            movieList.add(movie);

            movie = new ModelList("Star Trek");
            movieList.add(movie);

            movie = new ModelList("The LEGO Movie");
            movieList.add(movie);

            movie = new ModelList("Iron Man");
            movieList.add(movie);

            movie = new ModelList("Aliens");
            movieList.add(movie);

            movie = new ModelList("Chicken Run");
            movieList.add(movie);

            movie = new ModelList("Back to the Future");
            movieList.add(movie);

            movie = new ModelList("Raiders of the Lost Ark");
            movieList.add(movie);

            movie = new ModelList("Goldfinger");
            movieList.add(movie);

            movie = new ModelList("Guardians of the Galaxy");
            movieList.add(movie);

            mAdapter.notifyDataSetChanged();




        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
