package com.guntur.ade.app1usinggoogleplaceapi.Remote;

import com.guntur.ade.app1usinggoogleplaceapi.Model.MyPlaces;
import com.guntur.ade.app1usinggoogleplaceapi.Model.PlaceDetail;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Ade on 25/02/2018.
 */

public interface IGoogleApiService {
    @GET
    Call<MyPlaces> getNearByPlaces(@Url String url);

    @GET
    Call<PlaceDetail> getDetailPlace(@Url String url);
}
