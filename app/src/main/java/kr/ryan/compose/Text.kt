package kr.ryan.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Compose
 * Class: Text
 * Created by pyg10.
 * Created On 2022-05-24.
 * Description:
 */

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(text = name, modifier = modifier)
}

/*

    orientation
    0 : Column
    1 : Row

 */
@Composable
fun Greeting(vararg name: String, modifier: Modifier = Modifier, orientation: Int) {
    if (orientation == 0) {
        Column(modifier = modifier) {
            name.forEach {
                Text(text = it)
            }
        }
    } else {
        Row(modifier = modifier) {
            name.forEach {
                Text(text = it)
            }
        }
    }
}