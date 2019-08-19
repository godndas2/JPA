# JPA
https://medium.com/@SlackBeck/스프링-부트-auto-configuration과-jpa-하이버네이트-sql문-로깅-424de95ed171
[postman ] https://velog.io/@junwoo4690/Spring-Boot-JPA-%EC%82%AC%EC%9A%A9%ED%95%B4%EB%B3%B4%EA%B8%B0-erjpw41nl7  
[참고]https://victorydntmd.tistory.com/207
## 19-08-07
- @OneToOne관계, @OneToMany, @ManyToOne 등.. +) 안에 option들을 봐야함
## 19-08-09
- attach 
## 19-08-10
- jpa crud ( Criteria 사용 )
## 19-08-13  
- 관계 매핑, @Join해서 데이터처리 postman  
## 19-08-19
- <JPA 기본 페치 전략>

- @ManyToOne, @OneToOne: 즉시로딩(FetchType.EAGER)  

- @OneToMany, @ManyToMany : 지연로딩(FetchType.LAZY)  
 > JPA의 기본페지전략은 연관된 엔티티가 하나면 즉시로딩을 컬렉션이면 지연로딩을 사용한다. 그이유는 컬렉션은 즉시로딩시 비용이 많이 들고 많은 데이터를 로딩할 수도 있기 때문이다. 책에서 추천하는 방법은 모든 연관관계를 지연로딩으로 구현하고 애플리케이션 개발이 어느정도 완료단계에 왔을 때 사용처를 보고 필요한 곳에만 즉시로딩을 사용하도록 최적화하라라라고 적혀있다.  
### <정리>

무조건적으로 즉시로딩이 좋다, 지연로딩이 좋다라고는 말하지 못한다.

상황에 따라 즉시로딩이 효율적일 수도 있고 지연로딩이 효율적일 수도 있다.

연관된 두 엔티티를 무조건 같이 사용되어 진다면 즉시로딩이 좋고 상황에 따라 다르다면 지연로딩이 좋다.

 > <i>studybootjpa Repositroy에서 Lv3 시작 </i>
