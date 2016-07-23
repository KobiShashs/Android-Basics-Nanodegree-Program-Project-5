package com.example.android.tourguideapp;

/**
 * Created by user on 7/20/2016.
 */
public class CellItem {
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    private String mName;
    private String mAddress;
    private int mResources = NO_IMAGE_PROVIDED;

    public CellItem(String name, String address, int resource) {
        mName = name;
        mAddress = address;
        mResources = resource;
    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getmResources() {
        return mResources;
    }

    public boolean hasImage() {
        return mResources != NO_IMAGE_PROVIDED;
    }


}
