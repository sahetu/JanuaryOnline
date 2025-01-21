package com.whatsapp;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class CustomSecondListActivity extends AppCompatActivity {

    GridView gridView;
    /*String[] imageArray = {
            "https://rukminim2.flixcart.com/image/200/200/l58iaa80/headphone/k/z/m/nord-buds-ce-oneplus-original-imagfyk4hyvgg6ze.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/xif0q/projector/t/8/2/i9-pro-max-10-e03i31-led-projector-egate-original-imah6ccyjchzmzyg.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/kcf4lu80/speaker/mobile-tablet-speaker/h/u/f/srs-xb23-sony-original-imaftk66vjxp86h5.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/xif0q/smartwatch/5/v/s/-original-imagxrhetgfuebnn.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/l4x2rgw0/monitor/n/y/y/q24i-20-full-hd-23-8-66eegac3in-lenovo-original-imagfpgxzsk8ef26.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/kz1lle80/smartwatch/m/f/q/-original-imagb54tb6fpurze.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/kpsnzww0/external-hard-drive/ssd/t/9/7/portable-ssd-sdssde30-1t00-g25-sandisk-original-imag3xx564jxpgrb.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/xif0q/printer/s/8/d/-original-imafkykednshkhx5.jpeg?q=70"
    };*/

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
        setContentView(R.layout.activity_custom_second_list);

        gridView = findViewById(R.id.custom_second_list);

        arrayList = new ArrayList<>();
        for(int i=0;i<imageArray.length;i++){
            CustomList list = new CustomList();
            list.setDesc(descArray[i]);
            list.setTitle(titleArray[i]);
            list.setOffer(offerArray[i]);
            list.setImage(imageArray[i]);
            arrayList.add(list);
        }
        CustomSecondAdapter adapter = new CustomSecondAdapter(CustomSecondListActivity.this,arrayList);
        gridView.setAdapter(adapter);

    }
}