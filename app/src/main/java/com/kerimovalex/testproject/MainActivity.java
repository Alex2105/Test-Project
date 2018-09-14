package com.kerimovalex.testproject;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kerimovalex.testproject.api.SingletonRest;
import com.kerimovalex.testproject.dialog.MaterialProgressDialog;
import com.kerimovalex.testproject.errors.Error;
import com.kerimovalex.testproject.interfaces.Constant;
import com.kerimovalex.testproject.model.ErrorModel;
import com.kerimovalex.testproject.model.ExampleModel;
import com.kerimovalex.testproject.model.RequestModel;
import com.kerimovalex.testproject.model.UserModel;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends Activity implements Constant {
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.green_number)
    TextView greenNamber;
    @BindView(R.id.orange_number)
    TextView orangeNumber;
    @BindView(R.id.rating_text)
    TextView rating;
    @BindView(R.id.image)
    CircleImageView image;
    @BindView(R.id.online_text)
    TextView online;
    @BindView(R.id.location_text)
    TextView location;
    @BindView(R.id.sold_text)
    TextView sold;
    @BindView(R.id.visitors_text)
    TextView visitors;
    @BindView(R.id.seekBar)
    SeekBar seekBar;
    @BindView(R.id.only_mobile_checkbox)
    CheckBox mobile;
    @BindView(R.id.only_top_tier_checkbox)
    CheckBox topTier;
    @BindView(R.id.no_mobile_checkbox)
    CheckBox noMobile;
    @BindView(R.id.prime_filter_checkbox)
    CheckBox primeFilter;
    @BindView(R.id.url_edit_text)
    EditText url;
    @BindView(R.id.button)
    Button button;
    @BindString(R.string.ratings_text)
    String ratingText;
    private Context context;
    private Error error;
    private MaterialProgressDialog materialProgressDialog;

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        context = this;
        materialProgressDialog = MaterialProgressDialog.getProgressDialog(MainActivity.this);
        error = new Error(context);
        fonts();
        materialProgressDialog.show();
        SingletonRest.getInstance().getDataInfo(TOKEN, new RequestModel(9124))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::init, throwable -> {
                    error.handleError(throwable);
                    materialProgressDialog.dismiss();
                });

    }


    private void init(ExampleModel example) {
        UserModel item = example.getData().getUser();
        name.setText(item.getPartner());
        greenNamber.setText(item.getSellerRateSuccess());
        orangeNumber.setText(example.getData().getUser().getSellerRateFail());
        rating.setText(ratingText + String.valueOf(item.getSalesPercent()));
        Glide.with(context).load(item.getAvatar()).into(image);
        online.setText(item.getIsOnline());
        location.setText(item.getCountryName());
        sold.setText("Sold " + String.valueOf(item.getProfileSolos().getHotSalesCnt()) + " solos in the last couple of days");
        double p = Math.ceil(Math.round(item.getClickPrice() * Integer.parseInt(item.getOrdersClicks()))
                + Math.round((item.getClickPrice() * Integer.parseInt(item.getOrdersClicks())) + 3.00));
        seekBar.incrementProgressBy(50);
        button.setText("Add to card($" + p + ")");
        materialProgressDialog.dismiss();


    }

    public void fonts() {
        Typeface ariaBold = Typeface.createFromAsset(getAssets(), "Arial_Bold.ttf");
        Typeface ariaRegular = Typeface.createFromAsset(getAssets(), "Arial_Regular.ttf");
        Typeface calibri = Typeface.createFromAsset(getAssets(), "Calibri.ttf");
        greenNamber.setTypeface(ariaRegular);
        orangeNumber.setTypeface(ariaRegular);
        rating.setTypeface(ariaRegular);
        online.setTypeface(ariaBold);
        location.setTypeface(calibri);
        sold.setTypeface(calibri);
        rating.setTypeface(ariaRegular);
        mobile.setTypeface(ariaRegular);
        topTier.setTypeface(ariaRegular);
        noMobile.setTypeface(ariaRegular);
        primeFilter.setTypeface(ariaRegular);
        url.setTypeface(ariaRegular);


    }
}
