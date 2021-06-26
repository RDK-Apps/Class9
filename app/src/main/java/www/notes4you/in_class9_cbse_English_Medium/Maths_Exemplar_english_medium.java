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

public class Maths_Exemplar_english_medium extends AppCompatActivity {
    private Toolbar toolbar;static int count=0;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maths__exemplar_english_medium);
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1N2L6byK2lm1GxA5RToCRAClSHQxT78rp/view?usp=sharing");
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1ZLhrfSASIrBPyT0LZJNnZftMl3nMjcGy/view?usp=sharing");
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1pfu0EBdPc62rsnx6wktVLsp3JGF2M4WP/view?usp=sharing");
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1T2bIZ1u896XGfeP_O_GftD5oPcPzZXBU/view?usp=sharing");
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/15F-dCvaifUOR5-yN0gMsqQLUBSuXT-GH/view?usp=sharing");
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1FFkYi8_JDyl1-aJhs9GqbbQpb6jR2BrH/view?usp=sharing");
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1ekHlfsD1hOte1RgFIt1cxZ_xOGlJQiTK/view?usp=sharing");
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1BuZfVsh99ne5BqzE7Gk8G5-WAFffMrk_/view?usp=sharing");
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1nd8rapnrm_B2bLX2A_a97KU5ORVoWmu_/view?usp=sharing");
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1F8Gz7LVAWBCX4pf-R8oybGTOEj-IH2TK/view?usp=sharing");
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/15VYkgFqEcc65as2fWJRYqnMQ5WKg0mtD/view?usp=sharing");
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1eEif7QBSblsePZWMkNI9Lo2b3xjEzZy1/view?usp=sharing");
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1J8SWVzkruccDnX3ZV5_PyYzdwD9cZWqy/view?usp=sharing");
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
                    Intent intent=new Intent(Maths_Exemplar_english_medium.this,Webview.class);
                    intent.putExtra("url","https://drive.google.com/file/d/1ecwTUB389NkJdUk0Vqh_T8wvC_z-q-Az/view?usp=sharing");
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