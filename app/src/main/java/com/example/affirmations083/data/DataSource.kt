package com.example.affirmations083.data

import com.example.affirmations083.R
import com.example.affirmations083.model.Affirmations


class DataSource {
    fun loadAffirmations(): List<Affirmations> {
        return listOf<Affirmations>(
            Affirmations(R.string.affirmation1, R.drawable.image_1,),
            Affirmations(R.string.affirmation2, R.drawable.image_2,),
            Affirmations(R.string.affirmation3, R.drawable.image_3,),
            Affirmations(R.string.affirmation4, R.drawable.image_4,),
            Affirmations(R.string.affirmation5, R.drawable.image_5,),
            Affirmations(R.string.affirmation6, R.drawable.image_6,),
            Affirmations(R.string.affirmation7, R.drawable.image_7,),
            Affirmations(R.string.affirmation8, R.drawable.image_8,),
            Affirmations(R.string.affirmation9, R.drawable.image_9,),
            Affirmations(R.string.affirmation10, R.drawable.image_10,)
        )
    }
}