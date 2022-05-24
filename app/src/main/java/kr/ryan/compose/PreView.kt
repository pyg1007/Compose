package kr.ryan.compose

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
        Greeting(name = listOf("ABC", "AAA").toTypedArray(), modifier = Modifier.padding(5.dp), orientation = 0)
    }
}