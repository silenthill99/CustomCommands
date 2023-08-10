package fr.silenthill99.customcommands.data.recipes;

import fr.silenthill99.customcommands.data.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.*;
import net.minecraft.item.Items;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider
{
    public RecipeGenerator(DataGenerator p_i48262_1_)
    {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer)
    {
        ShapelessRecipeBuilder.shapeless(Items.EMERALD)
                .requires(ModItems.TEST.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.TEST.get()))
                .save(consumer);
    }
}
