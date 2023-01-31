package com.example.scoreboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    Context context;

    //각각의 item을 보관
    ArrayList<UserItem> items = new ArrayList<UserItem>();

    public UserAdapter(Context context) {   this.context = context;    }

    //새로 만든 ViewHolder 객체에 담아 반환
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.activity_user_recyclerview, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserItem item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {  return items.size();  }

    //Item 추가
    public void addItem(UserItem item){
        items.add(item);
    }

    //한번에 Item 추가 설정
    public void addItems(ArrayList<UserItem> items){
        this.items = items;
    }

    public UserItem getItem(int position){
        return items.get(position);
    }

    //ViewHolder class 정의
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textId;
        TextView textName;
        TextView textBirth;
        TextView textGender;

        public ViewHolder(View itemView) {
            super(itemView);

            textId = (TextView) itemView.findViewById(R.id.u_id);
            textName = (TextView) itemView.findViewById(R.id.u_name);
            textBirth = (TextView) itemView.findViewById(R.id.u_birth);
            textGender = (TextView) itemView.findViewById(R.id.u_gender);
        }

        //UserItem 객체를 전달받아 ViewHolder 안에 있는 View에 데이터 설정하는 역할
        public void setItem(UserItem item){
            textId.setText(item.getUserId());
            textName.setText(item.getUserName());
            textBirth.setText(item.getUserBirth());
            textGender.setText(item.getUserGender());
        }
    }
}
