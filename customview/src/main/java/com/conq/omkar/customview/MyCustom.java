package com.conq.omkar.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by omkar on 29/6/17.
 */

public class MyCustom extends android.support.v7.widget.AppCompatEditText {

    private Paint paint;

    public MyCustom(Context context) {
        super(context);

        initPaint();
    }

    public MyCustom(Context context, AttributeSet attrs) {
        super(context, attrs);

        initPaint();
    }

    private void   initPaint() {
        paint = new Paint();
        paint.setColor(Color.BLACK);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //canvas.drawCircle(100,150,30,paint);
        //canvas.drawCircle(100,100,100,paint);
       // canvas.drawLine(0,50,500,50,paint);
        // canvas.drawLine(0,100,500,100,paint);


        for(int i=1;i<=17;i++){
            canvas.drawLine(0,40*i,500,40*i,paint);
        }
        paint.setColor(Color.MAGENTA);
        canvas.drawLine(50,0,50,1000,paint);

    }

   /* @Override
    public void draw(Canvas canvas) {

    }*/
}
