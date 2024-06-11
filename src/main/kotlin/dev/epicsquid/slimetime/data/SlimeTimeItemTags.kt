package dev.epicsquid.slimetime.data

import dev.epicsquid.slimetime.SlimeTime
import net.minecraft.core.HolderLookup.Provider
import net.minecraft.data.PackOutput
import net.minecraft.data.tags.ItemTagsProvider
import net.minecraftforge.common.data.BlockTagsProvider
import net.minecraftforge.common.data.ExistingFileHelper
import java.util.concurrent.CompletableFuture

class SlimeTimeItemTags(
	output: PackOutput,
	lookupProvider: CompletableFuture<Provider>,
	blockTags: BlockTagsProvider,
	existingFileHelper: ExistingFileHelper
) : ItemTagsProvider(output, lookupProvider, blockTags.contentsGetter(), SlimeTime.MODID, existingFileHelper) {

	companion object {
	}

	override fun addTags(pProvider: Provider) {
	}
}
