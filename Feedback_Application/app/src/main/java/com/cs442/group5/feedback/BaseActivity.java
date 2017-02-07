package com.cs442.group5.feedback;


import android.app.ProgressDialog;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

	@VisibleForTesting
	public ProgressDialog mProgressDialog;

	public void showProgressDialog() {
		if (mProgressDialog == null) {
			mProgressDialog = new ProgressDialog(this);
			mProgressDialog.setMessage("Loading");
			mProgressDialog.setIndeterminate(true);
		}

		mProgressDialog.show();
	}

	public void hideProgressDialog() {
		if (mProgressDialog != null && mProgressDialog.isShowing()) {
			mProgressDialog.dismiss();
		}
	}

	@Override
	public void onStop() {
		super.onStop();
		hideProgressDialog();
	}

}