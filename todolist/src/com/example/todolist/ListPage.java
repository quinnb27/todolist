package com.example.todolist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todolist.ListPage;

public class ListPage extends Fragment {
	
	public static ListPage newInstance() {
		ListPage fragment = new ListPage();
		return fragment;
	}

	public ListPage() {
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.list_page, container, false);
		
		return rootView;
	}
}
