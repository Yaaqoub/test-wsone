package com.mwsapp.test_wsone;

import android.content.Context;
import android.os.Bundle;

import com.airwatch.sdk.profile.AnchorAppStatus;
import com.airwatch.sdk.profile.ApplicationProfile;
import com.airwatch.sdk.shareddevice.ClearReasonCode;

public class AirWatchSDKBaseIntentService extends com.airwatch.sdk.AirWatchSDKBaseIntentService {
    @Override
    protected void onApplicationConfigurationChange(
            Bundle applicationConfiguration) { }
    @Override
    protected void onApplicationProfileReceived(
            Context context,
            String profileId,
            ApplicationProfile awAppProfile) { }
    @Override
    protected void onClearAppDataCommandReceived(
            Context context,
            ClearReasonCode reasonCode) { }
    @Override
    protected void onAnchorAppStatusReceived(
            Context context,
            AnchorAppStatus appStatus) { }
    @Override
    protected void onAnchorAppUpgrade(Context context, boolean isUpgrade) { }
}
