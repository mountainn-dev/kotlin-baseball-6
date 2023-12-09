# 미션 - 숫자 야구
일정한 규칙에 따라 임의로 생성된 숫자에 대해 자리와 값을 모두 맞추는 게임입니다.

## 기능 목록
- [x] 컴퓨터의 Ball 을 생성한다.
  - [x] 1부터 9까지 서로 다른 임의의 수 3 개로 이루어진 Ball 이 생성된다. - BaseballGameController#setBall()
- [ ] 사용자의 Ball 을 생성한다.
  - [ ] 사용자로부터 Ball 생성을 위한 수를 입력받는다.
  - [ ] 값이 올바르지 않은 형태일 경우 예외가 발생하고 프로그램이 종료된다.
- [ ] 사용자의 수와 컴퓨터의 수를 비교한다.
- [ ] 게임을 종료한다.

## 기능 요구 사항
- 숫자의 자리와 값이 모두 일치하면 스트라이크, 값만 일치하면 볼, 아무것도 일치하지 않으면 낫싱이다.
- 3 스트라이크가 발생할 때까지 게임을 진행한다.
- 3 스트라이크가 발생하면 게임은 종료되고, 사용자가 게임 재시작 여부를 결정할 수 있다.(1 = 재시작, 2 = 종료)

## 예외 상황
사용자가 잘못된 형태의 값을 입력한 경우 IllegalArgumentException 이 발생하고 프로그램이 종료된다.

- 사용자 입력
  - 공통
    - 입력값이 공백인 경우
    - 입력값에 숫자가 아닌 값이 포함된 경우
  - 숫자 맞추기
    - 숫자의 개수가 3 개가 아닌 경우
    - 1 부터 9 사이의 수가 아닌 경우
    - 서로 다른 수가 아닌 경우
  - 재시작 여부
    - 1, 2 이외의 수를 입력한 경우