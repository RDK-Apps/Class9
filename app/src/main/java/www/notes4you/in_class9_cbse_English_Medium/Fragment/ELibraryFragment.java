package www.notes4you.in_class9_cbse_English_Medium.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import www.notes4you.in_class9_cbse_English_Medium.R;

public class ELibraryFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_elibrary, container, false);
        return view;
    }
}
