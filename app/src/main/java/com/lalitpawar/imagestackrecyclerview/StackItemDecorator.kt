package com.lalitpawar.imagestackrecyclerview

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class StackItemDecorator(val space : Int) :  RecyclerView.ItemDecoration(){
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        var position: Int = parent.getChildAdapterPosition(view)
        if(position!=0)
            outRect.left = space
    }
}