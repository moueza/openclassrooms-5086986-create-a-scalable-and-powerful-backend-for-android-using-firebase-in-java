package com.openclassrooms.firebaseoc.auth;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.openclassrooms.firebaseoc.R;//moi
import com.openclassrooms.firebaseoc.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class ProfileActivity extends BaseActivity {

    //FOR DESIGN
    @BindView(R.id.profile_activity_imageview_profile)
    ImageView imageViewProfile;
    @BindView(R.id.profile_activity_edit_text_username)
    TextInputEditText textInputEditTextUsername;
    @BindView(R.id.profile_activity_text_view_email)
    TextView textViewEmail;
    @BindView(R.id.profile_activity_progress_bar)
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.configureToolbar();
    }

    @Override
    public int getFragmentLayout() {
        return R.layout.activity_profile;
    }

    // --------------------
    // ACTIONS
    // --------------------

    @OnClick(R.id.profile_activity_button_update)
    public void onClickUpdateButton() {
    }

    @OnClick(R.id.profile_activity_button_sign_out)
    public void onClickSignOutButton() {
    }

    @OnClick(R.id.profile_activity_button_delete)
    public void onClickDeleteButton() {
    }
}