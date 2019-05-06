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

import com.an.thelegendcarsstore.R;

import java.util.ArrayList;

public class Categories_Fragment extends Fragment {
    private RecyclerView recyclerView;
    private StoreAdapter mAdapter;
    ArrayList<String> Categories_Name;
    ArrayList<Integer> Categories_Images;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categories, container, false);
        recyclerView = view.findViewById(R.id.Categories_recycle);
        Categories_Images=new ArrayList<>();
        Categories_Name=new ArrayList<>();
        Categories_Images.add(R.drawable.opener_car);
        Categories_Images.add(R.drawable.opener_truck);
        Categories_Images.add(R.drawable.opener_parts);
        Categories_Name.add("Cars");
        Categories_Name.add("Trucks");
        Categories_Name.add("Vehicles Parts");
        mAdapter = new StoreAdapter(getActivity(),Categories_Name,Categories_Images);
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
        ArrayList<String> Categories_Name;
        ArrayList<Integer> Categories_Images;
        void setPlatforms(ArrayList<String> categories_Name,ArrayList<Integer>categories_Images) {
            this.Categories_Name=categories_Name;
            this.Categories_Images=categories_Images;
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
        StoreAdapter(Context mainActivityContacts,ArrayList<String> categories_Name,ArrayList<Integer>categories_Images) {
            this.Categories_Name=categories_Name;
            this.Categories_Images=categories_Images;
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
            holder.name.setText(Categories_Name.get(position));
            holder.detail.setText(" ");
            holder.image.setImageResource(Categories_Images.get(position));
        }
        @Override
        public int getItemCount() {
            return Categories_Images.size();
        }
    }

}
