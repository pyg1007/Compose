# Compose

## Introduce
  - 기존 xml을 사용하는 명령형 ui인 경우, xml과 class를 오가며 확인해야하는 불편함이 있습니다.
  - xml을 통해서 ui를 만든 후에 class에서 ui를 컨트롤 하게 되는데 이 과정에서 보일러플레이트 코드가 많이 생성되게 되고, 의도하지 않은 ui를 만들거나 실수로 ui를 잘못정의하는 경우도 있습니다.
  - 이러한 문제를 해결하기위해 나온것이 선언형 ui인 Compose입니다.

## Use
기존은 setContentView로 레이아웃을 연결해주었는데

```kotlin
class MainActivity : AppCompatActivity(){
  override fun onCreate(savedInstanceState: Bundle?){
      super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)
  }
}
```

Compose를 이용하게되면 아래와 같이 변화하였다.

```kotlin
class MainActivity : AppCompatActivity(){
  override fun onCreate(savedInstanceState: Bundle?){
      super.onCreate(savedInstanceState)
      setContent{
          
      }
  }
}
```

Surface를 이용하여 전체레이아웃의 옵션을 조정할 수 있습니다.
onClick, color, modifier 등등

Column : LinearLayout 의 orientation vertical
Row : LinearLayout 의 orientation horizontal
해당영억의 옵션들도 물론 조정할 수 있습니다.

TextView의 경우 Text("텍스트 내용")
Button의 경우 Button(){}, OutlinedButton(){}
ImageView의 경우 Image(painterResource(이미지))

continue
