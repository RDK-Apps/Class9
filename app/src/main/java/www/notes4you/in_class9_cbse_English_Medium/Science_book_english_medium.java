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

public class Science_book_english_medium extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;static int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.science_book_english_medium);
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1ioHMsQcEAGsVE2sVXHp9vSgGyv8SDqc9/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/15GHmbXDI-xEu-jFNrOOIhghT5bN7klcd/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1xYdSJv_dk0MlWtAVvSv_oAXbSrKjbQe6/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Cae5Z75X624O8WOsdHwUMZqGBUxnNVEJ/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1A13YxvyF0gEsejBKwPXhw6zMlBsMEQNq/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1ImfipsBn19drH55GVzWWrqzDg4gC1Fi1/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1QrJhDpCELef02WSJ6Y_WuLzS1tWYWvOD/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/12kdXkMnAqJewIESvZTZ31etZx_4UajZp/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1JdMUZT8HgHC67gqNqFzWULOBCflyyPKZ/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1cnbIGDTcpnOfis5RPylQI_HsbNbUem7N/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1zivZKT9G-YwHYvpdC-KdY_8QXyKmFlkN/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1ohg1g4pMganEmVGtAhUQQ2nRT7F8CSIE/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1SVzCIjK3GMRdUqyTMS84vOf7LjiCqxmU/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1_6kZKu33hJqYSKKn9hVqq4Pi6Vp436UN/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1thhrLUKKAITAkkxqzjHmMaUePLPgbMF6/view?usp=sharing");
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
                    Intent intent=new Intent(Science_book_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/13eLFz46gL9SyYvGiNA7dMbEAEbQppa42/view?usp=sharing");
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