package com.example.scoreboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TotalAdapter extends RecyclerView.Adapter<TotalAdapter.ViewHolder>  {
    Context context;
    ArrayList<TotalItem> totalItems = new ArrayList<TotalItem>();

    public TotalAdapter(Context context) {  this.context = context;  }

    //새로 만든 ViewHolder 객체에 담아 반환
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.activity_rank_recyclerview, parent, false);
        return new TotalAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TotalItem item = totalItems.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {  return totalItems.size();  }

    //Item 추가
    public void addItem(TotalItem item){
        totalItems.add(item);
    }

    //한번에 Item 추가 설정
    public void addItems(ArrayList<TotalItem> items){
        this.totalItems = items;
    }

    public TotalItem getItem(int position){
        return totalItems.get(position);
    }

    //ViewHolder class 정의
    static class ViewHolder extends  RecyclerView.ViewHolder{
        TextView textId;
        TextView textName;
        TextView textScore;

        public ViewHolder(View itemView){
            super(itemView);

            textId = (TextView) itemView.findViewById(R.id.total_id);
            textName = (TextView) itemView.findViewById(R.id.total_name);
            textScore = (TextView) itemView.findViewById(R.id.total_score);
        }

        //TotalItem 객체를 전달받아 ViewHolder 안에 있는 View에  데이터 설정하는 역할
        public void setItem(TotalItem item){
            textId.setText(item.getTotalId());
            textName.setText(item.getTotalName());
            textScore.setText(item.getTotalScore());
        }
    }
}
