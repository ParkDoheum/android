package com.example.administrator.myapplication.retrofit;

import com.example.administrator.myapplication.model.BitcoinListVO;
import com.example.administrator.myapplication.model.BitcoinVO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BitcoinService {
    @GET("/v2/listings")
    Call<BitcoinListVO> getBitcoin();
}