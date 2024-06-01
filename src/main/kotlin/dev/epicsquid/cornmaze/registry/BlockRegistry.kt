package dev.epicsquid.cornmaze.registry

import dev.epicsquid.cornmaze.SlimeTime
import net.minecraft.core.registries.Registries
import net.minecraftforge.registries.DeferredRegister

object BlockRegistry {

	val REGISTRY = DeferredRegister.create(Registries.BLOCK, SlimeTime.MODID)

}