package com.common.framework.image;

import com.bumptech.glide.request.target.DrawableImageViewTarget;
import com.common.framework.image.glide.GlideDisplayable;

/**
 * @author zhangyang5547662@126.com
 * @version [AndroidProjectLib, 2019-3-6]
 */
public class ImageLoaderFactory {
    
    public static Displayable createDefault() {
        return create(GlideDisplayable.class);
    }
    
    public static Displayable create(Class<? extends Displayable> displayable) {
        try {
            return displayable.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static Displayable createGlideWithTarget(DrawableImageViewTarget target) {
        return new GlideDisplayable(target);
    }
    
    public static GlideDisplayable createGlideWithTarget(Class<? extends GlideDisplayable> displayable, DrawableImageViewTarget target) {
        try {
            GlideDisplayable glideDisplayable = displayable.newInstance();
            glideDisplayable.setTarget(target);
            return glideDisplayable;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}