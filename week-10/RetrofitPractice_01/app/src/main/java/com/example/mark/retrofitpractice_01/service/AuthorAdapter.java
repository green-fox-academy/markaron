package com.example.mark.retrofitpractice_01.service;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mark.retrofitpractice_01.MoreInfoActivity;
import com.example.mark.retrofitpractice_01.R;
import com.example.mark.retrofitpractice_01.model.Docs;
import com.example.mark.retrofitpractice_01.model.WorksByAuthor;

import java.lang.reflect.Field;

public class AuthorAdapter extends RecyclerView.Adapter<AuthorAdapter.MyViewHolder> {

  private WorksByAuthor worksByAuthor;

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
  public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
    Docs docs = worksByAuthor.getDocsList().get(position);
    holder.bookTitle.setText(docs.getTitle_suggest());
    holder.bookAuthor.setText(docs.getAuthor_name().get(0).toString());

    holder.infoButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), MoreInfoActivity.class);
        Bundle extras = new Bundle();

        if (worksByAuthor.getDocsList().get(position).getSubject().size() == 0) {
          extras.putString("infoOne", "book has no subject");
        } else {
          extras.putString("infoOne", worksByAuthor.getDocsList().get(position).getSubject().get(0));
        }


        if (worksByAuthor.getDocsList().get(position).getLanguage().size() == 0) {
          extras.putString("infoThree", "book has no language info");
        } else {
          extras.putString("infoThree", worksByAuthor.getDocsList().get(position).getLanguage().get(0));
        }

        extras.putInt("infoTwo", worksByAuthor.getDocsList().get(position).getFirst_publish_year());


        intent.putExtras(extras);
        v.getContext().startActivity(intent);
      }
    });
  }

  @Override
  public int getItemCount() {
    return worksByAuthor.getDocsList().size();
  }

  public static class MyViewHolder extends RecyclerView.ViewHolder {
    TextView bookTitle;
    TextView bookAuthor;
    Button infoButton;

    public MyViewHolder(View itemView) {
      super(itemView);
      bookTitle = itemView.findViewById(R.id.bookTitle);
      bookAuthor = itemView.findViewById(R.id.authorName);
      infoButton = itemView.findViewById(R.id.buttonMoreInfo);
    }
  }

  public boolean fieldCheck(Object object, String fieldName) {
    Class<?> objectClass = object.getClass();
    for (Field field : objectClass.getFields()) {
      if (field.getName().equals(fieldName)) {
        return true;
      }
    }
    return false;
  }
}
