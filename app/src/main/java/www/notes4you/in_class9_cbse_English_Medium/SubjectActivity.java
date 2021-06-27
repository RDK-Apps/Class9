package www.notes4you.in_class9_cbse_English_Medium;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

import www.notes4you.in_class9_cbse_English_Medium.Adapter.SubjectAdapter;

public class SubjectActivity extends AppCompatActivity {
    RecyclerView SubjectRecyclerview;
    String Resourse;
    ProgressBar progressBar;
    RelativeLayout Progressbar_Layout;
   // private  AdView adView;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        Toolbar toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("Select Subject");
        setActionBar(toolbar);
        progressBar=findViewById(R.id.ProgressBar);
        Progressbar_Layout=findViewById(R.id.progressBar_layout);
        SubjectRecyclerview=findViewById(R.id.subjects_recyclerview);
        Resourse=getIntent().getStringExtra("RESOURSE");
        SubjectAdapter subjectAdapter=new SubjectAdapter(Resourse);
        SubjectRecyclerview.setAdapter(subjectAdapter);
    }
}