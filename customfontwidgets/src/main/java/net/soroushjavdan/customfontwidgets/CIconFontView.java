package net.soroushjavdan.customfontwidgets;

/**
 * Created by SoroushJavdan on 9/9/2015.
 */

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;


public class CIconFontView extends TextView {

    public CIconFontView(Context context) {
        super(context);

        if (isInEditMode())
            setText("X");

    }

    public CIconFontView(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode())
            readAttrs(context, attrs);
        else
            setText("X");
    }

    public CIconFontView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        if (!isInEditMode())
            readAttrs(context, attrs);
        else
            setText("X");

    }

    private void readAttrs(Context context ,AttributeSet attrs){
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CTextView);
        String customFont = a.getString(R.styleable.CTextView_customFont);
        if (FontUtils.getFontsMap().containsKey(customFont)){
            setTypeface(FontUtils.getFontsMap().get(customFont));
        }
    }


}