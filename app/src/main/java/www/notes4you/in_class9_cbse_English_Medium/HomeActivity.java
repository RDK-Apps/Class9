package www.notes4you.in_class9_cbse_English_Medium;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import www.notes4you.in_class9_cbse_English_Medium.Fragment.ELibraryFragment;
import www.notes4you.in_class9_cbse_English_Medium.Fragment.HomeFragment;
import www.notes4you.in_class9_cbse_English_Medium.Fragment.SyllabusFragment;

public class HomeActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home1);
        ConnectivityManager cm =
                (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
        if(isConnected)
        {

            final Toolbar toolbar=findViewById(R.id.toolbar);
            setActionBar(toolbar);

            MeowBottomNavigation bottomNavigation = findViewById(R.id.bottom_navigation);

            bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_home));
            bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_syllabus));
            bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_elibrary));
            bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.ic_setting));

            bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
                @Override
                public void onShowItem(MeowBottomNavigation.Model item) {
                    Fragment fragment=null;
                    switch (item.getId())
                    {
                        case 1:
                            toolbar.setTitle("Home");
                            fragment=new HomeFragment();
                            break;
                        case 2:
                            toolbar.setTitle("Syllabus");
                            fragment=new SyllabusFragment();
                            break;
                        case 3:
                            toolbar.setTitle("ELibrary");
                            fragment=new ELibraryFragment();
                            break;
                        case 4:
//                            toolbar.setTitle("Settings");
//                            fragment=new SettingsFragment();
//                            break;
                        default:
                            toolbar.setTitle("Home");
                            fragment=new HomeFragment();
                            break;
                    }
                    layoutmanager(fragment);
                }
            });
            bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
                @Override
                public void onClickItem(MeowBottomNavigation.Model item) {

                }
            });
            bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
                @Override
                public void onReselectItem(MeowBottomNavigation.Model item) {

                }
            });
            bottomNavigation.show(1,true);

        }
        else{
            Toast.makeText(this, "Internet Connection not found", Toast.LENGTH_SHORT).show();
            finish();
        }


        
    }
    private void layoutmanager(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame,fragment)
                .commit();
    }
      @Override
       public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        return true;
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

}
