package movie.bw.com.weiduyingyuan.utils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils {

    private final Retrofit retrofit;

    //单例
    public static final class SINGLE_INSTANCE {
        public static final RetrofitUtils _INSTANCE = new RetrofitUtils();
    }

    //方法请求
    public static RetrofitUtils getInStance() {
        return SINGLE_INSTANCE._INSTANCE;
    }

    private RetrofitUtils() {
        retrofit = new Retrofit.Builder()
                //.baseUrl()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(getClient())
                .build();
    }

    private OkHttpClient getClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .writeTimeout(3000, TimeUnit.MILLISECONDS)
                .readTimeout(3000, TimeUnit.MILLISECONDS)
                .build();

    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    public <T> T create(Class<T> clazz) {
        return retrofit.create(clazz);
    }
}
