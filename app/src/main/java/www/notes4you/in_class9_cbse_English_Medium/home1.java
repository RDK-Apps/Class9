package www.notes4you.in_class9_cbse_English_Medium;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.navigation.NavigationView;

public class home1 extends AppCompatActivity {
     private DrawerLayout drawerLayout;
    private AdView mAdView;
     private ActionBarDrawerToggle actionBarDrawerToggle;
     private NavigationView navigationView;
     private Button maths,science,social_studies,english,hindi,sanskrit,PE,IT,maths_hindi_medium,science_hindi_medium,
             social_studies_hindi_medium,english_hindi_medium,hindi_hindi_medium,sanskrit_hindi_medium;
     private ScrollView scrollView1;
    private InterstitialAd mInterstitialAd;static int count=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home1);
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


            Toolbar toolbar=findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            drawerLayout=findViewById(R.id.drawer_layout);
            actionBarDrawerToggle=new ActionBarDrawerToggle(home1.this,drawerLayout,R.string.drawer_open,R.string.drawer_close);
            drawerLayout.addDrawerListener(actionBarDrawerToggle);
            actionBarDrawerToggle.syncState();
            navigationView=findViewById(R.id.navigation_view);
            View navView=navigationView.inflateHeaderView(R.layout.navigation_header);
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    userMenuSelected(menuItem);
                    return false;
                }
            });
            final ScrollView scrollView1=findViewById(R.id.scrollview1);
            maths=findViewById(R.id.maths);
            maths.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(home1.this,Mathematics_English_medium.class);
                    startActivity(intent);
                }
            });
            science=findViewById(R.id.science);
            science.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(home1.this,Science_English_Medium.class);
                    startActivity(intent);
                }
            });
            social_studies=findViewById(R.id.social_Studies);
            social_studies.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(home1.this,Social_Studies_English_Medium.class);
                    startActivity(intent);
                }
            });
            english=findViewById(R.id.english);
            english.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(home1.this,English_English_medium.class);
                    startActivity(intent);
                }
            });
            hindi=findViewById(R.id.hindi);
            hindi.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(home1.this,Hindi_English_medium.class);
                    startActivity(intent);
                }
            });
            sanskrit=findViewById(R.id.sanskrit);
            sanskrit.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(home1.this,Sanskrit_English_Medium.class);
                    startActivity(intent);
                }
            });
            PE=findViewById(R.id.PE);
            PE.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(home1.this,PE_English_Medium.class);
                    startActivity(intent);
                }
            });
            IT=findViewById(R.id.IT);
            IT.setOnClickListener(new View.OnClickListener() {
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
                    Intent intent=new Intent(home1.this,IT_English_Medium.class);
                    startActivity(intent);
                }
            });

        }
        else{
            Toast.makeText(this, "Internet Connection not found", Toast.LENGTH_SHORT).show();
            finish();
        }


        
    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Do You Really Want to Exit")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .show();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void userMenuSelected(MenuItem menuItem){
        switch(menuItem.getItemId())
        {
            case R.id.feedback:
                Intent feedbackIntent=new Intent(Intent.ACTION_SEND);
                feedbackIntent.setData(Uri.parse("mailto:"));
                feedbackIntent.setType("text/plain");
                feedbackIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"technical.rupu@gmail.com"});
                feedbackIntent.putExtra(Intent.EXTRA_SUBJECT,"feedback for class9 CBSE app");
                try {
                    startActivity(feedbackIntent.createChooser(feedbackIntent, "Please Select Email"));
                }
                catch(Exception e)
                {
                    Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.privacy_policy:
                Intent PrivacyPolicyIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/class9-cbse-app/privacy-policy"));
                startActivity(PrivacyPolicyIntent);
                break;
            case R.id.Rate:
                Intent BrowserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=www.notes4you.in_class9_cbse_English_Medium"));
                startActivity(BrowserIntent);
                break;
            case R.id.Share:
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id=www.notes4you.in_class9_cbse_English_Medium");
                intent.setType("text/plain");
                startActivity(intent.createChooser(intent,"share via"));
                break;
            case R.id.More_Apps:
                Intent MoreAppsIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=8668090025889530288"));
                startActivity(MoreAppsIntent);
                break;
        }


    }
}
