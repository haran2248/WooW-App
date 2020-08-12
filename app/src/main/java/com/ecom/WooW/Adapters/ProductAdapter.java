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
import com.ecom.WooW.views.activities.ProductPOJO;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductVH> {

    ArrayList<ProductPOJO> productPOJOArrayList;
    Context context;

    public ProductAdapter(ArrayList<ProductPOJO> productPOJOArrayList, Context context) {
        this.productPOJOArrayList = productPOJOArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductAdapter.ProductVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.add_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ProductVH holder, int position) {
        holder.populate(productPOJOArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return productPOJOArrayList.size();
    }

    public class ProductVH extends RecyclerView.ViewHolder {
        TextView ProductName,price,availabilty,expiry;
        ImageView pImg;
        public ProductVH(@NonNull View itemView) {
            super(itemView);
            ProductName=itemView.findViewById(R.id.pName);
            price=itemView.findViewById(R.id.pPrice);
            availabilty=itemView.findViewById(R.id.pAvail);
            pImg=itemView.findViewById(R.id.item_pic);
            expiry=itemView.findViewById(R.id.pExpiry);
        }

        public void populate(ProductPOJO productPOJO) {
            ProductName.setText(productPOJO.getProductName());
            price.setText(productPOJO.getProPrice());
            Glide.with(context).load(productPOJO.getImgUrl()).into(pImg);
            availabilty.setText(productPOJO.getAvailability());
            expiry.setText(productPOJO.getExpiry());
        }
    }
}
