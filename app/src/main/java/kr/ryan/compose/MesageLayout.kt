package kr.ryan.compose

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Compose
 * Class: Mesage
 * Created by pyg10.
 * Created On 2022-05-31.
 * Description:
 */

@Preview(showBackground = true)
@Composable
fun Display(){
    Surface(modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background) {
        MakeMessageText(Message(0, "test", "Test2", false))
    }

}

@Composable
fun MakeMessageText(message: Message){
    Column(Modifier.padding(5.dp)) {
        Text(text = message.title)
        Text(text = message.comment, modifier = Modifier.size(13.dp))
    }
}