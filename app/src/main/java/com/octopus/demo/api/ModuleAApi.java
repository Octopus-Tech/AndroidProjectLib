package com.octopus.demo.api;

import com.octopus.demo.api.res.ListCategory;
import com.octopus.demo.base.InfoResult;

import io.reactivex.Observable;
import retrofit2.http.POST;

/**
 * @author octopus
 * @version [AndroidProjectLib, 2019-03-07]
 */
public interface ModuleAApi {
    @POST("api/shop/v4/group/category/list")
    Observable<InfoResult<ListCategory>> categoryList();
}
