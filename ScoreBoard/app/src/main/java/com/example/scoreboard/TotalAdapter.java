package com.example.scoreboard;

import android.content.Context;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TotalAdapter extends RecyclerView.Adapter<TotalAdapter.ViewHolder>  {
    Context context;
    ArrayList<TotalItem> totalItems = new ArrayList<TotalItem>();

    //ViewHolder class 정의
    static class ViewHolder extends  RecyclerView.ViewHolder{
        TextView textId;
        TextView textName;
        TextView Score;
    }
}
