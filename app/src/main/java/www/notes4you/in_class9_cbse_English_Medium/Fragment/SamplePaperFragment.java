package www.notes4you.in_class9_cbse_English_Medium.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;

import www.notes4you.in_class9_cbse_English_Medium.Adapter.PdfAdapter;
import www.notes4you.in_class9_cbse_English_Medium.R;


public class SamplePaperFragment extends Fragment {
    ExpandableListView expandableListView;
    RelativeLayout progressbar_layout;
    PdfAdapter pdfAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_resourse, container, false);
        expandableListView=view.findViewById(R.id.course_expandablelistview);
        progressbar_layout=view.findViewById(R.id.progressBar_layout);
        progressbar_layout.setVisibility(View.GONE);
        pdfAdapter=new PdfAdapter();
        expandableListView.setAdapter(pdfAdapter);
        return  view;
    }
}