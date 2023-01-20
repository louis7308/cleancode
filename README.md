🤔클린코드 강의 노트

### 의미있는 이름

#### Clas Naming Guide
UpperCamelCase (대문자로 시작)

```markdown
// 클래스는 명사, 명사구
Character, ImmutableList

// 인터페이스는 명사, 명사구, (형용사)
List, Readable

// 테스트 클래스는 Test로 끝내기
HastTest, HastIntegrationTest
```

#### Method Naming Guide
LowerCamelCase (소문자로 시작)
```markdown
// 메서드는 동사, 동사구
sendMessage, stop

// jUnit 테스트에 underscore 사용되기도 함
// <methodUnderTest>_<state> 패턴
pop_emptyStack
```