package com.jcodee.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.jcodee.utils.Constant;

/**
 * Created by johannfjs on 25/11/16.
 * Email: johann.jara@jcodee.com
 * Phone: (+51) 990870011
 */

public class TextViewCustom extends TextView {
    public TextViewCustom(Context context) {
        super(context);
        init(context);
    }

    public TextViewCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TextViewCustom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), Constant.FONT_WEATHER);
        setTypeface(typeface);
    }
}
