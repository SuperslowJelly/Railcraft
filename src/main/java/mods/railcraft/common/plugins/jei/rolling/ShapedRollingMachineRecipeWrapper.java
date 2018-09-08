package mods.railcraft.common.plugins.jei.rolling;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.ingredients.VanillaTypes;
import mezz.jei.api.recipe.IStackHelper;
import mods.railcraft.common.util.crafting.ShapedRollingMachineRecipe;

/**
 *
 */
public final class ShapedRollingMachineRecipeWrapper extends RollingMachineRecipeWrapper<ShapedRollingMachineRecipe> {

    private IStackHelper helper;

    public ShapedRollingMachineRecipeWrapper(ShapedRollingMachineRecipe recipe, IStackHelper helper) {
        super(recipe);
        this.helper = helper;
    }

    @Override
    public void getIngredients(IIngredients ingredients) {
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getSampleOutput());
        ingredients.setInputLists(VanillaTypes.ITEM, helper.expandRecipeItemStackInputs(recipe.getIngredients()));
    }
}
