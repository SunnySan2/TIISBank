package com.tiis.tiisbank

import android.content.Intent
import com.tiis.tiisbank.internal.BaseEntryChoiceActivity
import com.tiis.tiisbank.internal.Choice
import com.google.android.gms.common.util.CollectionUtils.listOf

class EntryChoiceActivity : BaseEntryChoiceActivity() {

    override fun getChoices(): List<Choice> {
        return listOf(
                Choice(
                        "Java",
                        "Run the Firebase ML Kit quickstart written in Java.",
                        Intent(this,
                                com.tiis.tiisbank.ChooserActivity::class.java)),
                Choice(
                        "Kotlin",
                        "Run the Firebase ML Kit quickstart written in Kotlin.",
                        Intent(
                                this,
                                com.google.firebase.samples.apps.mlkit.kotlin.ChooserActivity::class.java))
        )
    }
}
