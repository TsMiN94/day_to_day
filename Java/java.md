## Java

### 0715

#### JDK,JRE,JVM
<ul>
●JDK : Java Development Kit 의 약자로 Java 프로그램 개발의 필요한 도구와 JRE를 포함하고 있다. <br><br>
●JRE : Java Runtime Environment 의 약자로 JVM의 실행환경을 구현해 두었다. <br><br>
●JVM : Java Virtual Machine의 약자로 스택기반의 가상머신이다. Java 어플리케이션은 JVM의 Class Loader가
읽어 들여 Java API와 함께 실행하는 것이다. JVM은 Java와 OS 사이의 중개자역할을 하여 OS환경에 구애 받지 않고
Java 어플리케이션을 실행 시킬 수 있다. <br><br>
</ul>
#### Java의 특징
<ul>
●객체 지향 기법 : 부품을 하나하나 객체로 관리하여 이 객체를 서로 연결시켜 하나의 프로그램을 만드는 기법이다.
객체 지향 언어에서 가져야 할 캡슐화, 다형성, 상속을 모두 지원한다.<br><br>

●메모리 관리가 용이 : JVM에는 Garbage Collector라는 Demon Thread가 존재하는데 이것이 스스로 메모리에 있는 객체를
다시 반환하는 역할을 해준다. <br><br>

●쉽게 구현 가능한 Multi Thread : Java에서는 Multi Thread를 다룰 수 있는 메소드들이 있기 때문에 Multi Thread를
지원하지 않는 OS에서도 구현을 할 수 있다. <br><br>

●풍부한 Open Source Library : 오픈소스 언어인 Java는 Open Source Libraray를 사용함으로써 개발 시간 단축과 안정성 높은 프로그램을
개발할 수 있다.<br><br>


</ul>

#### Interface , Absract Class
<ul>
●Interface : 상수와 추상메소드로 구성되어야 하고 선언된 메소드는 모두 추상메소드로 abstract를 생략 가능하다. 구현한 클래스에서는
선언된 메소드를 모두 구현해주어야한다. 다중 상속이 가능하며 사용하는 이유는 구현한 클래스의 객체들이 모두 인터페이스에서 선언한
기능을 약속하기 위해서 사용합니다.

●Abstract class : 추상 메소드를 하나 이상 가지고 있다면 추상클래스이다. 미완성 클래스이기 때문에 instance를 만들 수 없다.
상속받은 자식클래스에 추상메소드를 구현해야만 한다.


#### HashCode와 그 의미
<ul>
● HashCode는 객체의 고유한 정숫값을 말한다. 객체를 비교할 때 우리는 equals()를 사용하여 객체를 비교하는데 이 때 HashCode를
보고 비교하게 된다. 그렇지만 String 클래스에서는 조금 다르다. HashCode는 객체마다 고유한 정숫값을 가지고 있다고 했지만 실제로
<br><br>
<pre>
String a = "Java";
String b= new String("Java");
</pre><br>
이 객체는 서로다른 객체이므로 고유한 정숫값을 가져야하는게 맞지만 실제로는 해쉬코드 값은 같은 값을 보여주게 된다.
<pre>
a.hashCode() = 3254818
b.hashCode() = 3254818
</pre>
이러한 이유는 String 클래스에 제공하는 hashCode()의 형식이 실제로 Object클래스의 hashCode 와는 다르게 재정의 하여 구현이 되어 있기 때문이다.
또한 다른 객체라 하더라도 hashCode값은 동일할 수 있는데 이렇기에 우리는 equals를 통해 false값이 나오더라도 hashCode의 값이 꼭 다를 필요가
없다는것을 알아야한다.<br><br>
</ul>
