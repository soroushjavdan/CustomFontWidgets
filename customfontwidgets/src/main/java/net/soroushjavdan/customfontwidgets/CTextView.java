package net.soroushjavdan.customfontwidgets;

/**
 * Created by SoroushJavdan on 9/23/2015.
 */


import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public class CTextView extends TextView {

    public CTextView(Context context) {
        super(context);
        setDefaultFont();
    }

    public CTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode())
            readAttrs(context, attrs);
    }

    public CTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        if (!isInEditMode())
            readAttrs(context, attrs);

    }

    private void readAttrs(Context context ,AttributeSet attrs){
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CTextView);
        String customFont = a.getString(R.styleable.CTextView_customFont);
        if(FontUtils.getFontsMap().containsKey(customFont)){
            setTypeface(FontUtils.getFontsMap().get(customFont));
        }else{
            setDefaultFont();
        }
    }

    /**
     * set defaultTypeFace if exist
     */
    private void setDefaultFont(){
        if(FontUtils.getDefaultFont()!=null)
            setTypeface(FontUtils.getDefaultFont());
    }
}