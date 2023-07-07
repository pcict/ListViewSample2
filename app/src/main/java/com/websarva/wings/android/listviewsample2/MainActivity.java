package com.websarva.wings.android.listviewsample2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListViewの取得
        ListView lvMenu = findViewById(R.id.lvMenu);
        //元データの準備
        List<String> menuList = new ArrayList<>();
        //配列構造を基にしたList

        //リストにデータを登録
        menuList.add("から揚げ定食");
        menuList.add("ハンバーグ定食");
        menuList.add("生姜焼き定食");
        menuList.add("ステーキ定食");
        menuList.add("野菜炒め定食");
        menuList.add("とんかつ定食");
        menuList.add("ミンチカツ定食");
        menuList.add("チキンカツ定食");
        menuList.add("コロッケ定食");
        menuList.add("回鍋肉定食");
        menuList.add("麻婆豆腐定食");
        menuList.add("青椒肉絲定食");
        menuList.add("焼き魚定食");
        menuList.add("焼肉定食");

        //アダプターを用意
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, menuList);
        lvMenu.setAdapter(adapter);

       // lvMenu.setOnItemClickListener(new ListItemClickListener());
    }
}