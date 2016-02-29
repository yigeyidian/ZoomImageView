/*******************************************************************************
 * Copyright 2011, 2012 Chris Banes.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.tl.zoomimageview;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;


public interface IZoomImageView {

    float DEFAULT_MAX_SCALE = 3.0f;
    float DEFAULT_MID_SCALE = 1.75f;
    float DEFAULT_MIN_SCALE = 1.0f;
    int DEFAULT_ZOOM_DURATION = 200;

    boolean canZoom();


    RectF getDisplayRect();

    boolean setDisplayMatrix(Matrix finalMatrix);

    Matrix getDisplayMatrix();

    float getMinimumScale();

    float getMediumScale();

    float getMaximumScale();

    float getScale();

    ImageView.ScaleType getScaleType();

    void setAllowParentInterceptOnEdge(boolean allow);

    void setMinimumScale(float minimumScale);


    void setMediumScale(float mediumScale);


    void setMaximumScale(float maximumScale);

    void setScaleLevels(float minimumScale, float mediumScale, float maximumScale);

    void setOnLongClickListener(View.OnLongClickListener listener);

    void setOnMatrixChangeListener(ZoomImageViewAttacher.OnMatrixChangedListener listener);

    void setOnPhotoTapListener(ZoomImageViewAttacher.OnPhotoTapListener listener);

    ZoomImageViewAttacher.OnPhotoTapListener getOnPhotoTapListener();

    void setOnViewTapListener(ZoomImageViewAttacher.OnViewTapListener listener);

    void setRotationTo(float rotationDegree);

    void setRotationBy(float rotationDegree);

    ZoomImageViewAttacher.OnViewTapListener getOnViewTapListener();

    void setScale(float scale);

    void setScale(float scale, boolean animate);

    void setScale(float scale, float focalX, float focalY, boolean animate);

    void setScaleType(ImageView.ScaleType scaleType);

    void setZoomable(boolean zoomable);

    void setPhotoViewRotation(float rotationDegree);

    Bitmap getVisibleRectangleBitmap();

    void setZoomTransitionDuration(int milliseconds);

    IZoomImageView getIPhotoViewImplementation();

    void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener newOnDoubleTapListener);

    void setOnScaleChangeListener(ZoomImageViewAttacher.OnScaleChangeListener onScaleChangeListener);
}
