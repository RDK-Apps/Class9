package www.notes4you.in_class9_cbse_English_Medium.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import www.notes4you.in_class9_cbse_English_Medium.Adapter.SubjectAdapter;
import www.notes4you.in_class9_cbse_English_Medium.R;
import www.notes4you.in_class9_cbse_English_Medium.SubjectActivity;

public class HomeFragment extends Fragment {

    RecyclerView SubjectRecyclerview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_home, container, false);
        SubjectRecyclerview=view.findViewById(R.id.subjects_recyclerview);
        SubjectAdapter subjectAdapter=new SubjectAdapter(getString(R.string.AllResourse));
        SubjectRecyclerview.setAdapter(subjectAdapter);

        Button btn_NCERT_books=view.findViewById(R.id.btn_NCERT_Books);
        Button btn_videos_Lectures=view.findViewById(R.id.btn_video_Lectures);
        Button btn_NCERT_Solutions=view.findViewById(R.id.btn_NCERT_Solutions);
        Button btn_SamplePapers=view.findViewById(R.id.SamplePapers);
        btn_NCERT_books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getContext(), SubjectActivity.class);
                intent.putExtra("RESOURSE",getString(R.string.Books));
                startActivity(intent);
            }
        });
        btn_videos_Lectures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getContext(), SubjectActivity.class);
                intent.putExtra("RESOURSE",getString(R.string.VideoLectures));
                startActivity(intent);
            }
        });
        btn_NCERT_Solutions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getContext(), SubjectActivity.class);
                intent.putExtra("RESOURSE",getString(R.string.Solutions));
                startActivity(intent);
            }
        });
        btn_SamplePapers.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getContext(), SubjectActivity.class);
                intent.putExtra("RESOURSE",getString(R.string.SamplePapers));
                startActivity(intent);
            }
        });
        Button About_csvtu= view.findViewById(R.id.about_csvtu);
        About_csvtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://csvtu.ac.in");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                if (intent.resolveActivity(v.getContext().getPackageManager()) != null) {
                    v.getContext().startActivity(intent);
                }
            }
        });

        return view;
    }

}