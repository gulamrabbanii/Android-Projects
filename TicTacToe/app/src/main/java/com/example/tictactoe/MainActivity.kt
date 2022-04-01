package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.children
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    // 0 - Cross, 1 - Circle
    var activePlayer = 0
    val gameState = arrayListOf(2, 2, 2, 2, 2, 2, 2, 2, 2)
    val winningPosition = listOf(
                            listOf(3, 4, 5),
                            listOf(6, 7, 8),
                            listOf(0, 3, 6),
                            listOf(1, 4, 7),
                            listOf(2, 5, 8),
                            listOf(0, 4, 8),
                            listOf(2, 4, 6)
    )
    var isGameActive = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun dropIn (view: View) {
        val slotImg = view as ImageView
        val tappedSlot = slotImg.tag.toString().toInt()
        if (gameState[tappedSlot] == 2 && isGameActive) {
            gameState[tappedSlot] = activePlayer
            Log.i("Game State", gameState.toString())

            slotImg.translationY = -2000f
            if (activePlayer == 0) {
                activePlayer = 1;
                slotImg.setImageResource(R.drawable.tic_tac_toe_x)
            } else {
                activePlayer = 0
                slotImg.setImageResource(R.drawable.tic_tac_toe_o)
            }
            slotImg.animate().translationYBy(2000f).rotation(1800f).setDuration(500)
            for (combo in winningPosition) {
                if (gameState[combo[0]] == gameState[combo[1]] &&
                        gameState[combo[1]] == gameState[combo[2]] &&
                        gameState[combo[0]] != 2) {
                    val winner = if (activePlayer == 1) "Crosses" else "Circles"
                    Toast.makeText(this, "$winner have won", Toast.LENGTH_SHORT).show()
                    isGameActive = false
                    val playAgainBtn = binding.button2
                    playAgainBtn.visibility = View.VISIBLE
                }
            }
        }
    }

    fun resetGame (view: View) {
        binding.button2.visibility = View.INVISIBLE
        for (tappedSlot in 0..8) { gameState[tappedSlot] = 2 }
        isGameActive = true
        binding.root.children.forEach {
            if (it !is Button) {
                val slot = it as ImageView
                if (slot.tag != null) {
                    slot.setImageDrawable(null)
                }
            }
        }
    }
}