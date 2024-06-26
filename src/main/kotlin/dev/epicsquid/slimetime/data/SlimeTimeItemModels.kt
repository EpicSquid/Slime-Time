package dev.epicsquid.slimetime.data

import dev.epicsquid.slimetime.SlimeTime
import net.minecraft.data.PackOutput
import net.minecraftforge.client.model.generators.ItemModelProvider
import net.minecraftforge.common.data.ExistingFileHelper

class SlimeTimeItemModels(
	output: PackOutput,
	existingFileHelper: ExistingFileHelper
) : ItemModelProvider(output, SlimeTime.MODID, existingFileHelper) {

	override fun registerModels() {
	}
}