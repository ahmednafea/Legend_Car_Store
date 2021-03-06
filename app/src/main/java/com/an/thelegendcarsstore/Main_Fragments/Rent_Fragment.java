package com.an.thelegendcarsstore.Main_Fragments;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.an.thelegendcarsstore.Models.Administration;
import com.an.thelegendcarsstore.Models.Vehicle;
import com.an.thelegendcarsstore.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Rent_Fragment extends Fragment {
    private RecyclerView recyclerView;
    private StoreAdapter mAdapter;
    private ArrayList<Vehicle> Rentable_Vehicle;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Rentable_Vehicle=new ArrayList<>();
    }
    private void fillRecycler(){
        Rentable_Vehicle.addAll(Administration.getRentableVehicles());
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rent, container, false);
        recyclerView = view.findViewById(R.id.Rent_recycle);
        mAdapter = new StoreAdapter(getActivity(), Rentable_Vehicle);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 3);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(8), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        recyclerView.setNestedScrollingEnabled(false);
        return view;
    }

    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

    class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.MyViewHolder> {
        Context context;
        ArrayList<Vehicle> vehicles;
        void setPlatforms(ArrayList<Vehicle> vehicles) {
            this.vehicles =vehicles;
        }

        class MyViewHolder extends RecyclerView.ViewHolder {
            ImageView image;
            TextView name,detail;
            MyViewHolder(View view) {
                super(view);
                image = view.findViewById(R.id.item_card_img);
                name = view.findViewById(R.id.item_card_name);
                detail = view.findViewById(R.id.item_card_detail);
            }
        }
        StoreAdapter(Context mainActivityContacts, ArrayList<Vehicle> vehicles) {
            this.vehicles =vehicles;
            this.context = mainActivityContacts;
        }
        @Override
        public StoreAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_card, parent, false);
            return new StoreAdapter.MyViewHolder(itemView);
        }
        @Override
        public void onBindViewHolder(final StoreAdapter.MyViewHolder holder, int position) {
            final Vehicle vehicle = vehicles.get(position);
            holder.name.setText(vehicle.getFullName());
            holder.detail.setText(String.valueOf(vehicle.getPrice())+" L.E");
            Glide.with(context)
                    .load(vehicle.getVehicle_Image())
                    .into(holder.image);
        }
        @Override
        public int getItemCount() {
            return vehicles.size();
        }
    }

}
