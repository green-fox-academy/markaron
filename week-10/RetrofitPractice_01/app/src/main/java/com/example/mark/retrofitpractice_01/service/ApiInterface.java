package com.example.mark.retrofitpractice_01.service;

    import com.example.mark.retrofitpractice_01.model.WorksByAuthor;
    import com.example.mark.retrofitpractice_01.model.WorksBySubject;

    import retrofit2.Call;
    import retrofit2.http.GET;
    import retrofit2.http.Headers;
    import retrofit2.http.Path;
    import retrofit2.http.Query;

public interface ApiInterface {

  //@Headers({"Content-Type: application/json", "Accept: application/json"})
  @GET("subjects/{subject}.json")
  Call<WorksBySubject> getContacts(@Path("subject") String subject);


  @Headers({"Content-Type: application/json", "Accept: application/json"})
  @GET("/search.json")
  Call<WorksByAuthor> getAuthor(@Query(value = "author") String author);
}
