package com.example.xyzreader.ui;

import android.graphics.Bitmap;

import com.squareup.picasso.Transformation;

/**
 * Created by Jin Yoon on 9/3/2016.
 */
public class CropSquareTransformation implements Transformation {
    @Override
    public Bitmap transform(Bitmap source) {
        int size = Math.min(source.getWidth(), source.getHeight());
        int x = (source.getWidth() - size) / 2;
        int y = (source.getHeight() - size) / 2;
        Bitmap result = Bitmap.createBitmap(source, x, y, size, size);
        if (result != source) {
            source.recycle();
        }
        return result;
    }

    @Override
    public String key() { return "square()"; }
}
