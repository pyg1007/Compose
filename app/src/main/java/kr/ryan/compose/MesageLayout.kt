package kr.ryan.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
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
fun Display() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        MakeMessageText(Message(0, "test", "Test2", false))
    }

}

@Composable
fun MakeMessageText(message: Message) {
    Row(Modifier.padding(5.dp)) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Message Profile",
            modifier = Modifier
                .size(40.dp)
                .clip(
                    CircleShape
                ).border(width = 4.dp, color = MaterialTheme.colors.secondary, shape = CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = message.title)
            
            Spacer(modifier = Modifier.height(4.dp))
            
            Text(text = message.comment, modifier = Modifier.size(13.dp))
        }
    }

}