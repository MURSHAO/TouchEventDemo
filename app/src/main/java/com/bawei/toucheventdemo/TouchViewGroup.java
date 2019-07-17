package com.bawei.toucheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class TouchViewGroup extends RelativeLayout {
    private static final String TAG = "TouchEventUtils";

    public TouchViewGroup(Context context) {
        super(context);
    }

    public TouchViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG,TouchEventUtils.log("dispatchTouchEvent:"+TouchViewGroup.class.getSimpleName(),ev));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG,TouchEventUtils.log("onInterceptTouchEvent:"+TouchViewGroup.class.getSimpleName(),ev));

        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,TouchEventUtils.log("onTouchEvent:"+TouchViewGroup.class.getSimpleName(),event));

        return true;
    }
}
