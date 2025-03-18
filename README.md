# Compose

## 구성가능한 함수
- @Composable이라는 주석이 달린 일반 함수입니다. 이렇게 하면 함수가 내부에서 다른 @Composable 함수를 호출할 수 있습니다. Greeting 함수를 @Composable로 어떻게 표시하는지 확인할 수 있습니다.
```kotlin
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier){
  Text(
    text = "Hello $name",
    modifier = modifier
  )
}
```
