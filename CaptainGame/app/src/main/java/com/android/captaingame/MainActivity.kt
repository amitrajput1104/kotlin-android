package com.android.captaingame

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaptainGameTheme {
                //a surface container using the background color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()
                }
            }
        }
    }
    @SuppressLint("AutoboxingStateCreation")
    @Composable
    fun CaptainGame(){
        val treasureFound= remember {mutableStateOf(0)}
        val direction= remember { mutableStateOf("North") }
        val stormOrTreasure= remember { mutableStateOf("") }

        Column {
            Text(text = "Treasure Found: ${treasureFound.value}")
            Text(text = "Current Direction: ${direction.value}")
            Text(text = stormOrTreasure.value)
            Button(onClick = { direction.value="East"
                    if(Random.nextBoolean()){
                        treasureFound.value +=1
                        stormOrTreasure.value="Found a Treasure!!"
                    }
                    else{
                        stormOrTreasure.value="Storm Ahead!"
                    }
            }) {
                Text(text = "Sail East")
            }
            Button(onClick = { direction.value="West"
                if(Random.nextBoolean()){
                    treasureFound.value +=1
                    stormOrTreasure.value="Found a Treasure!!"
                }
                else{
                    stormOrTreasure.value="Storm Ahead!"
                }
            }) {
                Text(text = "Sail West")
            }
            Button(onClick = { direction.value="North"
                if(Random.nextBoolean()){
                    treasureFound.value +=1
                    stormOrTreasure.value="Found a Treasure!!"
                }
                else{
                    stormOrTreasure.value="Storm Ahead!"
                }
            }) {
                Text(text = "Sail North")
            }
            Button(onClick = { direction.value="South"
                if(Random.nextBoolean()){
                    treasureFound.value +=1
                    stormOrTreasure.value="Found a Treasure!!"
                }
                else{
                    stormOrTreasure.value="Storm Ahead!"
                }
            }) {
                Text(text = "Sail South")
            }
        }
    }
}

