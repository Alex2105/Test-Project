package com.kerimovalex.testproject.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.kerimovalex.testproject.R;

public class MaterialProgressDialog extends Dialog {
    private MaterialProgressDialog(Context context) {
        super(context, R.style.ProgressDialogTheme);
    }

    public static MaterialProgressDialog getProgressDialog(Activity activity) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        ProgressBar progressBar = new ProgressBar(activity);
        progressBar.setIndeterminateDrawable(activity.getResources().getDrawable(R.drawable.progress_bar));
        linearLayout.addView(progressBar);
        MaterialProgressDialog dialog = new MaterialProgressDialog(activity);
        dialog.setCancelable(false);
        dialog.setOwnerActivity(activity);
        dialog.addContentView(linearLayout, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return dialog;
    }
}