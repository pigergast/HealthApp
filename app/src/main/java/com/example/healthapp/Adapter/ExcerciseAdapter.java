package com.example.healthapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthapp.Model.ExcerciseModel;
import com.example.healthapp.R;

import java.util.List;

public class ExcerciseAdapter extends RecyclerView.Adapter<ExcerciseAdapter.ViewHolder> {
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView ExName;
        public Button expand;
        public TextView duration;
        public RecyclerView sets;
        public ViewHolder(View itemView) {
            super(itemView);
            ExName = (TextView) itemView.findViewById(R.id.excerciseName);
            expand = (Button) itemView.findViewById(R.id.expand);
            duration = (TextView) itemView.findViewById(R.id.duration);
            sets = (RecyclerView) itemView.findViewById(R.id.setList);
        }

    }
    private List<ExcerciseModel> excercisesList;

    public ExcerciseAdapter(List<ExcerciseModel> list ){
        excercisesList = list;
    }
    @Override
    public ExcerciseAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
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
        button.setText("Open");
        button.setEnabled(true);
        TextView textView2 = viewHolder.duration;
        textView2.setText(excercise.duration);
        RecyclerView setList = viewHolder.sets;
        SetAdapter adapter = new SetAdapter(excercise.excerciseList);
        setList.setAdapter(adapter);
        setList.setLayoutManager(new LinearLayoutManager( viewHolder.sets.getContext()));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(setList.getVisibility() == View.GONE)
                {
                    setList.setVisibility(View.VISIBLE);
                    button.setText("Close");
                    button.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_baseline_arrow_upward_24, 0 ,0 , 0);
                }
                else {
                    setList.setVisibility(View.GONE);
                    button.setText("Open");
                    button.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_baseline_arrow_downward_24, 0 ,0 , 0);

                }
            }
        });
    }

    @Override
    public int getItemCount(){
        return excercisesList.size();
    }
}
