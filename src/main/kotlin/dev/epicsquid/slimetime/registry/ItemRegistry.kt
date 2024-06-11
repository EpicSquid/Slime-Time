package dev.epicsquid.slimetime.registry

import dev.epicsquid.slimetime.SlimeTime
import net.minecraft.core.registries.Registries
import net.minecraftforge.registries.DeferredRegister

object ItemRegistry {

	val REGISTRY = DeferredRegister.create(Registries.ITEM, SlimeTime.MODID)
}