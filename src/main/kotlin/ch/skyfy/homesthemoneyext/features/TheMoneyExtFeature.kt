package ch.skyfy.homesthemoneyext.features

import ch.skyfy.homes.api.Extension
import com.mojang.brigadier.context.CommandContext
import net.minecraft.server.command.ServerCommandSource

object TheMoneyExtFeature : Extension() {

    override fun teleportHome(context: CommandContext<ServerCommandSource>): Boolean {
        // TODO Check if the player has enough money to be able to teleporting to another homes depending of some factors like distance, the player grade, the time spend on the server

        return true
    }

}