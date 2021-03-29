package com.emreakkasdesign.surahsapp.model;

public class Surah {
    private String mName;
    private String mArabic;
    private String mMeaning;

    public Surah(String name, String arabic, String meaning) {
        this.mName = name;
        this.mArabic = arabic;
        this.mMeaning = meaning;
    }

    public String getmArabic() {
        return mArabic;
    }

    public String getmName() {
        return mName;
    }

    public String getmMeaning() {
        return mMeaning;
    }
}
