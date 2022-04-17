package com.techlead.mytrip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.techlead.mytrip.adapter.RecentAdapter;
import com.techlead.mytrip.model.RecentData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecentAdapter recentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecentData> recentDataList = new ArrayList<>();
        recentDataList.add(new RecentData("AM Lake","India","From $ 200", R.drawable.recentimage1));
        recentDataList.add(new RecentData("AM Lake","India","From $ 200", R.drawable.recentimage2));
        recentDataList.add(new RecentData("AM Lake","India","From $ 200", R.drawable.recentimage1));
        recentDataList.add(new RecentData("AM Lake","India","From $ 200", R.drawable.recentimage2));
        recentDataList.add(new RecentData("AM Lake","India","From $ 200", R.drawable.recentimage1));
        recentDataList.add(new RecentData("AM Lake","India","From $ 200", R.drawable.recentimage2));
        setRecyclerView(recentDataList);
    }

    private void setRecyclerView(List<RecentData> recentDataList){
        recyclerView = findViewById(R.id.recent_view_cycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recentAdapter = new RecentAdapter(this,recentDataList);
        recyclerView.setAdapter(recentAdapter);

    }

}