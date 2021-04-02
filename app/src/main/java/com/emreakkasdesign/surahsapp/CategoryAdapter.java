package com.emreakkasdesign.surahsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CategoryAdapter extends FragmentStateAdapter {

    private static final int ITEMS = 2;

    public CategoryAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new SurahsFragment();
        } else {
            return new DuasFragment();
        }
    }

    @Override
    public int getItemCount() {
        return ITEMS;
    }
}
