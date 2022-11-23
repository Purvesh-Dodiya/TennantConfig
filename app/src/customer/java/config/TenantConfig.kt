package config
import com.purvesh.tenantconfigdemo.DefaultConfig

open class TenantConfig : DefaultConfig() {

    companion object {
        val instance = TenantConfig()
    }

    override var appName: String = "Customer"
}

