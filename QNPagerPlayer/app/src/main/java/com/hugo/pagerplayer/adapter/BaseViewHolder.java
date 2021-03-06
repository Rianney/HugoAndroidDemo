package com.hugo.pagerplayer.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * <p/>
 * 通用的ViewHolder
 * 与BaseListAdapter配合使用
 */
public class BaseViewHolder {
    private SparseArray<View> mViews;
    private int position;

    private View convertView;

    private int resId;

    public int getResId() {
        return resId;
    }

    public BaseViewHolder(Context context, ViewGroup parent, int layoutId, int position) {
        this.position = position;
        this.resId = layoutId;
        mViews = new SparseArray<>();
        convertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        convertView.setTag(this);
    }

    public static BaseViewHolder getViewHolder(Context context, View convertView,
                                               ViewGroup parent, int layoutId, int position) {

        if (convertView == null) {
            return new BaseViewHolder(context, parent, layoutId, position);
        } else {
            BaseViewHolder holder = (BaseViewHolder) convertView.getTag();
            holder.position = position;
            return holder;
        }

    }

    public <T extends View> T getView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = convertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }

    public View getConvertView() {
        return convertView;
    }

    public void setConvertView(View convertView) {
        this.convertView = convertView;
        convertView.setTag(this);
    }

    public int getPosition() {
        return position;
    }

}
