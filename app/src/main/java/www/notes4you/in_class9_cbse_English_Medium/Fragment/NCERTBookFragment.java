package www.notes4you.in_class9_cbse_English_Medium.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import www.notes4you.in_class9_cbse_English_Medium.Adapter.BookAdapter;
import www.notes4you.in_class9_cbse_English_Medium.Adapter.SubjectAdapter;
import www.notes4you.in_class9_cbse_English_Medium.R;


public class NCERTBookFragment extends Fragment {
        RecyclerView BookRecyclerView;
        String Resourse;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_ncert_book, container, false);
        BookRecyclerView=view.findViewById(R.id.subjects_recyclerview);
        Resourse= getActivity().getIntent().getStringExtra("RESOURSE");
        BookAdapter bookAdapter=new BookAdapter(Resourse);
        BookRecyclerView.setAdapter(bookAdapter);
        return  view;
    }
}