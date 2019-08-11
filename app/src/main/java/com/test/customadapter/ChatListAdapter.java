package com.test.customadapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ChatListAdapter extends RecyclerView.Adapter<ChatListAdapter.MyViewHolder> {

    private List<ChatModel> list;

    public ChatListAdapter(List<ChatModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.item_for_chat_list, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        ChatModel chatModel = list.get(i);

        myViewHolder.imageView.setImageResource(chatModel.getImage());
        myViewHolder.textViewMessage.setText(chatModel.getMessage());
        myViewHolder.textViewUsername.setText(chatModel.getUsername());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewUsername, textViewMessage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewUsername = itemView.findViewById(R.id.textView_username);
            textViewMessage = itemView.findViewById(R.id.textView_message);
        }
    }
}


