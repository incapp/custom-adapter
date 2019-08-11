package com.test.customadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<ChatModel> chatList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        for (int i = 0; i < 10; i++) {
            chatList.add(new ChatModel(
                    R.drawable.ic_launcher_background, "User" + i, "Message" + i));
        }

//        chatList.add(new ChatModel("an","a"));
//        chatList.add(new ChatModel("an","a"));
//        chatList.add(new ChatModel("an","a"));
//        chatList.add(new ChatModel("an","a"));
//        chatList.add(new ChatModel("an","a"));

        ChatListAdapter chatListAdapter = new ChatListAdapter(chatList);

        recyclerView.setLayoutManager(new LinearLayoutManager(
                MainActivity.this,
                RecyclerView.VERTICAL,
                false
        ));

        recyclerView.addItemDecoration(new DividerItemDecoration(
                MainActivity.this,
                DividerItemDecoration.VERTICAL
        ));

        recyclerView.setAdapter(chatListAdapter);
    }
}
