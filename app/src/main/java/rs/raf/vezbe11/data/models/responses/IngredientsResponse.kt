package rs.raf.vezbe11.data.models.responses

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IngredientsResponse(
    val meals: List<IngredientResponse>
)
