package com.mandychev.foodfacts.vo

import com.google.gson.annotations.SerializedName

data class Images(
    @SerializedName("1") val x1: X1?,
    @SerializedName("10") val x10: X10?,
    @SerializedName("11") val x11: X11?,
    @SerializedName("12") val x12: X12?,
    @SerializedName("13") val x13: X13?,
    @SerializedName("14") val x14: X14?,
    @SerializedName("15") val x15: X15?,
    @SerializedName("16") val x16: X16?,
    @SerializedName("17") val x17: X17?,
    @SerializedName("18") val x18: X18?,
    @SerializedName("2") val x2: X2?,
    @SerializedName("3") val x3: X3?,
    @SerializedName("4") val x4: X4?,
    @SerializedName("5") val x5: X5?,
    @SerializedName("front_fr") val frontFr: FrontFr?,
    @SerializedName("ingredients_fr") val ingredientsFr: IngredientsFr?,
    @SerializedName("nutrition_fr") val nutritionFr: NutritionFr?
)