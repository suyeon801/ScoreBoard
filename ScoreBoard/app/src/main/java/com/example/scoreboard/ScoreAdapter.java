package com.example.scoreboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ScoreAdapter extends RecyclerView.Adapter<ScoreAdapter.ViewHolder> {
    Context context;

    //각각의 item을 보관
    ArrayList<ScoreItem> scoreItems = new ArrayList<ScoreItem>();

    public ScoreAdapter(Context context) {  this.context = context;  }

    //새로 만든 ViewHolder 객체에 담아 반환
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.activity_score_recyclerview, parent, false);
        return new ScoreAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ScoreItem scoreItem = scoreItems.get(position);
        holder.setItem(scoreItem);
    }

    @Override
    public int getItemCount() {  return scoreItems.size();  }

    //Item 추가
    public void addItem(ScoreItem item){
        scoreItems.add(item);
    }

    //한번에 Item 추가 설정
    public void addItems(ArrayList<ScoreItem> scoreItems){
        this.scoreItems = scoreItems;
    }

    public ScoreItem getItem(int position){
        return scoreItems.get(position);
    }

    //ViewHolder class 정의
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textDate;
        TextView textUserA;
        TextView textScoreA;
        TextView textUserB;
        TextView textScoreB;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textDate = (TextView) itemView.findViewById(R.id.date);
            textUserA = (TextView) itemView.findViewById(R.id.uA_id);
            textScoreA = (TextView) itemView.findViewById(R.id.uA_score);
            textUserB = (TextView) itemView.findViewById(R.id.uB_id);
            textScoreB = (TextView) itemView.findViewById(R.id.uB_score);

        }

        //ScoreItem 객체를 전달받아 ViewHolder 안에 있는 View에 데이터 설정하는 역할
        public void setItem(ScoreItem item){
            textDate.setText(item.getDate());
            textUserA.setText(item.getUserA());
            textScoreA.setText(item.getScoreA());
            textScoreB.setText(item.getUserB());
            textScoreB.setText(item.getScoreB());
        }
    }
}
