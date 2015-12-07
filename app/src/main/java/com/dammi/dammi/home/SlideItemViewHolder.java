package com.dammi.dammi.home;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.slider.library.SliderLayout;
import com.dammi.dammi.R;
import com.dammi.dammi.activitylist.ListActivity;
import com.dammi.dammi.search.SearchableActivity;

/**
 * Created by script on 11/25/15.
 */
public class SlideItemViewHolder extends RecyclerView.ViewHolder
{
    SliderLayout sliderShow;
    private Context context;
    TextView textviewExperiences;
    public SlideItemViewHolder(View itemView)
    {
        super(itemView);
        sliderShow=(SliderLayout)itemView.findViewById(R.id.home_slider);
        context=itemView.getContext();


    }

    public SliderLayout getSliderShow()
    {
        return sliderShow;
    }

}
