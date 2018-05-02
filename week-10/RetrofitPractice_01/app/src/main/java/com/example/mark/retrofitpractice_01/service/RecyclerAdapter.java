package com.example.mark.retrofitpractice_01.service;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mark.retrofitpractice_01.R;
import com.example.mark.retrofitpractice_01.model.Contact;
import com.example.mark.retrofitpractice_01.model.Work;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

  private List<Contact> contacts;
  private List<Work> works;

  public RecyclerAdapter (){
    works = new ArrayList<>();
  }

  public void updateData(List<Work> works){
    this.works = works;
    notifyDataSetChanged();
  }


  @Override
  public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
    return new MyViewHolder(view);
  }

  @Override
  public void onBindViewHolder(MyViewHolder holder, int position) {
    Work work = works.get(position);
    String authorName;
    if(work.getAuthors().size() == 0) {
      authorName = "No author";
    } else {
      authorName = work.getAuthors().get(0).getName();
    }

    holder.title.setText(work.getTitle());
    holder.authorName.setText(authorName);

  }

  @Override
  public int getItemCount() {
    return works.size();
  }

  public class MyViewHolder extends RecyclerView.ViewHolder{

    TextView title,authorName;

    public MyViewHolder (View itemView) {
      super(itemView);
      title = (TextView) itemView.findViewById(R.id.name);
      authorName = (TextView) itemView.findViewById(R.id.email);

    }
  }
}
