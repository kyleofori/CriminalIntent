package com.detroitlabs.kyleofori.criminalintent;

import java.util.UUID;

/**
 * Created by kyleofori on 12/14/14.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }
}
