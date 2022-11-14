package com.example.healthapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.healthapp.Model.ExcerciseModel;

import java.util.List;

public class SetAdapter extends RecyclerView.Adapter<SetAdapter.ViewHolder> {
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView ExName;
        public Button expand;

        public ViewHolder(View itemView) {
            super(itemView);
            ExName = (TextView) itemView.findViewById(R.id.excerciseName);
            expand = (Button) itemView.findViewById(R.id.expand);
        }

    }
    private List<ExcerciseModel> excercisesList;

    public SetAdapter(List<ExcerciseModel> list){
        excercisesList = list;
    }
    @Override
    public SetAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.excercise_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position){
        ExcerciseModel excercise = excercisesList.get(position);
        TextView textView = viewHolder.ExName;
        textView.setText(excercise.excerciseName);
        Button button = viewHolder.expand;
        button.setText("Expand");
        button.setEnabled(true);
    }

    @Override
    public int getItemCount(){
        return excercisesList.size();
    }
}
