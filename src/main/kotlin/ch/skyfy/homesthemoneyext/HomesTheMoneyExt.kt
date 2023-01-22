package ch.skyfy.homesthemoneyext

import ch.skyfy.homesthemoneyext.features.TheMoneyExtFeature
import ch.skyfy.homesthemoneyext.utils.setupConfigDirectory
import net.fabricmc.api.DedicatedServerModInitializer
import net.fabricmc.loader.api.FabricLoader
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import java.nio.file.Path

@Suppress("MemberVisibilityCanBePrivate")
class HomesTheMoneyExt : DedicatedServerModInitializer {

    companion object {
        const val MOD_ID: String = "homes_the_money_ext"
        val CONFIG_DIRECTORY: Path = FabricLoader.getInstance().configDir.resolve(MOD_ID)
        val LOGGER: Logger = LogManager.getLogger(HomesTheMoneyExt::class.java)
    }

    init {
        setupConfigDirectory()
//        ConfigManager.loadConfigs(arrayOf(Configs.javaClass))
    }

    override fun onInitializeServer() {
        ch.skyfy.homes.api.Extension.registerExtension("TEST", TheMoneyExtFeature::class)
        println("Feature TEST registered")
    }
}