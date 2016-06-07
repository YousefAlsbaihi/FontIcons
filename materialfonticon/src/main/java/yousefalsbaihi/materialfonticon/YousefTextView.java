package yousefalsbaihi.materialfonticon;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by yousef on 6/7/16.
 */
public class YousefTextView extends TextView {

    private static Typeface sMaterialDesignIcons;

    public YousefTextView(Context context) {
        this(context, null);
    }

    public YousefTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public YousefTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (isInEditMode()) return;//Won't work in Eclipse graphical layout
        setTypeface();
    }

    private void setTypeface() {
        if (sMaterialDesignIcons == null) {
            sMaterialDesignIcons = Typeface.createFromAsset(getContext().getAssets(), "fonts/materialFont.ttf");
        }
        setTypeface(sMaterialDesignIcons);
    }
}