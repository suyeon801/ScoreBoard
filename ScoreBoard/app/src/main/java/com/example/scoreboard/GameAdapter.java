package com.example.scoreboard;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder> {
    Context context;
    
    //각각의 Item을 보관
    ArrayList<GameItem> items = new ArrayList<GameItem>();

    public GameAdapter(ArrayList<GameItem> items) {  this.items = items;  }

    public GameAdapter(Context context) { this.context = context; }

    //새로 만든 ViewHolder 객체에 담아 반환
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        //LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.activity_game_list, parent, false);
        return new ViewHolder(itemView);
    }

    //ViewHolder를 데이터와 연결
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GameItem item = items.get(position);

        //화면에 데이터 담기
        holder.setItem(item);

        //아이템 클릭 이벤트
        holder.card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mPosition = holder.getAdapterPosition();
                Context context = v.getContext();

                Intent detailIntent = new Intent(context, GameMain.class);
                detailIntent.putExtra("name", items.get(mPosition).getName()); //GameName

                context.startActivity(detailIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //Item 추가
    public void addItem(GameItem item){
        items.add(item);
    }

    //한번에 Item 추가 설정
    public void addItems(ArrayList<GameItem> items){
        this.items = items;
    }

    public GameItem getItem(int position){
        return items.get(position);
    }

    //ViewHolder class 정의
    static class ViewHolder extends RecyclerView.ViewHolder{

        CardView card_view;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.game_name);
            card_view = itemView.findViewById(R.id.layout_container);
        }

        //GameItem 객체를 전달받아 ViewHolder 안에 있는 View에 데이터 설정하는 역할
        public void setItem(GameItem item){
            textView.setText(item.getName());
        }
    }
}
