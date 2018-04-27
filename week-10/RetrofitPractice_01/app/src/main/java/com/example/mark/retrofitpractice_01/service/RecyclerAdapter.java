package com.example.mark.retrofitpractice_01.service;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mark.retrofitpractice_01.R;
import com.example.mark.retrofitpractice_01.model.Contact;
import com.example.mark.retrofitpractice_01.model.Work;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

  private List<Contact> contacts;
  private List<Work> works;

  public RecyclerAdapter (List<Work> works){
    this.works = works;
  }


  @Override
  public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
    return new MyViewHolder(view);
  }

  @Override
  public void onBindViewHolder(MyViewHolder holder, int position) {
    Work work = works.get(position);
    String authorName

    holder.name.setText(contacts.get(position).getName());
    holder.email.setText(contacts.get(position).getEmail());

  }

  @Override
  public int getItemCount() {
    return contacts.size();
  }

  public class MyViewHolder extends RecyclerView.ViewHolder{

    TextView name,email;

    public MyViewHolder (View itemView) {
      super(itemView);
      name = (TextView) itemView.findViewById(R.id.name);
      email = (TextView) itemView.findViewById(R.id.email);

    }
  }
}
