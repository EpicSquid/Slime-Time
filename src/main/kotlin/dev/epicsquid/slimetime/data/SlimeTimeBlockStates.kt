package dev.epicsquid.slimetime.data

import dev.epicsquid.slimetime.SlimeTime
import net.minecraft.data.PackOutput
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Block
import net.minecraftforge.client.model.generators.BlockStateProvider
import net.minecraftforge.common.data.ExistingFileHelper
import net.minecraftforge.registries.ForgeRegistries

class SlimeTimeBlockStates(
	output: PackOutput,
	exFileHelper: ExistingFileHelper
) : BlockStateProvider(output, SlimeTime.MODID, exFileHelper) {

	override fun registerStatesAndModels() {

	}
}

val Block.resourceLocation: ResourceLocation
	get() = ForgeRegistries.BLOCKS.getKey(this) ?: throw IllegalStateException("Block $this is not registered")