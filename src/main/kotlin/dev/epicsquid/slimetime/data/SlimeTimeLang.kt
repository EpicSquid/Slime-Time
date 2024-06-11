package dev.epicsquid.slimetime.data

import dev.epicsquid.slimetime.SlimeTime
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