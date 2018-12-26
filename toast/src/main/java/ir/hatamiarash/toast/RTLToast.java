/*
 * Copyright (c) 2018. Arash Hatami
 */

package ir.hatamiarash.toast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.CheckResult;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("InflateParams")
public class RTLToast {
	@ColorInt
	private static int DEFAULT_TEXT_COLOR = Color.parseColor("#FFFFFF");
	@ColorInt
	private static int ERROR_COLOR = Color.parseColor("#D50000");
	@ColorInt
	private static int INFO_COLOR = Color.parseColor("#3F51B5");
	@ColorInt
	private static int SUCCESS_COLOR = Color.parseColor("#388E3C");
	@ColorInt
	private static int WARNING_COLOR = Color.parseColor("#FFA900");
	@ColorInt
	private static int NORMAL_COLOR = Color.parseColor("#353A3E");
	
	private static final Typeface LOADED_TOAST_TYPEFACE = Typeface.create("sans-serif-condensed", Typeface.NORMAL);
	private static Typeface currentTypeface = LOADED_TOAST_TYPEFACE;
	private static int textSize = 16; // SP
	
	private static boolean tintIcon = true;
	
	private RTLToast() {
	}
	
	@CheckResult
	public static Toast normal(@NonNull Context context, @StringRes int message) {
		return normal(context, context.getString(message), Toast.LENGTH_SHORT, null, false);
	}
	
	@CheckResult
	public static Toast normal(@NonNull Context context, @NonNull CharSequence message) {
		return normal(context, message, Toast.LENGTH_SHORT, null, false);
	}
	
	@CheckResult
	public static Toast normal(@NonNull Context context, @StringRes int message, Drawable icon) {
		return normal(context, context.getString(message), Toast.LENGTH_SHORT, icon, true);
	}
	
	@CheckResult
	public static Toast normal(@NonNull Context context, @NonNull CharSequence message, Drawable icon) {
		return normal(context, message, Toast.LENGTH_SHORT, icon, true);
	}
	
	@CheckResult
	public static Toast normal(@NonNull Context context, @StringRes int message, int duration) {
		return normal(context, context.getString(message), duration, null, false);
	}
	
