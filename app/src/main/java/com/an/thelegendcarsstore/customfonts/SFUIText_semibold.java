package com.an.thelegendcarsstore.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class SFUIText_semibold extends android.support.v7.widget.AppCompatEditText {

    public SFUIText_semibold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public SFUIText_semibold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SFUIText_semibold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/sfuitext_semibold.ttf");
            setTypeface(tf);
        }
    }

}