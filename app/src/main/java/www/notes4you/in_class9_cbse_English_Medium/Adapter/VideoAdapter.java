package www.notes4you.in_class9_cbse_English_Medium.Adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import www.notes4you.in_class9_cbse_English_Medium.R;

public class VideoAdapter extends BaseExpandableListAdapter {


    //ArrayList<Notes> list;
  //  String Sname;
//    public VideoResourseAdapter(ArrayList<Notes> list, String Sname) {
//        this.list=list;
//        this.Sname=Sname;
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
        return "";//list.get(groupPosition).getUnit();
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
        textView1.setText("rupesh");
        ImageView logo=view.findViewById(R.id.logo);
        logo.setImageDrawable(view.getResources().getDrawable(R.drawable.ic_folder));
        textView.setText("video");
        return view;
    }


    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.child_item,parent,false);
        TextView textView=view.findViewById(R.id.textview1);
        ImageView logo=view.findViewById(R.id.logo);
        logo.setImageDrawable(view.getResources().getDrawable(R.drawable.ic_youtube));
        textView.setText("video");
        LinearLayout ChildLayout=view.findViewById(R.id.child_layout);
        ChildLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(view.getContext(), VideoPlayerActivity.class);
//                intent.putExtra("videoUrl",list.get(groupPosition).getSublist().get(childPosition).getLink());
//                intent.putExtra("SNAME",Sname);
//                intent.putExtra("VideoTittle",list.get(groupPosition).getSublist().get(childPosition).getTittle());
//                intent.putExtra("SubjectName",Sname);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
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
