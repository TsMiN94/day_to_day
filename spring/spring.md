Spring framework
블로그에 먼저 포스팅할 예정


2019 - 8 - 26
지금 내가아는 SpringFramework란 ? 얼마나 아는지 서술해보자
스프링이란 개발자가 벡엔드 개발하는데 있어서 개발하기 용이하도록 정해져있는 구조를 따라서 개발할수 있도록 도와주는 틀이라고 생각한다. 
spring framework가 없이 개발을 할때는 개발자가 메소드를 콜하고 구조를 만들고 모든것을 개발해야 했다면 spring을 사용하면  inversion of control(제어의 역전) 이라는 개념이 나오는데 이것은 spring이 이미 벡엔드 개발하는데 용이한 구조를 가지고 있어 개발자는 그 구조에 맞춰서 business logic에만 집중할수 있다. spring을 사용하게 되면 개발자는 다양한 장점을 얻을 수 있는데 그중에서도 가장 중요한것은 Depandency injection이라고 생각한다. 개발하는 과정에서 생성자나 setter를 사용하여 직접적으로 연결하는것은 객체간의 결합도가 너무 강해지게 되고 이것은 후에 구성이 변경되거나 클래스가 변화할경우 코드를 수정해야하는 번거로움이 생긴다. 그러나 spring framework를 사용하면 이러한 객체간의 결합도를 느슨하게 해주어 코드를 수정해야하는 번거로움을 해결해줄뿐만 아니라 가독성 및 코드의 재사용성이 높아지는 장점이 있다. spring은 객체를 XML안의 bean태그의 정보를 토대로 생성하며 이것을 POJO(plain old java object)라 부른다. 이 작업은 spring container가 수행하며 bean들의 생성과 생명주기를 관리하고 그들의 결합도를 관리한다. 결합을 시키는데에는 annotation을 사용하며 4가지의 annotation을 사용한다. @Autowired, @Required, @Resource, @Qualifier가 있다. @Required는 value의 값을 주어 객체간의 연결을 시킨다. 이것은 연결시키기 위한 레퍼런스에 대한 setter가 구현되어 있어야하며 setter 메소드위에 @Required가 존재해야 한다. @Resource 와 @Qualifier는 @Autowired의 bean과 bean사이의 객체 연결에 있어서 모호함을 해결해주기 위한 추가적인 annotation이다. 
spring framework 는 또한 mvc model - view - controller 디자인패턴의 구조를 제공한다. 
