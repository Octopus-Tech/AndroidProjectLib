package library.demo.api;

import library.demo.api.res.ListCategory;
import library.demo.base.InfoResult;

import io.reactivex.Observable;
import retrofit2.http.POST;

/**
 * @author zhuhf
 * @version [AndroidLibrary, 2018-03-07]
 */
public interface ModuleAApi {
    @POST("api/shop/v4/group/category/list")
    Observable<InfoResult<ListCategory>> categoryList();
}
