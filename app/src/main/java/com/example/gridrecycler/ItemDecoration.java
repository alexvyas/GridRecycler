package com.example.gridrecycler;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class ItemDecoration extends RecyclerView.ItemDecoration {
    private final int spanCount;
    private final int spacing;

    private final boolean includeEdge;

    public ItemDecoration(int spanCount, int spacing, boolean includeEdge){
        this.includeEdge = includeEdge;
        this.spacing = spacing;
        this.spanCount = spanCount;
    }

    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state){

    }

}
