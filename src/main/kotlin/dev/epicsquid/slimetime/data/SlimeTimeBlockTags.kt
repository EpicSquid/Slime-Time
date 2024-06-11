package dev.epicsquid.slimetime.data

import dev.epicsquid.slimetime.SlimeTime
import net.minecraft.core.HolderLookup.Provider
import net.minecraft.data.PackOutput
import net.minecraftforge.common.data.BlockTagsProvider
import net.minecraftforge.common.data.ExistingFileHelper
import java.util.concurrent.CompletableFuture

class SlimeTimeBlockTags(
	output: PackOutput,
	lookupProvider: CompletableFuture<Provider>,
	existingFileHelper: ExistingFileHelper?
) : BlockTagsProvider(output, lookupProvider, SlimeTime.MODID, existingFileHelper) {

	override fun addTags(provider: Provider) {
	}
}