package www.notes4you.in_class9_cbse_English_Medium;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Maths_book_english_medium extends AppCompatActivity {
    private Toolbar toolbar;static int count=0;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maths_book_english_medium);
        ConnectivityManager cm =
                (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
        if(isConnected==true)
        {
            MobileAds.initialize(this, new OnInitializationCompleteListener() {
                @Override
                public void onInitializationComplete(InitializationStatus initializationStatus) {
                }
            });
            final AdView mAdView;
            //banner ads
            mAdView = findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);
            mAdView.setAdListener(new AdListener() {
                @Override
                public void onAdFailedToLoad(LoadAdError adError) {
                    AdRequest adRequest = new AdRequest.Builder().build();
                    mAdView.loadAd(adRequest);
                }
                @Override
                public void onAdClosed() {
                    AdRequest adRequest = new AdRequest.Builder().build();
                    mAdView.loadAd(adRequest);
                }
            });

            final intestitial i=new intestitial();
            //intestitial ads
            mInterstitialAd = new InterstitialAd(getApplicationContext());
            mInterstitialAd.setAdUnitId("ca-app-pub-1873084368980224/4445187486");
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
            mInterstitialAd.setAdListener(new AdListener() {

                @Override
                public void onAdFailedToLoad(LoadAdError adError) {
                    mInterstitialAd.setAdUnitId("ca-app-pub-1873084368980224/4445187486");
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                }


                @Override
                public void onAdClosed() {
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                }
            });
            toolbar=findViewById(R.id.toolbar1);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            Button unit1=findViewById(R.id.unit1);
            unit1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/10p1dBua6S5hZ6DZk7US90WzY97boW2gW/view?usp=sharing");
                    intent.putExtra("tittle","Unit 1: Number System");
                    startActivity(intent);
                }
            });
            Button unit2=findViewById(R.id.unit2);
            unit2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1o6lzP3Xfvb3Uy8c6yrg8paKNwH3cs_Lv/view?usp=sharing");
                    intent.putExtra("tittle","Unit 2: Polynomials");
                    startActivity(intent);
                }
            });
            Button unit3=findViewById(R.id.unit3);
            unit3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1DJkbB8SUfbxQwrzR955n85zLtDiI1ZSq/view?usp=sharing");
                    intent.putExtra("tittle","Unit 3:Coordinate Geometry");
                    startActivity(intent);
                }
            });
            Button unit4=findViewById(R.id.unit4);
            unit4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1tcB-Bb2BKcP_QERBZ0z2UZF-dIE9W8jb/view?usp=sharing");
                    intent.putExtra("tittle","Unit 4: Linear Equations in Two Variables");
                    startActivity(intent);
                }
            });
            Button unit5=findViewById(R.id.unit5);
            unit5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1_dZC-uukfFs5SGHrhEyAHHPzrCPS6Fb-/view?usp=sharing");
                    intent.putExtra("tittle","Unit 5: Introduction To Euclid Geometry");
                    startActivity(intent);
                }
            });
            Button unit6=findViewById(R.id.unit6);
            unit6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1C6wMk1Et45FaUG32qNDvq4F1LEFxyxM1/view?usp=sharing");
                    intent.putExtra("tittle","Unit 6: Lines And Angles");
                    startActivity(intent);
                }
            });
            Button unit7=findViewById(R.id.unit7);
            unit7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/16yqO5_OYIBqNlQHO0Vu0hUccQ_JpNi0B/view?usp=sharing");
                    intent.putExtra("tittle","Unit 7: Triangles");
                    startActivity(intent);
                }
            });
            Button unit8=findViewById(R.id.unit8);
            unit8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1k-Zu6y-KCzxQKAcLT3mX2ZByJOwoqel5/view?usp=sharing");
                    intent.putExtra("tittle","Unit 8: Quadrilaterals");
                    startActivity(intent);
                }
            });
            Button unit9=findViewById(R.id.unit9);
            unit9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1BEvVBW_CKv5vChaMufFxmP4hCHSwockZ/view?usp=sharing");
                    intent.putExtra("tittle","Unit 9: Area Of Parallelogram And Triangles");
                    startActivity(intent);
                }
            });
            Button unit10=findViewById(R.id.unit10);
            unit10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1saVRcsj5g_Fbpzrk4XdeJlrWZ5mMiHiy/view?usp=sharing");
                    intent.putExtra("tittle","Unit 10: Circles");
                    startActivity(intent);
                }
            });
            Button unit11=findViewById(R.id.unit11);
            unit11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/19Pevn1kK1qnyHXiKJ9_TB1XQ5EOrmfR1/view?usp=sharing");
                    intent.putExtra("tittle","Unit 11: Construction");
                    startActivity(intent);
                }
            });
            Button unit12=findViewById(R.id.unit12);
            unit12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1RzdXch8nM1FuQX8cf4pxS5VyxjMYDii0/view?usp=sharing");
                    intent.putExtra("tittle","Unit 12: Herons's Formula");
                    startActivity(intent);
                }
            });
            Button unit13=findViewById(R.id.unit13);
            unit13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1WvlUW22l92mCWn6LQChOg4WdMTcUwhb1/view?usp=sharing");
                    intent.putExtra("tittle","Unit 13: Surface Are And Volumes");
                    startActivity(intent);
                }
            });
            Button unit14=findViewById(R.id.unit14);
            unit14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1a-xMcvzCvgIuV3QMDhddx5qNfNEzT1IA/view?usp=sharing");
                    intent.putExtra("tittle","Unit 14: Statistics");
                    startActivity(intent);
                }
            });
            Button unit15=findViewById(R.id.unit15);
            unit15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1lrynTtWLJ-At7JZvtenruQl-av6GuBN4/view?usp=sharing");
                    intent.putExtra("tittle","Unit 15: Probability");
                    startActivity(intent);
                }
            });
            Button unit16=findViewById(R.id.unit16);
            unit16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Tt1KJgk8yD5F824CACoSTxzDi6Oy0CZi/view?usp=sharing");
                    intent.putExtra("tittle","Unit 16: Answers");
                    startActivity(intent);
                }
            });
            Button unit17=findViewById(R.id.unit17);
            unit17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1RW3PKbiQlHJ6Buz9pkrHIvVgLl4RGANn/view?usp=sharing");
                    intent.putExtra("tittle","Unit 17: Appendix-1");
                    startActivity(intent);
                }
            });
            Button unit18=findViewById(R.id.unit18);
            unit18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(i.getCount()==5)
                    {
                        mInterstitialAd.show();
                        count=0;
                        i.setCount(count);
                    }
                    else{
                        i.setCount(count++);
                    }
                    Intent intent=new Intent(Maths_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1YF1Dzl5VkAeePJ5YEEjM-FqrQVHYSEyt/view?usp=sharing");
                    intent.putExtra("tittle","Unit 18: Appendix-2");
                    startActivity(intent);
                }
            });
        }
        else{
            Toast.makeText(this, "Internet Connection not found", Toast.LENGTH_SHORT).show();
            finish();
        }


    }
}