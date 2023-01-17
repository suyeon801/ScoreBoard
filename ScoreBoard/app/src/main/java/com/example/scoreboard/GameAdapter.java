package com.example.scoreboard;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder> {
    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;

        //생성자
        public ViewHolder(@NonNull View itemView, TextView textView) {
            super(itemView);
            this.textView = textView;
        }

        //
    }
}
