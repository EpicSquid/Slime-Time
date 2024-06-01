package dev.epicsquid.cornmaze.data

import dev.epicsquid.cornmaze.SlimeTime
import dev.epicsquid.cornmaze.registry.BlockRegistry
import net.minecraft.data.loot.packs.VanillaBlockLoot
import net.minecraft.world.level.block.Block
import net.minecraftforge.registries.ForgeRegistries

class SlimeTimeLootTables : VanillaBlockLoot() {

	override fun generate() {
	}

	override fun getKnownBlocks(): MutableIterable<Block> =
		ForgeRegistries.BLOCKS.entries
			.filter { it.key.location().namespace == SlimeTime.MODID }
			.map { it.value }
			.toMutableList()
}