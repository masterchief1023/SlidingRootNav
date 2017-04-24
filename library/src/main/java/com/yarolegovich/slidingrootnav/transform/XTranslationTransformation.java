package com.yarolegovich.slidingrootnav.transform;

import android.view.View;

import com.yarolegovich.slidingrootnav.util.SideNavUtils;

/**
 * Created by yarolegovich on 25.03.2017.
 */

public class XTranslationTransformation implements RootTransformation {

    private float START_TRANSLATION = 0f;

    private final float endTranslation;

    public XTranslationTransformation(float endTranslation) {
        this.endTranslation = endTranslation;
    }

    public XTranslationTransformation(float startTranslation, float endTranslation) {
        this.endTranslation = endTranslation;
        this.START_TRANSLATION = startTranslation;
    }

    @Override
    public void transform(float dragProgress, View rootView) {
        float translation = SideNavUtils.evaluate(dragProgress, START_TRANSLATION, endTranslation);
        rootView.setTranslationX(translation);
    }
}
