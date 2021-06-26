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

public class Social_Studies_English_Medium extends AppCompatActivity {
    Toolbar toolbar;
    private InterstitialAd mInterstitialAd;static int count=0;
    private Button Syllabus,Democratic_Politics,Contemporary_India,Economics,History,Sample_paper_1,Sample_paper_2,Sample_paper_3,Sample_paper_4,Sample_paper_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.social__studies_english_medium);
        ConnectivityManager cm =
                (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
        if(isConnected==true)
        {   MobileAds.initialize(this, new OnInitializationCompleteListener() {
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

            Syllabus=findViewById(R.id.syllabus);
            Syllabus.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(Social_Studies_English_Medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1x6l_7ZLxJxOAGgu2cQfWtqo9-6S56WR9/view?usp=sharing");
                    startActivity(intent);

                }
            });
            //books
            Democratic_Politics=findViewById(R.id.Democratic_politics);
            Democratic_Politics.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(Social_Studies_English_Medium.this,Democratic_politics_english_medium.class);
                    startActivity(intent);
                }
            });
            Contemporary_India=findViewById(R.id.contemporary_india);
            Contemporary_India.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(Social_Studies_English_Medium.this,Contemporary_India_english_medium.class);
                    startActivity(intent);
                }
            });
            Economics=findViewById(R.id.Economics);
            Economics.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(Social_Studies_English_Medium.this,Economics_english_medium.class);
                    startActivity(intent);
                }
            });
            History=findViewById(R.id.history);
            History.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(Social_Studies_English_Medium.this,History_enlish_medium.class);
                    startActivity(intent);
                }
            });
            //sample papers
            Sample_paper_1=findViewById(R.id.sample_paper_1);
            Sample_paper_1.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(Social_Studies_English_Medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1s8UQDisAvFuq294B4cNPD93-dr567yY6/view?usp=sharing");
                    startActivity(intent);

                }
            });
            Sample_paper_2=findViewById(R.id.sample_paper_2);
            Sample_paper_2.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(Social_Studies_English_Medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1tRspBQkzqmtfPSEYe8ZtO__Yg9FBpeZp/view?usp=sharing");
                    startActivity(intent);

                }
            });
            Sample_paper_3=findViewById(R.id.sample_paper_3);
            Sample_paper_3.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(Social_Studies_English_Medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1O7mIBZfEO43KvMQC_FMZ29ME_KmUZDMJ/view?usp=sharing");
                    startActivity(intent);

                }
            });
            Sample_paper_4=findViewById(R.id.sample_paper_4);
            Sample_paper_4.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(Social_Studies_English_Medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1o-yVWYwIR7UglOZ-7lJtMbHZ1qSzMsyZ/view?usp=sharing");
                    startActivity(intent);

                }
            });
            Sample_paper_5=findViewById(R.id.sample_paper_5);
            Sample_paper_5.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(Social_Studies_English_Medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1bxXaVxGyGIrU4BXJ_749u4lBnyo2szc5/view?usp=sharing");
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