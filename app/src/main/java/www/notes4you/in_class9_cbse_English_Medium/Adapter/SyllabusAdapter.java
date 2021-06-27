package www.notes4you.in_class9_cbse_English_Medium.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import www.notes4you.in_class9_cbse_English_Medium.R;

public class SyllabusAdapter extends RecyclerView.Adapter<SyllabusAdapter.ViewHolder> {
//    ArrayList<Syllabus> list;
//
//    public SyllabusResourseAdapter(ArrayList<Syllabus> list) {
//        this.list=list;
//    }

    @NonNull
    @Override
    public SyllabusAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.group_item2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SyllabusAdapter.ViewHolder holder, int position) {
        holder.SubjectName.setText(""+position);
      //  Glide.with(holder.itemView.getContext()).load(list.get(position).getBglink()).placeholder(R.drawable.logo).into(holder.bg);
        holder.group_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(v.getContext(), PdfViwerActivity.class);
//                intent.putExtra("PdfTittle",list.get(position).getSubjectName()+"  Syllabus");
//                intent.putExtra("PdfLink",list.get(position).getSyllabusLink());
//                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 5;//list.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        TextView SubjectName;
        LinearLayout group_layout;
        ImageView bg;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            SubjectName=itemView.findViewById(R.id.textview1);
            bg=itemView.findViewById(R.id.logo);
            group_layout=itemView.findViewById(R.id.group_layout);

        }
    }
}
