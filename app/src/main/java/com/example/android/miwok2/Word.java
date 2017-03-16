package com.example.android.miwok2;

/**
 * Created by sotter on 15/03/2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miworkTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miworkTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}