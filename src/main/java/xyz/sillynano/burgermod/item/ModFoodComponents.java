package xyz.sillynano.burgermod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent BURGER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200), 0.15f).build();

    public static final FoodComponent RAW_BURGER = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200), 0.5f).build();
}
