# SpringBoot를 이용한 Toy Project

## 목표

1. Spring Boot, Spring data JPA로 서버를 구성한다.
1. 템플릿 엔진으로 Thymeleaf를 사용한다.

## 주제

기본 기능의 회원제 게시판을 구현한다.

## 구현

### 서버

#### Server 사용기술

- Spring Boot
- Spring data JPA(Hibernate)
- MariaDB
- Spring Security

#### Server 제작 내용

완성됨

- 기본기능의 회원제 게시판 제작을 목표로 한다
- 댓글은 무한계층형으로 구현하고 삭제시 동일 노드의 게시물이 모두 삭제 되도록 만든다.
- 오픈소스 에디터를 적용한다.
- 게시물, 댓글 검색기능을 적용한다.
- 회원 가입시 유효성 검사는 client, server 모두에서 진행
- 스프링 시큐리티를 통해 가입, 로그인, 비밀번호 암호화등을 적용한다.

### Thymeleaf 클라이언트

템플릿엔진으로 기존에 사용해봤던 JSP 이외의 후보에서 선택한 Thymeleaf를 사용한다.

Spring boot starter thymeleaf는 ~~3버전이 아니어서 다소 문제가 발생했다. 따라서 기존 문법을 사용하였다.~~

thymeleaf를 3버전으로 변경하고 최신 문법을 적용하였다.

#### Thymeleaf 클라이언트 사용 기술

- Thymeleaf (Spring-boot-starter)
- [Materialize CSS](http://materializecss.com/)
- [Trumbowyg Editor](https://github.com/Alex-D/Trumbowyg)
