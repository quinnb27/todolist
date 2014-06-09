package com.example.todolist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todolist.PuppyPage;

public class PuppyPage extends Fragment {

	/**
	 * Returns a new instance of this fragment.
	 */
	public static PuppyPage newInstance() {
		PuppyPage fragment = new PuppyPage();
		return fragment;
	}

	public PuppyPage() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.puppy_page, container, false);
		
		return rootView;
	}
}
