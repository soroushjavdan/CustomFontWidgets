package net.soroushjavdan.customfontwidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckBox;

/**
 * Created by SoroushJavdan on 9/23/2015.
 */
public class CCheckBox extends CheckBox {
    public CCheckBox(Context context) {
        super(context);
        setDefaultFont();
    }

    public CCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        readAttrs(context,attrs);
    }

    public CCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        readAttrs(context, attrs);
    }


    private void readAttrs(Context context ,AttributeSet attrs){
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CCheckBox);
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
