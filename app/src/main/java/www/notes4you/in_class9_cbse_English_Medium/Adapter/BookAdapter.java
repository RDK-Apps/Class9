package www.notes4you.in_class9_cbse_English_Medium.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import www.notes4you.in_class9_cbse_English_Medium.R;
import www.notes4you.in_class9_cbse_English_Medium.SubActivity;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.viewHolder>{
    String resourse;

    public BookAdapter(String resourse)
    {
        this.resourse=resourse;
    }
    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.book_item, parent, false);
        return new viewHolder(view);
    }
    @Override
    public void onBindViewHolder(BookAdapter.viewHolder holder, final int position) {
        holder.Subject_Name.setText(position+"");
      //  Glide.with(holder.itemView.getContext()).load(list.get(position).getLink()).placeholder(R.drawable.logo).into(holder.subject_bg);
        holder.Subject_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(v.getContext(), SubActivity.class);
                intent.putExtra("RESOURSE",resourse);
                intent.putExtra("SID",position);
               intent.putExtra("SNAME",position+" name");
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public static class  viewHolder extends RecyclerView.ViewHolder
    {  LinearLayout Subject_layout;
        ImageView subject_bg;
        TextView Subject_Name;

        public viewHolder(View itemView) {
            super(itemView);
            Subject_layout=itemView.findViewById(R.id.subject_layout);
            subject_bg=itemView.findViewById(R.id.bg);
            Subject_Name=itemView.findViewById(R.id.subject_name);
        }
    }
}
