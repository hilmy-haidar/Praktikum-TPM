package com.fti.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AvengerAdapter extends RecyclerView.Adapter<AvengerAdapter.ViewHolder> {
    private Context context;
    private ArrayList<AvengerModel> avengerModels;

    public AvengerAdapter(ArrayList<AvengerModel> listData, Context context) {
        this.avengerModels = listData;
        this.context = context;
    }

    public ArrayList<AvengerModel> getAvengerModels() {
        return avengerModels;
    }

    public void setAvengerModels(ArrayList<AvengerModel> avengerModels) {
        this.avengerModels = avengerModels;
    }

    @NonNull
    @Override
    public AvengerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_avenger,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull AvengerAdapter.ViewHolder viewHolder, int i){
        Glide.with(context).load(getAvengerModels().get(i).getImageMotor()).into(viewHolder.ivThumbnailmotor);
        viewHolder.tvNameMotor.setText(getAvengerModels().get(i).getNameMotor());
        viewHolder.tvPriceMotor.setText(getAvengerModels().get(i).getPriceMotor());
        viewHolder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(context, DetailActivity.class);
                moveIntent.putExtra("nameMotor", getAvengerModels().get(i).getNameMotor());
                moveIntent.putExtra("imageMotor", getAvengerModels().get(i).getImageMotor());
                moveIntent.putExtra("descMotor", getAvengerModels().get(i).getDescMotor());
                moveIntent.putExtra("priceMotor", getAvengerModels().get(i).getPriceMotor());
                context.startActivity(moveIntent);
            }
        });

        viewHolder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                String shareSubject = getAvengerModels().get(i).getNameMotor();
                String shareBody = getAvengerModels().get(i).getNameMotor()+"\nHarga : Rp. "+ getAvengerModels().get(i).getPriceMotor()+"\n" + getAvengerModels().get(i).getDescMotor();
                share.putExtra(Intent.EXTRA_SUBJECT, shareSubject);
                share.putExtra(Intent.EXTRA_TEXT, shareBody);
                context.startActivity(Intent.createChooser(share, "Share Using"));
            }
        });
    }

    @Override
    public int getItemCount() {
        return getAvengerModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivThumbnailmotor;
        private TextView tvNameMotor,tvPriceMotor;
        private Button btnDetail, btnShare;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivThumbnailmotor = itemView.findViewById(R.id.ivImageMotor);
            tvNameMotor = itemView.findViewById(R.id.tvNameMotor);
            tvPriceMotor = itemView.findViewById(R.id.tvPriceMotor);
            btnDetail = itemView.findViewById(R.id.btnDetail);
            btnShare = itemView.findViewById(R.id.btnShare);
        }

    }
}
