package com.ecom.WooW.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.ecom.WooW.R;
import com.ecom.WooW.views.activities.UserMainActivityPOJO;

import java.util.ArrayList;

public class UserMainActivityAdapter extends RecyclerView.Adapter<UserMainActivityAdapter.UserMainActivityVH> {

    ArrayList<UserMainActivityPOJO> userMainActivityPOJOArrayList;
    Context context;

    public UserMainActivityAdapter(ArrayList<UserMainActivityPOJO> userMainActivityPOJOArrayList, Context context) {
        this.userMainActivityPOJOArrayList = userMainActivityPOJOArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public UserMainActivityAdapter.UserMainActivityVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserMainActivityVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_business_user,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserMainActivityAdapter.UserMainActivityVH holder, int position) {
        holder.populate(userMainActivityPOJOArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return userMainActivityPOJOArrayList.size();
    }

    public class UserMainActivityVH extends RecyclerView.ViewHolder {
        TextView BName,BDesc;
        ImageView BLogo;
        public UserMainActivityVH(@NonNull View itemView) {
            super(itemView);
            BName=itemView.findViewById(R.id.BusName);
            BDesc=itemView.findViewById(R.id.BusDesc);
            BLogo=itemView.findViewById(R.id.business_Logo);
        }

        public void populate(UserMainActivityPOJO userMainActivityPOJO) {
            BName.setText(userMainActivityPOJO.getBusinessName());
            BDesc.setText(userMainActivityPOJO.getBusinessDesc());
            Glide.with(context).load(userMainActivityPOJO.getImgLogoUrl()).into(BLogo);
        }
    }
}
