/*
 * Copyright (c) 2018. Arash Hatami
 */

package ir.hatamiarash.toast_sample;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Toast;

import ir.hatamiarash.toast.RTLToast;

import static android.graphics.Typeface.BOLD_ITALIC;

public class MainActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findViewById(R.id.button_error_toast).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				RTLToast.error(MainActivity.this, R.string.error_message, Toast.LENGTH_SHORT, true).show();
			}
		});
		findViewById(R.id.button_success_toast).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				RTLToast.success(MainActivity.this, R.string.success_message, Toast.LENGTH_SHORT, true).show();
			}
		});
		findViewById(R.id.button_info_toast).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				RTLToast.info(MainActivity.this, R.string.info_message, Toast.LENGTH_SHORT, true).show();
			}
		});
		findViewById(R.id.button_warning_toast).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				RTLToast.warning(MainActivity.this, R.string.warning_message, Toast.LENGTH_SHORT, true).show();
			}
		});
		findViewById(R.id.button_normal_toast_wo_icon).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				RTLToast.normal(MainActivity.this, R.string.normal_message_without_icon).show();
			}
		});
		findViewById(R.id.button_normal_toast_w_icon).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Drawable icon = getResources().getDrawable(R.drawable.ic_pets_white_48dp);
				RTLToast.normal(MainActivity.this, R.string.normal_message_with_icon, icon).show();
			}
		});
		findViewById(R.id.button_info_toast_with_formatting).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				RTLToast.info(MainActivity.this, getFormattedMessage()).show();
			}
		});
		findViewById(R.id.button_custom_config).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				RTLToast.Config.getInstance()
						.setTextColor(Color.GREEN)
						.setToastTypeface(Typeface.createFromAsset(getAssets(), "IRANSans.ttf"))
						.apply();
				RTLToast.custom(MainActivity.this, R.string.custom_message, getResources().getDrawable(R.drawable.laptop512),
						Color.BLACK, Toast.LENGTH_SHORT, true, true).show();
				RTLToast.Config.reset();
			}
		});
	}
	
	private CharSequence getFormattedMessage() {
		final String prefix = "متن ";
		final String highlight = "با فرمت ";
		final String suffix = " مخصوص";
		SpannableStringBuilder ssb = new SpannableStringBuilder(prefix).append(highlight).append(suffix);
		int prefixLen = prefix.length();
		ssb.setSpan(new StyleSpan(BOLD_ITALIC), prefixLen, prefixLen + highlight.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		return ssb;
	}
}