	@CheckResult
	public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration) {
		return normal(context, message, duration, null, false);
	}
	
	@CheckResult
	public static Toast normal(@NonNull Context context, @StringRes int message, int duration, Drawable icon) {
		return normal(context, context.getString(message), duration, icon, true);
	}
	
	@CheckResult
	public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration, Drawable icon) {
		return normal(context, message, duration, icon, true);
	}
	
	@CheckResult
	public static Toast normal(@NonNull Context context, @StringRes int message, int duration, Drawable icon, boolean withIcon) {
		return custom(context, context.getString(message), icon, NORMAL_COLOR, duration, withIcon, true);
	}
	
	@CheckResult
	public static Toast normal(@NonNull Context context, @NonNull CharSequence message, int duration, Drawable icon, boolean withIcon) {
		return custom(context, message, icon, NORMAL_COLOR, duration, withIcon, true);
	}
	
	@CheckResult
	public static Toast warning(@NonNull Context context, @StringRes int message) {
		return warning(context, context.getString(message), Toast.LENGTH_SHORT, true);
	}
	
	@CheckResult
	public static Toast warning(@NonNull Context context, @NonNull CharSequence message) {
		return warning(context, message, Toast.LENGTH_SHORT, true);
	}
	
	@CheckResult
	public static Toast warning(@NonNull Context context, @StringRes int message, int duration) {
		return warning(context, context.getString(message), duration, true);
	}
	
	@CheckResult
	public static Toast warning(@NonNull Context context, @NonNull CharSequence message, int duration) {
		return warning(context, message, duration, true);
	}
	
	@CheckResult
	public static Toast warning(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
		return custom(context, context.getString(message), RTLToastUtils.getDrawable(context, R.drawable.ic_error_outline_white_48dp), WARNING_COLOR, duration, withIcon, true);
	}
	
	@CheckResult
	public static Toast warning(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
		return custom(context, message, RTLToastUtils.getDrawable(context, R.drawable.ic_error_outline_white_48dp), WARNING_COLOR, duration, withIcon, true);
	}
	
	@CheckResult
	public static Toast info(@NonNull Context context, @StringRes int message) {
		return info(context, context.getString(message), Toast.LENGTH_SHORT, true);
	}
	
	@CheckResult
	public static Toast info(@NonNull Context context, @NonNull CharSequence message) {
		return info(context, message, Toast.LENGTH_SHORT, true);
	}
	
	@CheckResult
	public static Toast info(@NonNull Context context, @StringRes int message, int duration) {
		return info(context, context.getString(message), duration, true);
	}
	
	@CheckResult
	public static Toast info(@NonNull Context context, @NonNull CharSequence message, int duration) {
		return info(context, message, duration, true);
	}
	
	@CheckResult
	public static Toast info(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
		return custom(context, context.getString(message), RTLToastUtils.getDrawable(context, R.drawable.ic_info_outline_white_48dp), INFO_COLOR, duration, withIcon, true);
	}
	
	@CheckResult
	public static Toast info(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
		return custom(context, message, RTLToastUtils.getDrawable(context, R.drawable.ic_info_outline_white_48dp), INFO_COLOR, duration, withIcon, true);
	}
	
	@CheckResult
	public static Toast success(@NonNull Context context, @StringRes int message) {
		return success(context, context.getString(message), Toast.LENGTH_SHORT, true);
	}
	
	@CheckResult
	public static Toast success(@NonNull Context context, @NonNull CharSequence message) {
		return success(context, message, Toast.LENGTH_SHORT, true);
	}
	
	@CheckResult
	public static Toast success(@NonNull Context context, @StringRes int message, int duration) {
		return success(context, context.getString(message), duration, true);
	}
	
	@CheckResult
	public static Toast success(@NonNull Context context, @NonNull CharSequence message, int duration) {
		return success(context, message, duration, true);
	}
	
	@CheckResult
	public static Toast success(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
		return custom(context, context.getString(message), RTLToastUtils.getDrawable(context, R.drawable.ic_check_white_48dp), SUCCESS_COLOR, duration, withIcon, true);
	}
	
	@CheckResult
	public static Toast success(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
		return custom(context, message, RTLToastUtils.getDrawable(context, R.drawable.ic_check_white_48dp), SUCCESS_COLOR, duration, withIcon, true);
	}
	
	@CheckResult
	public static Toast error(@NonNull Context context, @StringRes int message) {
		return error(context, context.getString(message), Toast.LENGTH_SHORT, true);
	}
	
	@CheckResult
	public static Toast error(@NonNull Context context, @NonNull CharSequence message) {
		return error(context, message, Toast.LENGTH_SHORT, true);
	}
	
	@CheckResult
	public static Toast error(@NonNull Context context, @StringRes int message, int duration) {
		return error(context, context.getString(message), duration, true);
	}
	
	@CheckResult
	public static Toast error(@NonNull Context context, @NonNull CharSequence message, int duration) {
		return error(context, message, duration, true);
	}
	
	@CheckResult
	public static Toast error(@NonNull Context context, @StringRes int message, int duration, boolean withIcon) {
		return custom(context, context.getString(message), RTLToastUtils.getDrawable(context, R.drawable.ic_clear_white_48dp), ERROR_COLOR, duration, withIcon, true);
	}
	
	@CheckResult
	public static Toast error(@NonNull Context context, @NonNull CharSequence message, int duration, boolean withIcon) {
		return custom(context, message, RTLToastUtils.getDrawable(context, R.drawable.ic_clear_white_48dp), ERROR_COLOR, duration, withIcon, true);
	}
	
	@CheckResult
	public static Toast custom(@NonNull Context context, @StringRes int message, Drawable icon, int duration, boolean withIcon) {
		return custom(context, context.getString(message), icon, -1, duration, withIcon, false);
	}
	
	@CheckResult
	public static Toast custom(@NonNull Context context, @NonNull CharSequence message, Drawable icon, int duration, boolean withIcon) {
		return custom(context, message, icon, -1, duration, withIcon, false);
	}
	
	@CheckResult
	public static Toast custom(@NonNull Context context, @StringRes int message, @DrawableRes int iconRes, @ColorInt int tintColor, int duration, boolean withIcon, boolean shouldTint) {
		return custom(context, context.getString(message), RTLToastUtils.getDrawable(context, iconRes), tintColor, duration, withIcon, shouldTint);
	}
	
	@CheckResult
	public static Toast custom(@NonNull Context context, @NonNull CharSequence message, @DrawableRes int iconRes, @ColorInt int tintColor, int duration, boolean withIcon, boolean shouldTint) {
		return custom(context, message, RTLToastUtils.getDrawable(context, iconRes), tintColor, duration, withIcon, shouldTint);
	}
	
	@CheckResult
	public static Toast custom(@NonNull Context context, @StringRes int message, Drawable icon, @ColorInt int tintColor, int duration, boolean withIcon, boolean shouldTint) {
		return custom(context, context.getString(message), icon, tintColor, duration, withIcon, shouldTint);
	}
	
	@SuppressLint("ShowToast")
	@CheckResult
	public static Toast custom(@NonNull Context context, @NonNull CharSequence message, Drawable icon, @ColorInt int tintColor, int duration, boolean withIcon, boolean shouldTint) {
		final Toast currentToast = Toast.makeText(context, "", duration);
		final View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.toast_layout, null);
		final ImageView toastIcon = toastLayout.findViewById(R.id.toast_icon);
		final TextView toastTextView = toastLayout.findViewById(R.id.toast_text);
		Drawable drawableFrame;
		
		if (shouldTint) {
			drawableFrame = RTLToastUtils.tint9PatchDrawableFrame(context, tintColor);
		} else {
			drawableFrame = RTLToastUtils.getDrawable(context, R.drawable.toast_frame);
		}
		RTLToastUtils.setBackground(toastLayout, drawableFrame);
		
		if (withIcon) {
			if (icon == null) {
				throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
			}
			{
				if (tintIcon)
					icon = RTLToastUtils.tintIcon(icon, DEFAULT_TEXT_COLOR);
			}
			RTLToastUtils.setBackground(toastIcon, icon);
		} else {
			toastIcon.setVisibility(View.GONE);
		}
		
		toastTextView.setText(message);
		toastTextView.setTextColor(DEFAULT_TEXT_COLOR);
		toastTextView.setTypeface(currentTypeface);
		toastTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
		
		currentToast.setView(toastLayout);
		return currentToast;
	}
	
	public static class Config {
		@ColorInt
		private int DEFAULT_TEXT_COLOR = RTLToast.DEFAULT_TEXT_COLOR;
		@ColorInt
		private int ERROR_COLOR = RTLToast.ERROR_COLOR;
		@ColorInt
		private int INFO_COLOR = RTLToast.INFO_COLOR;
		@ColorInt
		private int SUCCESS_COLOR = RTLToast.SUCCESS_COLOR;
		@ColorInt
		private int WARNING_COLOR = RTLToast.WARNING_COLOR;
		
		private Typeface typeface = RTLToast.currentTypeface;
		private int textSize = RTLToast.textSize;
		
		private boolean tintIcon = RTLToast.tintIcon;
		
		private Config() {
		}
		
		@NonNull
		@CheckResult
		public static Config getInstance() {
			return new Config();
		}
		
		public static void reset() {
			RTLToast.DEFAULT_TEXT_COLOR = Color.parseColor("#FFFFFF");
			RTLToast.ERROR_COLOR = Color.parseColor("#D50000");
			RTLToast.INFO_COLOR = Color.parseColor("#3F51B5");
			RTLToast.SUCCESS_COLOR = Color.parseColor("#388E3C");
			RTLToast.WARNING_COLOR = Color.parseColor("#FFA900");
			RTLToast.currentTypeface = LOADED_TOAST_TYPEFACE;
			RTLToast.textSize = 16;
			RTLToast.tintIcon = true;
		}
		
		@CheckResult
		public Config setTextColor(@ColorInt int textColor) {
			DEFAULT_TEXT_COLOR = textColor;
			return this;
		}
		
		@CheckResult
		public Config setErrorColor(@ColorInt int errorColor) {
			ERROR_COLOR = errorColor;
			return this;
		}
		
		@CheckResult
		public Config setInfoColor(@ColorInt int infoColor) {
			INFO_COLOR = infoColor;
			return this;
		}
		
		@CheckResult
		public Config setSuccessColor(@ColorInt int successColor) {
			SUCCESS_COLOR = successColor;
			return this;
		}
		
		@CheckResult
		public Config setWarningColor(@ColorInt int warningColor) {
			WARNING_COLOR = warningColor;
			return this;
		}
		
		@CheckResult
		public Config setToastTypeface(@NonNull Typeface typeface) {
			this.typeface = typeface;
			return this;
		}
		
		@CheckResult
		public Config setTextSize(int sizeInSp) {
			this.textSize = sizeInSp;
			return this;
		}
		
		@CheckResult
		public Config tintIcon(boolean tintIcon) {
			this.tintIcon = tintIcon;
			return this;
		}
		
		public void apply() {
			RTLToast.DEFAULT_TEXT_COLOR = DEFAULT_TEXT_COLOR;
			RTLToast.ERROR_COLOR = ERROR_COLOR;
			RTLToast.INFO_COLOR = INFO_COLOR;
			RTLToast.SUCCESS_COLOR = SUCCESS_COLOR;
			RTLToast.WARNING_COLOR = WARNING_COLOR;
			RTLToast.currentTypeface = typeface;
			RTLToast.textSize = textSize;
			RTLToast.tintIcon = tintIcon;
		}
	}
}