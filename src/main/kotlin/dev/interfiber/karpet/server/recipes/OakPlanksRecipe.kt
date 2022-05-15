package dev.interfiber.karpet.server.recipes

import net.minestom.server.item.ItemStack
import net.minestom.server.item.Material

class OakPlanksRecipe : MinecraftRecipe() {
    init {
        this.recipeID = "oak_planks"
        this.items = listOf(
            ItemStack.of(Material.OAK_LOG, 1),
            ItemStack.AIR,
            ItemStack.AIR,
            ItemStack.AIR
        )
        this.result = ItemStack.of(Material.OAK_PLANKS, 4)
    }

    override fun canCraftInPortableCrafting(): Boolean {
        return true
    }
}