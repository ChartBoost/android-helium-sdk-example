package com.chartboost.helium.helium_interactors.repos;

public class HeliumRepo {
    public void autoloadAllRepos() {

    }
    public AdRepo adRepo() {
        return new AdRepo();
    }
    public BidRepo bidRepo() {
        return null;
    }
    public PartnerRepo partnerRepo() {
        return null;
    }
    public ConfigRepo configRepo() {
        return null;
    }
}
