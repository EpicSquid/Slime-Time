package dev.epicsquid.slimetime.registry

import dev.epicsquid.slimetime.SlimeTime
import net.minecraft.core.registries.Registries
import net.minecraftforge.registries.DeferredRegister

object BlockRegistry {

	val REGISTRY = DeferredRegister.create(Registries.BLOCK, SlimeTime.MODID)

}