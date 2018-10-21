package com.chartboost.helium.helium_interactors;

import android.util.Log;

import com.chartboost.helium.helium_domain.BasicIdentifier;
import com.chartboost.helium.helium_domain.ad.AdAggregate;
import com.chartboost.helium.helium_interactors.repos.CompletionCallback;
import com.chartboost.helium.helium_interactors.repos.HeliumRepo;

public final class RepoFactory {
    private static String TAG = "RepoFactory";
    private final HeliumRepo heliumRepo_;
    private RepoFactory(final HeliumRepo heliumRepo) {
        heliumRepo_ = heliumRepo;
        if (heliumRepo_ != null) {
            heliumRepo_.autoloadAllRepos();
        }
    }

    public static RepoFactory of(HeliumRepo heliumRepo) {
        return new RepoFactory(heliumRepo);
    }

    public void getAd(BasicIdentifier adid, CompletionCallback completion) {
        if (adid == null) {
            Log.d(TAG, "adid is null, so this should come from cloud");
        } else {
            Log.d(TAG, "adid is not null, so may come from memory or file store");
        }
        AdAggregate adAggregate = null;

        adAggregate = new AdAggregate();

        completion.didGet(adAggregate);
    }
}
