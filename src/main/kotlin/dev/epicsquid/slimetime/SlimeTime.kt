package dev.epicsquid.slimetime

import dev.epicsquid.slimetime.data.*
import dev.epicsquid.slimetime.registry.BlockRegistry
import dev.epicsquid.slimetime.registry.CreativeTabRegistry
import dev.epicsquid.slimetime.registry.ItemRegistry
import net.minecraft.data.loot.LootTableProvider
import net.minecraft.data.loot.LootTableProvider.SubProviderEntry
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets
import net.minecraftforge.data.event.GatherDataEvent
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(SlimeTime.MODID)
@Mod.EventBusSubscriber(modid = SlimeTime.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
object SlimeTime {
	const val MODID = "slimetime"

	init {
		val modEventBus = MOD_BUS

		BlockRegistry.REGISTRY.register(modEventBus)
		ItemRegistry.REGISTRY.register(modEventBus)
		CreativeTabRegistry.REGISTRY.register(modEventBus)
	}

	@SubscribeEvent
	fun gatherData(event: GatherDataEvent) {
		val generator = event.generator
		val packOutput = event.generator.packOutput
		val lookupProvider = event.lookupProvider
		val existingFileHelper = event.existingFileHelper

		generator.addProvider(event.includeClient(), SlimeTimeBlockStates(packOutput, existingFileHelper))
		generator.addProvider(event.includeClient(), SlimeTimeItemModels(packOutput, existingFileHelper))
		generator.addProvider(event.includeClient(), SlimeTimeLang(packOutput, "en_us"))

		val blockTagsProvider = SlimeTimeBlockTags(packOutput, lookupProvider, existingFileHelper)
		generator.addProvider(event.includeServer(), blockTagsProvider)
		generator.addProvider(
			event.includeServer(),
			SlimeTimeItemTags(packOutput, lookupProvider, blockTagsProvider, existingFileHelper)
		)
		generator.addProvider(event.includeServer(), SlimeTimeRecipes(packOutput))
		generator.addProvider(
			event.includeServer(),
			LootTableProvider(
				packOutput,
				emptySet(),
				listOf(SubProviderEntry(::SlimeTimeLootTables, LootContextParamSets.BLOCK))
			)
		)
	}
}