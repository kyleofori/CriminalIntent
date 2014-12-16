package com.detroitlabs.kyleofori.criminalintent;

import java.util.UUID;

/**
 * Created by kyleofori on 12/14/14.
 */
public class Crime {

    private UUID mId;

    private String mTitle;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Crime() {
        mId = UUID.randomUUID();
    }
}
