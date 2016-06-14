package com.demo.hbslenovo_3.sampleproject.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demo.hbslenovo_3.sampleproject.R;
import com.demo.hbslenovo_3.sampleproject.model.ModelList;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by hbslenovo-3 on 6/13/2016.
 */

public class DemoAdatpter extends RecyclerView.Adapter<DemoAdatpter.ContactViewHolder> {
    private ArrayList<ModelList> modelList;
    private Context mContext;

    public DemoAdatpter(Context context, ArrayList<ModelList> List) {
        this.modelList = List;
        this.mContext = context;

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    @Override
    public void onBindViewHolder(ContactViewHolder contactViewHolder, final int i) {


        contactViewHolder.name.setText(modelList.get(i).getTitle());





    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.adapter_item, viewGroup, false);

        return new ContactViewHolder(itemView);
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.tv_user_name)
        TextView name;




        public ContactViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }
}
