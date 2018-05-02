package com.example.mark.retrofitpractice_01.service;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mark.retrofitpractice_01.R;
import com.example.mark.retrofitpractice_01.model.Docs;
import com.example.mark.retrofitpractice_01.model.Work;
import com.example.mark.retrofitpractice_01.model.WorksByAuthor;

import java.util.ArrayList;
import java.util.List;

public class AuthorAdapter extends RecyclerView.Adapter<AuthorAdapter.MyViewHolder> {

  private WorksByAuthor worksByAuthor;
  //private List<Docs> docsList;

  public AuthorAdapter() {
    worksByAuthor = new WorksByAuthor();
  }

  public AuthorAdapter(WorksByAuthor worksByAuthor) {
    this.worksByAuthor = worksByAuthor;
  }

  @NonNull
  @Override
  public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.author_row, parent, false);
    return new MyViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    Docs docs = worksByAuthor.getDocsList().get(position);
    holder.bookTitle.setText(docs.getTitle_suggest());
    holder.bookAuthor.setText(docs.getAuthor_name().get(0).toString());

  }

  @Override
  public int getItemCount() {
      return worksByAuthor.getDocsList().size();
  }


  public static class MyViewHolder extends RecyclerView.ViewHolder {
    TextView bookTitle;
    TextView bookAuthor;

    public MyViewHolder(View itemView) {
      super(itemView);
      bookTitle = itemView.findViewById(R.id.bookTitle);
      bookAuthor = itemView.findViewById(R.id.authorName);
    }
  }
}
