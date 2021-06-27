package www.notes4you.in_class9_cbse_English_Medium.Adapter;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import www.notes4you.in_class9_cbse_English_Medium.R;

public class PdfAdapter extends BaseExpandableListAdapter {
//    ArrayList<Notes> list;
    ImageView arrow;String sName;
//
//    public PdfResourseAdapter(ArrayList<Notes> list, String sName) {
//        this.list=list;
//        this.sName=sName;
//    }

    @Override
    public int getGroupCount() {
        return 5;//list.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 5;//list.get(groupPosition).getSublist().size();

    }

    @Override
    public Object getGroup(int groupPosition) {
        return "";//list.get(groupPosition).getStatus();
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return "";//list.get(groupPosition).getSublist().get(childPosition).getTittle();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.group_item,parent,false);
        TextView textView=view.findViewById(R.id.textview1);
        TextView textView1=view.findViewById(R.id.textview2);
        textView1.setText(sName);
        ImageView logo=view.findViewById(R.id.logo);
        arrow=view.findViewById(R.id.arrow);
        logo.setImageDrawable(view.getResources().getDrawable(R.drawable.ic_folder));
        textView.setText(groupPosition+"");
        return view;
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.child_item,parent,false);

        TextView textView=view.findViewById(R.id.textview1);
        ImageView logo=view.findViewById(R.id.logo);
//        if(list.get(groupPosition).getSublist().size()>0)
//        {
//            arrow.setImageDrawable(view.getContext().getDrawable(R.drawable.ic_down));
//        }
//        else{
//            arrow.setImageDrawable(view.getContext().getDrawable(R.drawable.ic_right));
//        }
        logo.setImageDrawable(view.getResources().getDrawable(R.drawable.ic_pdf));
        textView.setText(getChild(groupPosition,childPosition).toString());
        LinearLayout ChildLayout=view.findViewById(R.id.child_layout);
        ChildLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(view.getContext(), PdfViwerActivity.class);
//                intent.putExtra("PdfTittle",list.get(groupPosition).getSublist().get(childPosition).getTittle());
//                intent.putExtra("PdfLink",list.get(groupPosition).getSublist().get(childPosition).getLink());
//                view.getContext().startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
