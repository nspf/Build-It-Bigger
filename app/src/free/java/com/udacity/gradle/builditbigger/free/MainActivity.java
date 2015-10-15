/*
 * Copyright 2015 Nicolas Pintos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.udacity.gradle.builditbigger.free;

import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.udacity.gradle.builditbigger.BaseMainActivity;
import com.udacity.gradle.builditbigger.R;


public class MainActivity extends BaseMainActivity {

    private InterstitialAd mIntersitial;


    @Override
    protected void onResume() {
        super.onResume();
        loadIntersitial();
    }


    public void loadIntersitial() {

        mIntersitial = new InterstitialAd(this);
        mIntersitial.setAdUnitId(getResources().getString(R.string.intersitial_ad_unit_id));
        mIntersitial.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();

            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                super.onAdFailedToLoad(errorCode);
            }

            @Override
            public void onAdClosed() {
                tellJoke();
            }
        });

        AdRequest ar = new AdRequest.Builder().build();
        mIntersitial.loadAd(ar);

    }

    public void showIntersitial(View view) {
        if(mIntersitial.isLoaded()) {
            mIntersitial.show();
        }
        else {
            tellJoke();
        }

    }

}