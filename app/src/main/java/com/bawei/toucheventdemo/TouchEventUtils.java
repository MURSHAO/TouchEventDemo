package com.bawei.toucheventdemo;

import android.view.MotionEvent;

public class TouchEventUtils {
    public static String log(String name, MotionEvent event){

        String actionName = name+"-------------------->";
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:

                actionName+="action down";

                break;
            case  MotionEvent.ACTION_MOVE:
                actionName +="action move";

                break;
            case  MotionEvent.ACTION_UP:

                actionName +="action up";

                break;
            case  MotionEvent.ACTION_CANCEL:

                actionName +="action cancel";

                break;
        }

        return actionName;

    }
}
