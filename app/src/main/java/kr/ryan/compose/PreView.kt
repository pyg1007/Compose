package kr.ryan.compose

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.ryan.compose.ui.theme.ComposeTheme

/**
 * Compose
 * Class: PreView
 * Created by pyg10.
 * Created On 2022-05-24.
 * Description:
 */


@Preview(showBackground = true)
@Composable
fun DisplayPreView() {
    /*

        텍스트 행과 열을 정할 때에는
        Column, Row 을 이용.

    */
    ComposeTheme {
        CreateButton()
    }
}

@Composable
fun CreateButton() {
    
    val context = LocalContext.current
    
    Surface(color = MaterialTheme.colors.primary) {
        OutlinedButton(onClick = {
            context.showToast("Click")
        }) {
            Greeting(name = "Button")
        }
    }
}

fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}