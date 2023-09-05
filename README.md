[![Since](https://img.shields.io/badge/since-2023.08.31-333333.svg?style=flat-square)](https://github.com/Brem0827/Tech-Stack)
[![author](https://img.shields.io/badge/author-Brem0827-0066FF.svg?style=flat-square)](https://github.com/Brem0827/Tech-Stack)
[![All Contributors](https://img.shields.io/badge/all_contributors-2-orange.svg?style=flat-square)](#Tech-Stack)

[![Watch on GitHub](https://img.shields.io/github/watchers/Brem0827/Tech-Stack.svg?style=social)](https://github.com/Brem0827/Tech-Stack/watchers)
[![Star on GitHub](https://img.shields.io/github/stars/Brem0827/Tech-Stack.svg?style=social)](https://github.com/Brem0827/Tech-Stack/stargazers)
[![Fork on GitHub](https://img.shields.io/github/forks/Brem0827/Tech-Stack.svg?style=social)](https://github.com/Brem0827/Tech-Stack/network/members)

# 🏃Spring
📔 201930324 이현종

<table align="center">
    <tr>
        <td align="center">
	    <a href="https://github.com/Brem0827">
	    	<img src="https://avatars.githubusercontent.com/u/62270266?v=4?s=100" width="100px;" alt=""/>
				<br/>
					<sub>
					<b>이현종</b>
				<br/>
	    	<img src="https://us-central1-progress-markdown.cloudfunctions.net/progress/100"/>
	        </sub>
	    </a>
	</td>
    </tr>
</table>

💕 주차
---
1. 💭[1주차](#1주차)➡️
1. 💭[2주차](#2주차)➡️

---

# 2주차

🔋 2023.09.05

- 월드 와이드 웹
* 영국의 컴퓨터 과학자 팀 버너스리가 고안한 하이퍼텍스트는 인터넷 공간에 존재하는 문서와 문서를 클릭만으로 쉽게 이동할 수 있는 것을 의미

- 웹 서버와 웹 애플리케이션 서버
* 웹 애플리케이션을 만들기 위해서는 서버를 구성해야 합니다.
* 일반적으로 서버는 웹 서버와 웹 애플리케이션 서버로 구분됩니다.

- 클라이언트
* 서버에 서비스를 요청하고 서비스를 제공받는 쪽을 클라이언트 라고합니다.
* 대표적인 클라이언트로는 브라우저가 있습니다.

- 웹 프로그래밍 언어의 종류와 특징
## ASP
* ASP는 윈도우의 IIS 웹 서버에서 실행될 수 있는 웹 프로그래밍 언어를 말하는데 VBScript를 이용한 비교적 쉬운 스크립트 언어입니다.
* 과거에 만들어진 웹 프로그램의 유지 보수가 아니라면, ASP를 이용한 신규 개발은 진행되지 않습니다.

## PHP
* PHP는 C를 기반으로 만들어진 웹 프로그래밍 언어로 빠른 실행 속도와 입문자가 배우기 쉽다는 장점이 있습니다.
* 하지만 대규모 시스템을 개발하기에 적합하지 않다는 단점이 일반적인 의견입니다.
* ASP와는 달리 지속적인 지원이 이루어 지고 있으며, 최근에는 PHP 8.x로 업그레이드 되었습니다.

## JSP
* JSP는 자바기반으로 만들어졌으며 컴파일 이후 서블릿으로 변환되어 서버에서 동적으로 작동합니다.
* 서블릿으로 변환된 JSP는 사용자의 요청을 스레드를 이용해 처리하기 때문에 서버 부하에 대한 걱정이 없어 효율적인 웹 서비스를 제공할 수 있습니다.
* 일반적인 JSP 웹 개발자는 서블릿과 JSP 모두를 다룰 수 있어야 하며, JSP는 주로 뷰를 만들기 위해 사용합니다.

- model1 아키텍쳐
* model1은 JSP와 자바빈즈를 이용해서 웹 애플리케이션을 개발하는 방법입니다.
* model1은 다양한 파일을 만들지 않고도 HTML 기반의 JSP와 자바빈즈만을 만들어 개발하기 때문에 개발 속도가 model2에 비해서 비교적 빠른 편이고, 개발 초기에는 개발자의 스트레스를 줄일 수 있다는 장점이 있습니다.
* 하지만 model1은 클라이언트의 요청을 처리하는 컨트롤러와 클라이언트에 응답하기 위한 뷰 코드가 JSP에 섞여있어 유지 보수가 어렵습니다.

- model2 아키텍쳐
* model2는 model1의 업그레이드된 버전이라고 할 수 있습니다.
* model2는 각각의 기능을 모듈화 하여 기능에 따른 코드를 명확하게 분리하는 방법입니다.
* model2는 웹 애플리케이션을 구현하는데 가장 많이 사용되는 방법으로, 클라이언트의 요총을 처리하는 컨트롤러와 클라이언트에 응답하기 위한 뷰를 분리해서 유지 보수가 쉽습니다.

- 비즈니스로직
* 비즈니스 로직이란 클라이언트의 특정 요청에 대해 우베 애플리케이션이 처리해야 하는 업무를 말합니다.

- 프레젠테이션 로직
* 프레젠테이션 로직은 클라이언트 화면에 비즈니스 로직의 결과를 보여주기 위한 화면 구성입니다.

- MVC의 개념
* MVC는 모델, 뷰, 컨트롤러를 이용해서 프로그래밍 하는 소프트웨어 설계 방법입니다.
* 이를 MVC 디자인 패턴이라고 합니다.
* 모델은 데이터베이스와 밀접한 관계를 갖고 비즈니스 로직을 담당합니다.
* 뷰는 클라이언트와 밀접한 관계를 갖고 비즈니스 로직의 결과를 출력하기 위한 화면 구성을 담당합니다.
* 컨트롤러는 클라이언트의 요청에 대해 모델과 뷰를 컨트롤하는 업무를 담당합니다.
* MVC는 웹 프로그래밍에만 사용되는 것이 아닌 프로그램 전반에 사용됩니다.
* 유지 보수 시점에서도 MVC 패턴의 구조로 구축되어 있기 때문에 새로운 개발자는 모델, 뷰, 컨트롤러 각각의 모듈을 찾아가며 전체적인 구조를 파악하기 수월합니다.

- 스프링 MVC의 개념 및 흐름
## 1단계

### 클라이언트의 요청
- 클라이언트의 요청이 최초 발생합니다.
- 대부분의 클라이언트 요청은 브라우저를 통해서 이루어집니다.
- 요청이 발생하면 스프링 MVC 프레임워크의 DispatcherServlet이 요청을 받습니다.

### DispatcherServlet


- 스프링 프레임워크의 개념
- 스프링 모듈
- 스프링 개발 환경 구축
`https://www.oracle.com/kr/index.html`
`https://www.eclipse.org/`
- 계산기 프로젝트
- 계산기 프로젝트를 DI 방식으로 변경
- 계산기 프로젝트를 IoC 방식으로 변경

---

# 1주차

🔋 2023.08.29

- 오리엔테이션
- simple_bbs 과제
