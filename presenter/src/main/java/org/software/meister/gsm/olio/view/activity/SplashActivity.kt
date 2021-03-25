package org.software.meister.gsm.olio.view.activity

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.net.NetworkInfo
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseActivity
import org.software.meister.gsm.olio.databinding.ActivitySplashBinding
import org.software.meister.gsm.olio.viewmodel.activity.SplashViewModel
import org.software.meister.gsm.olio.widget.extention.startActivityWithFinish

class SplashActivity : BaseActivity<SplashViewModel, ActivitySplashBinding>() {
    override val resource: Int
        get() = R.layout.activity_splash
    override val viewModel: SplashViewModel
        get() = getViewModel(SplashViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {
        if(!isNetworkAvailable(this@SplashActivity)){
            Toast.makeText(this@SplashActivity, "인터넷 없음", Toast.LENGTH_LONG).show()
            finish()
        } else {
            Handler(Looper.myLooper()!!).postDelayed({
                startActivityWithFinish(this@SplashActivity, LoginActivity::class.java)
            }, 2000)
        }
    }

    private fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val nw = connectivityManager.activeNetwork ?: return false
            val actNw = connectivityManager.getNetworkCapabilities(nw) ?: return false
            return when {
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                //for other device how are able to connect with Ethernet
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                //for check internet over Bluetooth
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH) -> true
                else -> false
            }
        } else {
            return connectivityManager.activeNetworkInfo?.isConnected ?: false
        }
    }
}