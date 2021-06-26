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

public class History_enlish_medium extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;static int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_enlish_medium);
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
                    Intent intent=new Intent(History_enlish_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1tVM_06lCxMblpGVI1mG9B6ZPaZStxy8J/view?usp=sharing");
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
                    Intent intent=new Intent(History_enlish_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1CHfmpkinDNFzT7wSQpR4UWgMEYsJiASq/view?usp=sharing");
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
                    Intent intent=new Intent(History_enlish_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/16tUyzHUqcxDOyal6YcQblMrsFvLGK-TD/view?usp=sharing");
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
                    Intent intent=new Intent(History_enlish_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1R5rbx-CRdDtzFmrxp43eo0OD6F1YYiEO/view?usp=sharing");
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
                    Intent intent=new Intent(History_enlish_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1AiUk0PxX7II1HbNUsaQ8EDYrQVglOLO8/view?usp=sharing");
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
                    Intent intent=new Intent(History_enlish_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1zdI3WTJz1TwJqgIXRYAWvlKysPT12OJI/view?usp=sharing");
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
                    Intent intent=new Intent(History_enlish_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1v-v_LuF6wo-0-bj_9iPBNL6xZRTT-ovy/view?usp=sharing");
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
                    Intent intent=new Intent(History_enlish_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1cNA5vtHlcQBchrLcMlTxgzO11smqHaK4/view?usp=sharing");
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