package com.guntur.ade.app1usinggoogleplaceapi.Common;

import com.guntur.ade.app1usinggoogleplaceapi.Model.Results;
import com.guntur.ade.app1usinggoogleplaceapi.Remote.IGoogleApiService;
import com.guntur.ade.app1usinggoogleplaceapi.Remote.RetrofitClient;

/**
 * Created by Ade on 25/02/2018.
 */

public class Common {

    public static Results currentResult;

    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";

    public static IGoogleApiService getGoogleApiService()
    {
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleApiService.class);
    }
}
