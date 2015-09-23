package net.soroushjavdan.customfontwidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by SoroushJavdan on 9/16/2015.
 */
public class CButton extends Button {


    public CButton(Context context) {
        super(context);
        setDefaultFont();

    }

    public CButton(Context context, AttributeSet attrs) {
        super(context, attrs);


        if (!isInEditMode())
            readAttrs(context, attrs);

    }

    public CButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


        if (!isInEditMode())
            readAttrs(context, attrs);
    }

    private void readAttrs(Context context, AttributeSet attrs){
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CButton);
        String customFont = a.getString(R.styleable.CButton_customFont);
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
