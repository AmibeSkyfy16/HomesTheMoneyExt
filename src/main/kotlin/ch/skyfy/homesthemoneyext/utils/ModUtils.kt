package ch.skyfy.homesthemoneyext.utils

import ch.skyfy.homesthemoneyext.HomesTheMoneyExt
import kotlin.io.path.createDirectory
import kotlin.io.path.exists

fun setupConfigDirectory() {
    try {
        if (!HomesTheMoneyExt.CONFIG_DIRECTORY.exists()) HomesTheMoneyExt.CONFIG_DIRECTORY.createDirectory()
    } catch (e: java.lang.Exception) {
        HomesTheMoneyExt.LOGGER.fatal("An exception occurred. Could not create the root folder that should contain the configuration files")
        throw RuntimeException(e)
    }
}