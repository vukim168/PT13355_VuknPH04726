package com.pro1.vukn.englishforkids.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pro1.vukn.englishforkids.R;
import com.pro1.vukn.englishforkids.model.VideoYoutube;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Toan on 29/11/2017.
 */

public class VideoYoutubeAdapter extends BaseAdapter{
    private Context context;
    private int layout;
    private List<VideoYoutube> videoYoutubeList;

    public VideoYoutubeAdapter(Context context, int layout, List<VideoYoutube> videoYoutubeList) {
        this.context = context;
        this.layout = layout;
        this.videoYoutubeList = videoYoutubeList;
    }

    @Override
    public int getCount() {
        return videoYoutubeList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder{
        ImageView imvThumbnaul;
        TextView txtTitle;
    }
    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ViewHolder viewHolder;
        if (view == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            viewHolder.txtTitle = (TextView)view.findViewById(R.id.tvTitle);
            viewHolder.imvThumbnaul = (ImageView)view.findViewById(R.id.imvThumbnail);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        VideoYoutube video = videoYoutubeList.get(i);
        viewHolder.txtTitle.setText(video.getTitle());
        Picasso.with(context).load(video.getThumbnail()).into(viewHolder.imvThumbnaul);

        return view;
    }
}

