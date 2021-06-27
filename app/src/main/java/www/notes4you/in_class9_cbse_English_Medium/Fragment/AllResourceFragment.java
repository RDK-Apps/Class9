package www.notes4you.in_class9_cbse_English_Medium.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import www.notes4you.in_class9_cbse_English_Medium.R;
import www.notes4you.in_class9_cbse_English_Medium.SubActivity;


public class AllResourceFragment extends Fragment {
    LinearLayout syllabus_btn,Notes_btn,Videos_btn,Pyq_btn;
    String Sid;
    String Sname;
    RelativeLayout progressbar_layout;
//    public AllResourceFragment(String sid, String sName) {
//        this.Sid=sid;
//        this.Sname=sName;
//    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_all_resource, container, false);
        Notes_btn=view.findViewById(R.id.notes_btn);
        Videos_btn=view.findViewById(R.id.videos_btn);
        progressbar_layout=view.findViewById(R.id.progressBar_layout);
        progressbar_layout.setVisibility(View.GONE);
        Pyq_btn=view.findViewById(R.id.pyq_btn);
        Notes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), SubActivity.class);
                intent.putExtra("RESOURSE","Books");
                intent.putExtra("SID",Sid);
                intent.putExtra("SNAME",Sname);
                startActivity(intent);
            }
        });
        Videos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), SubActivity.class);
                intent.putExtra("RESOURSE","Video Lectures");
                intent.putExtra("SID",Sid);
                intent.putExtra("SNAME",Sname);
                startActivity(intent);
            }
        });
        Pyq_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), SubActivity.class);
                intent.putExtra("RESOURSE","Sample Papers");
                intent.putExtra("SID",Sid);
                intent.putExtra("SNAME",Sname);
                startActivity(intent);
            }
        });
        return view;
    }
}