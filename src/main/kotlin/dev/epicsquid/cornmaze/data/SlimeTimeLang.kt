package dev.epicsquid.cornmaze.data

import dev.epicsquid.cornmaze.SlimeTime
import dev.epicsquid.cornmaze.registry.BlockRegistry
import dev.epicsquid.cornmaze.registry.ItemRegistry
import net.minecraft.data.PackOutput
import net.minecraftforge.common.data.LanguageProvider

class SlimeTimeLang(
	output: PackOutput,
	locale: String
) : LanguageProvider(output, SlimeTime.MODID, locale) {

	override fun addTranslations() {
		add("itemGroup.${SlimeTime.MODID}.main", "Slime Time")
	}
}