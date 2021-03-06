## Java

## 2019-07-15 ~ 2019-07-22 <br>
<ul>
  *JDK에 대한 내용 정리 :heavy_check_mark: <br> 
  *Java에 특징 :heavy_check_mark:  <br>
  *Interface,abstract :heavy_check_mark: <br>
  *Hash :heavy_check_mark: <br> 
  *Session,Cookie :heavy_check_mark: <br> 
  *Process,Thread :heavy_check_mark:<br> 
</ul>



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
</ul>

#### HashCode , HashTable
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
이러한 이유는 String 클래스에 제공하는 hashCode()의 구현이 실제로 Object클래스의 hashCode()와는 다르게 재정의 하여 구현이 되어 있기 때문이다.
또한 다른 객체라 하더라도 hashCode값은 동일할 수 있는데 이렇기에 우리는 equals를 통해 false값이 나오더라도 hashCode의 값이 꼭 다를 필요가
없다는것을 알아야한다.<br><br>
</ul>
 
 
<ul>
● HashTable은 JRE1.0, JRE 1.1 버전의 어플리케이션에 대해서 하위 호완 지원을 위해서 사용되어지고 있다.

:question: HashCode로 얻어낸 key로 value를 저장하려고 하는데 같은 key값에 대해서 충돌은 어떻게 해결하나 ? <br>
<br>
 이 러한 문제는 Hash함수로 인해서 많은 메모리를 낭비하지 않기 위해서 필요한 원소의 M개 만큼의 배열만을 사용해서 value를 저장할 때 발생하게된다. <br> 
<pre>
 int index = hashCode("key") % M ;
</pre>

index는 같은 값이 나올 수 있게되고 이러한 문제는 Open Adressing , Seperate Chaining의 기법으로 해결할 수 있다.<br>
 *Open Addressing 이란 같은 index가 나왔을경우 그 다음 index에 저장하는 방식이다. 이러한 방법은 데이터가 적을 경우 효율적이다. 데이터가 많게 되면 캐쉬 적중률 (hit ratio)가 낮아지기 때문이다. 또한 데이터가 많으면 삭제를 할경우 처리하기가 까다롭기 때문에 데이터가 적은 경우 사용한것이 적절한 방법이다. <br>
 *Seperate Chaining 이란 인덱스가 겹칠경우 해당 연결리스트를 이용하여 노드를 하나 더 만들어 인덱스가 다음 포인터의 주소값을 가지게 됨으로써 index가 겹치는 문제를 해결할 수 있다. 또한 삭제할 경우 그 처리가 간단하다는 점이 있다. 그러나 이 방법 역시도 하나의 인덱스에 데이터가 밀집 될 경우가 있어 그경우에는 트리로 구현하는 것이 더 좋다고 한다.
 <br>
<hr/>


참고 :[네이버 D2](https://d2.naver.com/helloworld/831311)

#### Session , Cookie
<ul>
● Session , Cookie 모두 클라이언트가 요청했던 이전의 웹 캐시에 대한 정보를 가지고 있다. 그러나 Session은 서버측에서 캐시를 가지고 있고 Cookie는클라이언트가 가지고 있다. 보안성은 당연히 서버쪽에서 가지고 있는 Session이 보안성이 더 좋지만 많은 클라이언트의 캐시를 서버측에서 가지고 있게 된다면 서버의 많은 용량이 필요로 하게된다. Cookie는 클라이언트 하드에 텍스트로 저장되어 캐시를 보관하여 클라이언트의 웹방문기록을 남기는 역할을 한다.
  <br><br>
</ul>

#### Process , Thread
<ul>
● Process 
  * 정의: 프로그램이 메모리에 적재되면 Process라고 하며, 하나 이상의 Thread를 가지고 있고 Thread 단위로 스케쥴링을 하여 작업을 한다. 프로세스끼리 메모리 공유를 하기 위해선 4가지 방법이 있다. (운영체제 분야에서 다루겠음) <br> 
  * 구성: code영역, data영영, heap영역, stack영역으로 구성되어 있다.<br>
<br><br>
● Thread 
  *정의: 프로세스 내에는 적어도 하나이상의 Thread가 존재하며 서로 메모리공유를 할 수 있다. <br>
  *관리: 하나의 자원에 대해서 다수의 스레드가 동시적으로 접근할 경우 Synchronized를 해주어 동기화를 시켜주어야 한다.
  <br><br>
  
</ul>


