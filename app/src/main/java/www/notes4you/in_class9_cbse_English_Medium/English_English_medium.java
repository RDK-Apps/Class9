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

public class English_English_medium extends AppCompatActivity {
    Toolbar toolbar;
    private Button Syllabus,Beehive,Moments,Word_and_Expression,Sample_paper_1,Sample_paper_2,Sample_paper_3,Sample_paper_4,Sample_paper_5;
    private InterstitialAd mInterstitialAd;static int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english__english_medium);
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
                    Intent intent=new Intent(English_English_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1Kh9ULEXZEunikRMGURibt_bEXHCIAE9W/view?usp=sharing");
                    startActivity(intent);

                }
            });
            //books
            Beehive=findViewById(R.id.Beehive);
            Beehive.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(English_English_medium.this,Beehive_English_Medium.class);
                    startActivity(intent);
                }
            });
            Moments=findViewById(R.id.Moments);
            Moments.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(English_English_medium.this,Moments_english_medium.class);
                    startActivity(intent);
                }
            });
            Word_and_Expression=findViewById(R.id.Word_and_expression);
            Word_and_Expression.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(English_English_medium.this,Word_Expression_english_medium.class);
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
                    Intent intent=new Intent(English_English_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1zKNrqTZVSbGf4kRYgz1wG9x6-0fusFfV/view?usp=sharing");
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
                    Intent intent=new Intent(English_English_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1BrDySZvDjm3r-mZRudXQtS-EmEwvbxhC/view?usp=sharing");
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
                    Intent intent=new Intent(English_English_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1vh7pxXUarsv5E2aPLieoWZCTfhgdarPh/view?usp=sharing");
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
                    Intent intent=new Intent(English_English_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1db_lyqnSwMFaTsRmVP9HnhhmvG9eIBXh/view?usp=sharing");
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
                    Intent intent=new Intent(English_English_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1KB0dVraNpDjJtE8D8gOebc41AP4HdKAo/view?usp=sharing");
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