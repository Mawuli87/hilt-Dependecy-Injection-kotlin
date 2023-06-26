package com.messieyawo.hilttutorials.hilt

import androidx.core.app.ActivityCompat
import com.messieyawo.hilttutorials.network.*
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

@Module
@InstallIn(ActivityCompat::class)
abstract class NetworkModule {
    @Binds
    abstract fun bindNetworkAdapterImpl(networkAdapterImpl: MyAppNetworkAdapter):NetworkAdapter

//    @Provides
//   fun provideNetworkService():NetWorkService {
//       return NetWorkService.Builder()
//           .host("google.com")
//           .protocol("HTTPS")
//           .build()
//   }

    @CallInterceptor
    @Provides
    fun provideCallNetworkService():NetWorkService {
     return NetWorkService.Builder()
         .host("google.com")
         .protocol("HTTPS")
         .interceptor(CallInterceptorImpl())
         .build()
    }

    @ResponseInterceptor
    @Provides
    fun provideResponseNetworkService():NetWorkService{
        return NetWorkService.Builder()
            .host("google.com")
            .protocol("HTTPS")
            .interceptor(ResponseInterceptorImpl())
            .build()
    }


}