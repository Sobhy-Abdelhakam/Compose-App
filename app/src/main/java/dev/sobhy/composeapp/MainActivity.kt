package dev.sobhy.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Conversation(messages = SampleData.conversationSample)
                }
            }

        }
    }

//    @Composable
//    fun Calculator(){
//        var firstNumber = 0
//        var secondNumber = 0
//        var result = 0
//        Column {
//            TextField(value = "first number", onValueChange = {
//                firstNumber = it.toInt()
//            })
//        }
//    }

    @Composable
    fun Conversation(messages: List<Message>) {
        LazyColumn {
            items(messages) {
                MessageCard(msg = it)
            }
        }
    }

    @Composable
    fun MessageCard(msg: Message) {
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                painter = painterResource(id = msg.Image),
                contentDescription = "this is my picture",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))
            var isExpand: Boolean by remember {
                mutableStateOf(false)
            }

            Column(modifier = Modifier.clickable { isExpand = !isExpand }) {
                Text(
                    text = msg.author,
                    color = MaterialTheme.colorScheme.secondary,
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(4.dp))
                Surface(shape = MaterialTheme.shapes.medium, shadowElevation = 1.dp) {
                    Text(
                        text = msg.body,
                        modifier = Modifier.padding(4.dp),
                        style = MaterialTheme.typography.bodyLarge,
                        maxLines = if (isExpand) Int.MAX_VALUE else 1
                    )
                }

            }
        }


    }

    @Preview
    @Composable
    fun PreviewMessageCard() {
        MaterialTheme {
            Surface(modifier = Modifier.fillMaxSize()) {
                Conversation(messages = SampleData.conversationSample)
            }
        }
    }

}
