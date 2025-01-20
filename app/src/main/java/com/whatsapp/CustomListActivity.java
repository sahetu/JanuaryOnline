package com.whatsapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomListActivity extends AppCompatActivity {

    ListView listView;

    String[] imageArray = {
            "https://rukminim2.flixcart.com/image/200/200/l58iaa80/headphone/k/z/m/nord-buds-ce-oneplus-original-imagfyk4hyvgg6ze.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/xif0q/projector/t/8/2/i9-pro-max-10-e03i31-led-projector-egate-original-imah6ccyjchzmzyg.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/kcf4lu80/speaker/mobile-tablet-speaker/h/u/f/srs-xb23-sony-original-imaftk66vjxp86h5.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/xif0q/smartwatch/5/v/s/-original-imagxrhetgfuebnn.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/l4x2rgw0/monitor/n/y/y/q24i-20-full-hd-23-8-66eegac3in-lenovo-original-imagfpgxzsk8ef26.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/kz1lle80/smartwatch/m/f/q/-original-imagb54tb6fpurze.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/kpsnzww0/external-hard-drive/ssd/t/9/7/portable-ssd-sdssde30-1t00-g25-sandisk-original-imag3xx564jxpgrb.jpeg?q=70",
            "https://rukminim2.flixcart.com/image/200/200/xif0q/printer/s/8/d/-original-imafkykednshkhx5.jpeg?q=70"
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        listView = findViewById(R.id.custom_list);

        CustomListAdapter adapter = new CustomListAdapter(CustomListActivity.this,imageArray,titleArray,offerArray,descArray);
        listView.setAdapter(adapter);

    }
}