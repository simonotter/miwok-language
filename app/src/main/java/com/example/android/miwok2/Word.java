package com.example.android.miwok2;

import static android.os.Build.VERSION_CODES.N;

/**
 * Created by sotter on 15/03/2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId = NO_AUDIO_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_AUDIO_PROVIDED = -1;

    /**
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miworkTranslation is the word in the Miwok language
     *
     * @param audioResourceId is the resource ID for the audio file associated with this word.
     */
    public Word(String defaultTranslation, String miworkTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miworkTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miworkTranslation is the word in the Miwok language
     *
     * @param imageResourceId is the resource ID for the image file associated with this word.
     *
     * @param audioResourceId is the resource ID for the audio file associated with this word.
     */
    public Word(String defaultTranslation, String miworkTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miworkTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     *
     * @return The Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     *
     * @return the image resource ID of the word.
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for the word
     *
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     *
     * @return the Miwok pronunciation of the word
     */
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}