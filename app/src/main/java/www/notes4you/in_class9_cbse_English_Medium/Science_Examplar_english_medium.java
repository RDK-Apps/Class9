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

public class Science_Examplar_english_medium extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;static int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.science__examplar_english_medium);
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
            Toolbar toolbar=findViewById(R.id.toolbar1);
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1uWUrwCLLZZulyWsfWMQR-1uLnn6_rRb0/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/11by-qpYMGPZ59kJrFt0JvIiDaWslleQF/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1f9zenRdB_R68mIsyjP7QeF6zfKrHa8mB/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1S5-FYUA4zWBapRwd9ka7_TGBLLA7N9iV/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1KbVQST_QJGczFtVwKFw1uuAdhwHHCNo6/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1VrBCCBDFlEoPeiuooQUaX_yLuXQ8ycpo/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1JEEg_lEDErF3Mfd0QGx4jC16XFZO9fX-/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1DLPC9JaN7PQuyRh4wGLwOAgrbWgLywBz/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Lz_hVIHZjq93ow_qCorBuHNocuXujkoQ/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/19aHN4mY7tQWVBKxkD-rAixdpkEN268-w/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1PvH0FzZUPVzWU8AAGsiwwnQimjnG2TWH/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Nsh91dz8nI7hrmTl_kftRw5zqplFxtiE/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1glKdWzfnOPU8B_hRVLwBolEioJ9OqpMc/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1W6_6RvQsWjrJe4FFyUsjcdCjbxp56VIu/view?usp=sharing");
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
                    Intent intent=new Intent(Science_Examplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1O6OpFVxDO-vJT_6Hmt-Xjg7mvPC6fBtc/view?usp=sharing");
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