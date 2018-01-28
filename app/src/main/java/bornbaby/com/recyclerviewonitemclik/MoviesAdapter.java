package bornbaby.com.recyclerviewonitemclik;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by madhu on 28-Jan-18.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private ArrayList<MoviesModel> moviesList;
    private Context context;
    private OnItemClickListner onItemClickListner;

    public MoviesAdapter(Context context, ArrayList<MoviesModel> moviesList) {
        this.context = context;
        this.moviesList = moviesList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new MyViewHolder(view);
    }

    @SuppressLint("StaticFieldLeak")
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MoviesModel moviesModel = moviesList.get(position);
        holder.name.setText(moviesModel.getTitle());
        holder.tv_desc.setText(moviesModel.getDesc());
        Picasso.with(context).load(moviesModel.getImageSrc()).into(holder.iv_circle);

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView name, tv_desc;
        private ImageView iv_circle;


        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            name = itemView.findViewById(R.id.tv_title);
            tv_desc = itemView.findViewById(R.id.tv_desc);
            iv_circle = itemView.findViewById(R.id.iv_cicrle);

        }

        @Override
        public void onClick(View v) {
            if (onItemClickListner != null) {
                onItemClickListner.Click(getAdapterPosition(),v);

            }

        }
    }

    public void setOnItemClickListner(OnItemClickListner onItemClickListner) {
        this.onItemClickListner = onItemClickListner;

    }

    public OnItemClickListner getOnItemClickListner() {
        return onItemClickListner;
    }
}
