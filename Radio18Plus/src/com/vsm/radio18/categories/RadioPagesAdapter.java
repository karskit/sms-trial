package com.vsm.radio18.categories;

import com.vsm.radio18.ActivityWithBottomBar;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import dtd.phs.lib.utils.Helpers;

public class RadioPagesAdapter extends FragmentPagerAdapter {

	public static final int NUM_PAGEs = 3;
	public static final int FRAG_CATEGORIES = 0;
	public static final int FRAG_PAID = 1;
	public static final int FRAG_QNA = 2;
	private ActivityWithBottomBar hostedAct;

	public RadioPagesAdapter(FragmentManager fMan, ActivityWithBottomBar hostedAct, Handler handler) {
		super(fMan);
		this.hostedAct = hostedAct;
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case FRAG_CATEGORIES:
			return FragCategories.getInstance();
		case FRAG_PAID:
			return FragPaid.getInstance(hostedAct);
		case FRAG_QNA:
			return FragQNA.getInstance();

//		case FRAG_HELP:
//			return FragHelp.getInstance();
		default:
			Helpers.assertCondition(false);
			return null;
		}
	}

	@Override
	public int getCount() {
		return NUM_PAGEs;
	}

}
