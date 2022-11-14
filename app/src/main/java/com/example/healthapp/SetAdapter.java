package com.example.healthapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.healthapp.Model.SetModel;

import java.util.List;

public class SetAdapter extends RecyclerView.Adapter<SetAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView SetName;
        public TextView RepNum;
        public TextView SetNum;
        public ViewHolder(View itemView) {
            super(itemView);
            SetName = (TextView) itemView.findViewById(R.id.SetName);
            RepNum = (TextView) itemView.findViewById(R.id.RepNum);
            SetNum = (TextView) itemView.findViewById(R.id.SetNum);
        }

    }
    private List<SetModel> setList;

    public SetAdapter(List<SetModel> list){
        setList = list;
    }
    @Override
    public SetAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.set_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position){
        SetModel set = setList.get(position);
        TextView name = viewHolder.SetName;
        name.setText(set.name);
        TextView rep = viewHolder.RepNum;
        rep.setText(set.repNum.toString() + " Reps");
        TextView sets = viewHolder.SetNum;
        sets.setText(set.setNum.toString() +" Sets");
    }

    @Override
    public int getItemCount(){
        return setList.size();
    }
}
