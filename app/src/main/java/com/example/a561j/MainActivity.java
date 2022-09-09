package com.example.a561j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.a561j.Adapter.Rv1Adapter;
import com.example.a561j.Adapter.Rv2Adapter;
import com.example.a561j.Adapter.RvAdapter;
import com.example.a561j.Adapter.RvAdapter3;
import com.example.a561j.Adapter.RvAdapter4;
import com.example.a561j.Models.ItemRv;
import com.example.a561j.Models.ItemRv1;
import com.example.a561j.Models.ItemRv2;
import com.example.a561j.Models.ItemRv3;
import com.example.a561j.Models.ItemRv4;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initViews1();
        initViews2();
        initViews3();
        initViews4();
    }

    void initViews(){
        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        refreshAdapter(getAllChats());
    }

    void refreshAdapter(ArrayList<ItemRv> chats){
        RvAdapter adapter = new RvAdapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    ArrayList<ItemRv> getAllChats() {
        ArrayList<ItemRv> chats = new ArrayList<>();

        chats.add(new ItemRv(R.drawable.oculus, "Oculus"));
        chats.add(new ItemRv(R.drawable.sneakers, "Sneakers"));
        chats.add(new ItemRv(R.drawable.bot, "Boots"));
        chats.add(new ItemRv(R.drawable.shoes, "Shoes"));
        chats.add(new ItemRv(R.drawable.bot, "Boots"));
        chats.add(new ItemRv(R.drawable.shoes, "Shoes"));

        return chats;
    }

    void initViews2(){
        recyclerView = findViewById(R.id.rv2);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        refreshAdapter2(getAllChats2());
    }

    void refreshAdapter2(ArrayList<ItemRv2> chats){
        Rv2Adapter adapter = new Rv2Adapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    ArrayList<ItemRv2> getAllChats2() {
        ArrayList<ItemRv2> chats = new ArrayList<>();

        chats.add(new ItemRv2(R.drawable.sneakers));
        chats.add(new ItemRv2(R.drawable.socks));
        chats.add(new ItemRv2(R.drawable.oculus));
        chats.add(new ItemRv2(R.drawable.shoes));

        return chats;
    }

    void initViews1(){
        recyclerView = findViewById(R.id.rv1);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        refreshAdapter1(getAllChats1());
    }

    void refreshAdapter1(ArrayList<ItemRv1> chats){
        Rv1Adapter adapter = new Rv1Adapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    ArrayList<ItemRv1> getAllChats1() {
        ArrayList<ItemRv1> chats = new ArrayList<>();

        chats.add(new ItemRv1(R.drawable.oculus));
        chats.add(new ItemRv1(R.drawable.shoes));
        chats.add(new ItemRv1(R.drawable.sneakers));
        chats.add(new ItemRv1(R.drawable.socks));

        return chats;
    }

    void initViews3(){
        recyclerView = findViewById(R.id.rv3);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1 ));

        refreshAdapter3(getAllChats3());
    }

    void refreshAdapter3(ArrayList<ItemRv3> chats){
        RvAdapter3 adapter = new RvAdapter3(this, chats);
        recyclerView.setAdapter(adapter);
    }

    ArrayList<ItemRv3> getAllChats3() {
        ArrayList<ItemRv3> chats = new ArrayList<>();

        chats.add(new ItemRv3(R.drawable.oculus, "Chika Chika Boom Boom", "4", "59","$7.99"));
        chats.add(new ItemRv3(R.drawable.socks  , "Clean Code", "25", "60",""));
        chats.add(new ItemRv3(R.drawable.sneakers, "Pattern Architecture", "30", "10", "$80.05"));

        return chats;
    }

    void initViews4(){
        recyclerView = findViewById(R.id.rv4);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        refreshAdapter4(getAllChats4());
    }

    void refreshAdapter4(ArrayList<ItemRv4> chats){
        RvAdapter4 adapter = new RvAdapter4(this, chats);
        recyclerView.setAdapter(adapter);
    }

    ArrayList<ItemRv4> getAllChats4() {
        ArrayList<ItemRv4> chats = new ArrayList<>();

        chats.add(new ItemRv4(R.drawable.oculus, "Beauty"));
        chats.add(new ItemRv4(R.drawable.sneakers, "Home and Kitchen"));
        chats.add(new ItemRv4(R.drawable.shoes, "Sports and Outdoors"));
        chats.add(new ItemRv4(R.drawable.street, "Electronics"));
        chats.add(new ItemRv4(R.drawable.book, "Outdoor clothing"));
        chats.add(new ItemRv4(R.drawable.socks, "Pet Supplies"));
        return chats;
    }
}