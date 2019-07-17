package com.bawei.toucheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class TouchView extends View {
    private static final String TAG = "TouchView";

    public TouchView(Context context) {
        super(context);
    }

    public TouchView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(TAG,TouchEventUtils.log("dispatchTouchEvent:"+TouchView.class.getSimpleName(),event));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,TouchEventUtils.log("onTouchEvent:"+TouchView.class.getSimpleName(),event));

        return super.onTouchEvent(event);
    }
}
