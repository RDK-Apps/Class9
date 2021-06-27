package www.notes4you.in_class9_cbse_English_Medium;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;

import www.notes4you.in_class9_cbse_English_Medium.Fragment.AllResourceFragment;
import www.notes4you.in_class9_cbse_English_Medium.Fragment.NCERTBookFragment;
import www.notes4you.in_class9_cbse_English_Medium.Fragment.NCERTSolutionsFragment;
import www.notes4you.in_class9_cbse_English_Medium.Fragment.SamplePaperFragment;
import www.notes4you.in_class9_cbse_English_Medium.Fragment.SyllabusFragment;
import www.notes4you.in_class9_cbse_English_Medium.Fragment.VideoLectureFragment;

public class SubActivity extends AppCompatActivity {

    @SuppressLint("UseSupportActionBar")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Toolbar toolbar=findViewById(R.id.toolbar);

        String Resourse=getIntent().getStringExtra("RESOURSE");
        String Sid=getIntent().getStringExtra("SID");
        String SName=getIntent().getStringExtra("SNAME");
        Fragment fragment=null;
        switch(Resourse)
        {
            case "SYLLABUS":
                toolbar.setTitle("Syllabus");
                fragment=new SyllabusFragment();
                break;
            case "Books":
                toolbar.setTitle(Resourse);
                fragment=new NCERTBookFragment();
                break;
            case "Video Lectures":
                toolbar.setTitle(Resourse);
                fragment=new VideoLectureFragment();
                break;
            case "NCERT Solutions":
                toolbar.setTitle(Resourse);
                fragment=new NCERTSolutionsFragment();
                break;
            case "Sample Papers":
                toolbar.setTitle(Resourse);
                fragment=new SamplePaperFragment();
                break;
            default:
                toolbar.setTitle("All Study Materials");
                fragment=new AllResourceFragment();
                break;
        }

        setActionBar(toolbar);
        loadfragment(fragment);

    }

    private void loadfragment(Fragment fragmnet) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame,fragmnet)
                .commit();
    }
}