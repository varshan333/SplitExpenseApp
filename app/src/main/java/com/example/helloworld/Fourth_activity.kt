package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AlertDialog

class Fourth_Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.l41)

        val clearGrocery = findViewById<Button>(R.id.clearGrocery)
        val clearElectric = findViewById<Button>(R.id.clearElectric)

        // Grocery card parent
        val groceryCard = clearGrocery.parent as LinearLayout
        // Electric card parent
        val electricCard = clearElectric.parent as LinearLayout

        clearGrocery.setOnClickListener {
            showClearDialog("Grocery") {
                (groceryCard.parent as LinearLayout).removeView(groceryCard)
            }
        }

        clearElectric.setOnClickListener {
            showClearDialog("Electric Bill") {
                (electricCard.parent as LinearLayout).removeView(electricCard)
            }
        }
    }

    private fun showClearDialog(type: String, onConfirm: () -> Unit) {
        AlertDialog.Builder(this)
            .setTitle("Clear $type")
            .setMessage("Are you sure you want to clear this record?")
            .setPositiveButton("Yes") { dialog, _ ->
                onConfirm()
                dialog.dismiss()
            }
            .setNegativeButton("No") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}
