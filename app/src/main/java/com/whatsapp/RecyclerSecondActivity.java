package com.whatsapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class RecyclerSecondActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] imageArray = {
            "https://i.pinimg.com/originals/3e/9d/91/3e9d915b1f5f4c48bebd0a6c424eed6b.gif",
            "https://cdn.dribbble.com/users/97014/screenshots/1838149/projector_icon.gif",
            "https://i.pinimg.com/originals/b6/27/39/b627391ed72a80e98fe10e80deef4e28.gif",
            "https://i.pinimg.com/originals/2b/e9/1e/2be91e2bb33dd1792b52398a1579e2b1.gif",
            "https://i.pinimg.com/originals/92/5f/25/925f25a0ac4c0d3d557fd0e778688e61.gif",
            "https://m.media-amazon.com/images/G/31/img22/Wearables/Noise/Ultrabuzz/Final/Teaser/Page/Mobile/1242-03.gif",
            "https://villman.com/product_photos/gif_416fv.gif",
            "https://i.pinimg.com/originals/54/00/a0/5400a0a4aee973bb6698c6eac356ff1c.gif"
    };

    String[] titleArray = {
            "Best Truewireless Headphones",
            "Projector",
            "Best Selling Mobile Speakers",
            "Fastrack Smartwatches",
            "Monitors",
            "Noise Smartwatches",
            "Sandisk Extreme Portable",
            "Printers"
    };

    String[] offerArray = {
            "Grab Now",
            "From ₹6990",
            "From ₹499*",
            "From ₹1,399",
            "From ₹7949",
            "From ₹1,099",
            "From ₹5,799",
            "From ₹2336"
    };
    String[] descArray = {
            "boAt, Oneplus & more",
            "Egate",
            "Sony, boAt & more",
            "Top Offers | BT Calling",
            "Lenovo",
            "Stylish Straps | Wide Selection",
            "External Solid State Drive",
            "Canon"
    };

    ArrayList<CustomList> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_second);

        recyclerView = findViewById(R.id.recycler_second);

        //recyclerView.setLayoutManager(new LinearLayoutManager(RecyclerSecondActivity.this));

        //recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));

        arrayList = new ArrayList<>();
        for(int i=0;i<titleArray.length;i++){
            CustomList list = new CustomList();
            list.setTitle(titleArray[i]);
            list.setOffer(offerArray[i]);
            list.setDesc(descArray[i]);
            list.setImage(imageArray[i]);
            arrayList.add(list);
        }
        RecyclerSecondAdapter adapter = new RecyclerSecondAdapter(RecyclerSecondActivity.this,arrayList);
        recyclerView.setAdapter(adapter);

    }
}