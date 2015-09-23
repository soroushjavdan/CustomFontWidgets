package net.soroushjavdan.customfontwidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by SoroushJavdan on 9/23/2015.
 */
public class CEditText extends EditText {
    public CEditText(Context context) {
        super(context);
        setDefaultFont();
    }

    public CEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode())
            readAttrs(context, attrs);

    }

    public CEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        if (!isInEditMode())
            readAttrs(context, attrs);

    }

    private void readAttrs(Context context ,AttributeSet attrs){
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CEditText);
        String customFont = a.getString(R.styleable.CEditText_customFont);
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
