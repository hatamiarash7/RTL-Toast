/*
 * Copyright (c) 2018. Arash Hatami
 */

package ir.hatamiarash.toast;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.view.View;

final class RTLToastUtils {
	private RTLToastUtils() {
	}
	
	static Drawable tintIcon(@NonNull Drawable drawable, @ColorInt int tintColor) {
		drawable.setColorFilter(tintColor, PorterDuff.Mode.SRC_IN);
		return drawable;
	}
	
	static Drawable tint9PatchDrawableFrame(@NonNull Context context, @ColorInt int tintColor) {
		final NinePatchDrawable toastDrawable = (NinePatchDrawable) getDrawable(context, R.drawable.toast_frame);
		return tintIcon(toastDrawable, tintColor);
	}
	
	static void setBackground(@NonNull View view, Drawable drawable) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN)
			view.setBackground(drawable);
		else
			view.setBackgroundDrawable(drawable);
	}
	
	static Drawable getDrawable(@NonNull Context context, @DrawableRes int id) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
			return context.getDrawable(id);
		else
			return context.getResources().getDrawable(id);
	}
}
