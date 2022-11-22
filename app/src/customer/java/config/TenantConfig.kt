package config
import com.purvesh.tenentconfigdemo.DefaultConfig

open class TenantConfig : DefaultConfig() {

    companion object {
        val instance = TenantConfig()
    }

    override var appName: String = "Customer"
}

