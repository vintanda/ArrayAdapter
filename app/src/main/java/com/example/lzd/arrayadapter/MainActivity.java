package com.example.lzd.arrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String>arr_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        //新建一个数据适配器
        //ArrayAdapter(上下文,当前ListView加载的每一个列表项所对应的布局文件,数据源)
        //适配器加载数据源
        String[]arr_data={"西邮移动应用开发实验室","如果字特别多会怎么办，是丢失后面的信息还是换行呢？试试试试试试试试","Android","We R A Family","MT音乐俱乐部","燥起来！","this is a test"};
        arr_adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr_data);
        //视图(ListView)加载适配器
        listView.setAdapter(arr_adapter);
    }
}
