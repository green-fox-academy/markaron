package com.example.mark.retrofitpractice_01.service;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mark.retrofitpractice_01.R;

import java.util.ArrayList;

public class AdapterDemo extends RecyclerView.Adapter<AdapterDemo.MyViewHolder> {

  private ArrayList<String> list = new ArrayList<>();
  private Context context;

  class MyViewHolder extends RecyclerView.ViewHolder {
    private TextView bookTitle;

    MyViewHolder(View view) {
      super(view);
      bookTitle = itemView.findViewById(R.id.bookTitle);
      // TODO: 4/29/2018 add your code here
    }
  }

  public void insertItemInList(String beanChat) {
    if (list == null) list = new ArrayList<>();
    list.add(beanChat);
    notifyItemInserted(list.size() - 1);
  }


  public void insertItemsInList(ArrayList<String> myList) {
    if (list == null) list = new ArrayList<>();
    for (String beanChat : myList) {
      insertItemInList(beanChat);
    }
  }

  public ArrayList<String> getList() {
    if (list == null) list = new ArrayList<>();
    return list;
  }

  public void clearList() {
    if (list == null) return;
    list.clear();
    notifyDataSetChanged();
  }


  public AdapterDemo(Context context) {
    this.context = context;
  }

  @Override
  public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View itemView = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.author_row, parent, false);

    return new MyViewHolder(itemView);
  }

  @Override
  public void onBindViewHolder(MyViewHolder holder, int position) {
    String s = list.get(position);
    //holder.bookTitle.setText(worksByAuthor.getDocsList().get(position).getTitle_suggest());

    // TODO: 4/29/2018  your code here
  }

  @Override
  public int getItemCount() {
    if (list == null) list = new ArrayList<>();
    return list.size();
  }
}