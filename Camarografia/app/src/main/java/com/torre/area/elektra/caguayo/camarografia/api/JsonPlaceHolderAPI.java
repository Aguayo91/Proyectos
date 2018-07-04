package com.torre.area.elektra.caguayo.camarografia.api;

import com.torre.area.elektra.caguayo.camarografia.model.Post;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


public interface JsonPlaceHolderAPI {
    @GET("posts")
    Call<List<Post>> getAllPosts();
}
